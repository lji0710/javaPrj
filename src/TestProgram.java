import java.util.Scanner;

public class TestProgram {

	public static void main(String[] args) {
		
		
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		int menu = 0;
		int yesno = 0;
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		
		break1:
		while(run)		
		{
			System.out.println("┌──────────────────┐");
			System.out.println("│  합을 구하는 프로그램       │");
			System.out.println("└──────────────────┘");
			System.out.println("1. 값 입력");
			System.out.println("2. 결과보기");
			System.out.println("3. 도움말");
			System.out.println("4. 종료");
			System.out.print("선택 > ");
			menu = scan.nextInt();
			
			break2: 
			switch(menu)
			{
				case 1:
				{
					while(run)
					{
						System.out.println("┌──────────────────┐");
						System.out.println("│      값 입력                 │");
						System.out.println("└──────────────────┘");
						System.out.println("n1 ~ n2 까지의 합을 구합니다.");
						System.out.println("시작 수와 끝 수를 입력하세요.");
						System.out.print("시작 sp 끝 >");
						num1 = scan.nextInt();
						num2 = scan.nextInt();
						while(run)
						{
							System.out.print("상위메뉴 - 1\n재 입력 - 2\n선택 >");
							yesno = scan.nextInt();
							if(yesno == 1)
								break break2;
							else if(yesno == 2)
								break;
							else
								System.out.println("1 or 2 에서 선택하세요.");
						}
					}
					break;
				}
				case 2:
				{
					System.out.println("┌──────────────────┐");
					System.out.println("│      결과  보기             │");
					System.out.println("└──────────────────┘");
					/*for(int i=num1; i <=num2; i++)
						sum += num1;*/
					sum = ((num2-num1+1)*(num1+num2))/2;
					System.out.println(num1 + "부터 " + num2 + "까지의 합 > " + sum);
					while(run)
					{
						System.out.print("상위메뉴 - 1\n선택 >");
						yesno = scan.nextInt();
						if(yesno == 1)
							break break2;
						else
							System.out.println("상위 메뉴로 가려면 1을 선택하세요.");
					}
					break;
				}
				case 3:
				{
					System.out.printf("시작 값 =>[%d]\n", num1);
					for(int i=num1+1; i<num2; i++)
						System.out.println("\t"+i);
					System.out.printf("   끝 값 =>[%d]\n", num2);
					System.out.printf("결과값 => %d", num1);
					for(int i=num1+1; i<num2; i++)
						System.out.printf(" + %d", i);
					System.out.printf(" + %d = %d\n", num2, sum);
					break;
				}
				case 4: 
				{
					System.out.println("프로그램 종료");
					break break1;
				}
				default:
					System.out.println("선택 메뉴는 1~4번까지 입니다.");
					break;
			}
		}
	}
}
