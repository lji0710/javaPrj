import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class LottoProgram4 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		// 컬렉팅 하기 위한변수들과 함께 저장소 변수 선언
		int[][] lottos = new int[10][6];
		int current = -1;
		

		breakMain :
		while(true)
		{

			
			int menu;
			System.out.println(" Lotto 메인 메뉴");
			System.out.println(" 1. 번호 목록");
			System.out.println(" 2. 번호 읽기");
			System.out.println(" 3. 번호 저장");
			System.out.println(" 4. 종료");
			System.out.print(" 선택  > ");
			menu = scan.nextInt();
			
			breakSubMain:
			switch(menu)
			{
			case 1:
			{
				while(true)
				{
					System.out.println("번호 목록 ----------------");
					// 목록 출력 코드를 작성
					for(int i=0; i<lottos.length; i++)
					{
						int[] lotto = lottos[i];
						if(lottos[i][0] != 0) 
						System.out.printf("%2d: %2d %2d %2d %2d %2d %2d\n", i+1, lotto[0],lotto[1],lotto[2],lotto[3],lotto[4],lotto[5]);
					}
					System.out.println("-------------------------");
					System.out.println(" 1. 번호 자동");
					System.out.println(" 2. 번호 선택");
					System.out.println(" 3. 상위 메뉴");
					System.out.print(" 선택  > ");
					int subMenu = scan.nextInt();
					
					switch(subMenu)
					{
					case 1:
						Random rand = new Random();
						int[] lotto = new int[6];
					
						// 초기 번호 생성
						for(int i=0; i<6; i++)
							lotto[i]= rand.nextInt(45)+1;
						
						// 번호 중복 검사
						for(int i=0; i<6; i++)
						{
							for(int j=0; j<6; j++)
								{
									if(i != j  && lotto[i]==lotto[j])
										lotto[i] = rand.nextInt(45)+1;
								}
						}
					
						//정렬하기
						int  temp;
						for(int i=0; i<5; i++)
						{
							for(int j=0; j<5-i; j++)
							{
								if(lotto[j] > lotto[j+1])
								{
									temp = lotto[j];	
									lotto[j]=lotto[j+1];
									lotto[j+1]=temp;
								}
								
							}
						}
							
						// lotto에 있는 값을 lottos로 옮기는 작업
						current++;
						for(int i=0; i<6; i++)
							lottos[current][i] = lotto[i]; 
						
						break;
					case 2:
						// lotto 수동 입력
						System.out.println("로또 번호를 입력 하세요.");
						System.out.print(" 입력(1 sp 2 sp 3 sp 4 sp 5 sp 6) > ");
						scan.nextLine();
						String choice = scan.nextLine();
						// 입력 값 분할
						String[] choiceNo = choice.split(" ");
						
						// 자료형 변환 및 배열 저장
						current++;
						for(int i=0; i<choiceNo.length; i++)
							lottos[current][i] = Integer.parseInt(choiceNo[i]);
						break;
					case 3:
						break breakSubMain;
					}
				} 
				
			}
			
			case 2:
			{	
				FileInputStream fis = new FileInputStream("res/lotto/lottos.txt");
				
				int count = fis.read();
				//int[] lotto = new int[6];
				current = -1;
				
/*				for(int i = 0; i<= count; i++)
				{
					current++;	
					for(int n=0; n<6; n++)
					{
						lottos[current][n] = fis.read();
					}
				}*/
				
				for(int i = 0; i<= count; i++)
				{
					int[] lotto = lottos[i];
					for(int n=0; n<6; n++)
					{
						lotto[n] = fis.read();
					}
					current++;
				}	
				fis.close();
			}	
				break;
			case 3:
				// 숫자로 파일 저장
			{
				FileOutputStream fos = new FileOutputStream("res/lotto/lottos.txt");
				fos.write(current);
				for(int i=0; i<lottos.length; i++)
				{
					
					int[] lotto = lottos[i];
					for(int n=0; n<6; n++) 
						fos.write(lotto[n]);
				}
				
				
				fos.close();
				
			}	
				
				
				
				
				// 문자로 파일 저장
/*				FileOutputStream fos = new FileOutputStream("res/lotto/lottos.txt");
				PrintStream pfos = new PrintStream(fos);
				
				for(int i=0; i<lottos.length; i++)
				{
					int[] lotto = lottos[i];
					if(lottos[i][0] != 0) 
					pfos.printf("%2d: %2d %2d %2d %2d %2d %2d\r\n", i+1, lotto[0],lotto[1],lotto[2],lotto[3],lotto[4],lotto[5]);
				}
				
				pfos.close();
				fos.close();*/
				
				
				break;
			case 4:
				break breakMain;

			
			}
		}

	}

}
