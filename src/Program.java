import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		float avg = 0;
		int menu = 0;

		/*kor = 61;
		eng = 75;
		math = 88;*/
		break1:
		while(true)
		{
			System.out.println("┌──────────────────┐");
			System.out.println("│      메인 메뉴              │");
			System.out.println("└──────────────────┘");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 종료");
			System.out.print("선택 > ");
			menu = scan.nextInt();

			if(menu == 1)
			{
				System.out.println("┌──────────────────┐");
				System.out.println("│      성적  입력             │");
				System.out.println("└──────────────────┘");
				System.out.printf(" 국어 : ");
				kor = scan.nextInt();
				System.out.printf(" 영어 : ");
				eng = scan.nextInt();
				System.out.printf(" 수학 : ");
				math = scan.nextInt();
			}			
			else if(menu == 2 )
			{				
				total = kor + eng + math;
				avg = (float) (total / 3.0);			
				
				System.out.println("┌──────────────────┐");
				System.out.println("│      성적  출력             │");
				System.out.println("└──────────────────┘");
				for(int i=0; i<3; i++)
				{
					System.out.printf(" 번호 : %5d\n", i+1);
					System.out.printf(" 국어 : %5d\n", kor);
					System.out.printf(" 영어 : %5d\n", eng);
					System.out.printf(" 수학 : %5d\n", math);
					System.out.printf(" 총점 : %5d\n", total);
					System.out.printf(" 평균 : %8.2f\n", avg);
					System.out.println("────────────────────");
				}
			}
			else if(menu == 3)
			{
				System.out.println("안녕~~ 잘가~~");
				break break1;
			}
			else
			{
				System.out.println("잘 보고 골라라잉");
			}
			
			
			
		}
				
		
		
		
		/*System.out.println("┌─────────────────────────────┐");
		System.out.println("│           성적  출력                         │");
		System.out.println("├────┬────┬────┬────┬────┬────┤");
		System.out.println("│ 번호 │ 국어 │ 영어 │ 수학 │ 총점 │ 평균 │");
		System.out.println("├────┼────┼────┼────┼────┼────┤");
		System.out.println("│    │    │    │    │    │    │");
		System.out.println("└────┴────┴────┴────┴────┴────┘");
*/

	}

}
