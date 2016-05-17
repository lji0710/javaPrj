import java.util.Scanner;

public class OmokProgram {

	public static void main(String[] args) {
		
		for(int i=0; i<20; i++)
		{
			for(int j=0; j<20; j++)
			{
				if(i==0) 
					if(j==0)
						System.out.printf("%c", '┌');
					else if(j==19)
						System.out.printf("%c", '┐');
					else
						System.out.printf("%c", '┬');
				else if(i==19)
					if(j==0)
						System.out.printf("%c", '└');
					else if(j==19)
						System.out.printf("%c", '┘');
					else
						System.out.printf("%c", '┴');
				else
					if(j==0)
						System.out.printf("%c", '├');
					else if(j==19)
						System.out.printf("%c", '┤');
					else
						System.out.printf("%c", '┼');
			}
			System.out.println();
		}
				
		// 사용자에게 오목 좌표 하나를 입력 받는다.
		Scanner scan = new Scanner(System.in);
		int x = 0;
		int y = 0;
		
		do
		{
			System.out.println("돌을 둘 좌표를 입력하세요.");
			System.out.print("가로열(1~20) ps 세로열(1~20) >");
			x = scan.nextInt();
			y = scan.nextInt();
			if(!((0<=x && x<=20) && (0<=y && y<=20)))
				System.out.println("값의 범위를 벗어났습니다. 다시 입력해주세요");
			
		}
		while(!((0<=x && x<=20) && (0<=y && y<=20)));
		
		for(int i=0; i<20; i++)
		{
			for(int j=0; j<20; j++)
			{
				if(i==y-1 && j==x-1)
					System.out.printf("%c", '○');
				else if(i==0) 
					if(j==0)
						System.out.printf("%c", '┌');
					else if(j==19)
						System.out.printf("%c", '┐');
					else
						System.out.printf("%c", '┬');
				else if(i==19)
					if(j==0)
						System.out.printf("%c", '└');
					else if(j==19)
						System.out.printf("%c", '┘');
					else
						System.out.printf("%c", '┴');
				else
					if(j==0)
						System.out.printf("%c", '├');
					else if(j==19)
						System.out.printf("%c", '┤');
					else
						System.out.printf("%c", '┼');
			}
			System.out.println();
		}
	}

}
