import java.util.Scanner;

public class LottoProgram {

	public static void main(String[] args) {
		
		int times = 0;
		int num1 = 2;
		int num2 = 6;
		int num3 = 7;
		int num4 = 14;
		int num5 = 34;
		int num6 = 43;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("1번째 담청번호를 입력하세요");
		num1 = scan.nextInt();
		System.out.println("2번째 담청번호를 입력하세요");
		num2 = scan.nextInt();
		System.out.println("3번째 담청번호를 입력하세요");
		num3 = scan.nextInt();
		System.out.println("4번째 담청번호를 입력하세요");
		num4 = scan.nextInt();
		System.out.println("5번째 담청번호를 입력하세요");
		num5 = scan.nextInt();
		System.out.println("6번째 담청번호를 입력하세요");
		num6 = scan.nextInt();
		System.out.println("----------------------------");
		
		System.out.printf("제 %d회 Lotto 당첨번호\n", times);
		System.out.printf("────────────────\n");
		System.out.printf("1번째 당첨 번호 =  %2d\n", num1);
		System.out.printf("2번째 당첨 번호 =  %2d\n", num2);
		System.out.printf("3번째 당첨 번호 =  %2d\n", num3);
		System.out.printf("4번째 당첨 번호 =  %2d\n", num4);
		System.out.printf("5번째 당첨 번호 =  %2d\n", num5);
		System.out.printf("6번째 당첨 번호 =  %2d\n", num6);
		
		
		

	}

}
