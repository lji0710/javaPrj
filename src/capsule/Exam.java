package capsule;

import java.util.Scanner;

public class Exam {

	private int kor;
	private int eng;
	private int math;
	int current = -1;
	
	public static void setKor(Exam exam, int kor)
	{
		exam.kor = kor;
	}
	public static int getKor(Exam exam, int kor)
	{
		return exam.kor;
	}
	public static void setEng(Exam exam, int eng)
	{
		exam.eng = eng;
	}
	public static int getEng(Exam exam, int eng)
	{
		return exam.eng;
	}
	public static void setMath(Exam exam, int math)
	{
		exam.math = math;
	}
	public static int getMath(Exam exam, int math)
	{
		return exam.math;
	}

	static void inputExam(Exam exam) {
	
		Scanner scan = new Scanner(System.in);
		
		int kor;
		int eng;
		int math;
		
		System.out.println("┌────────────┐");
		System.out.println("│      성적  입력        │");
		System.out.println("└────────────┘");
		
		do
		{
			System.out.printf(" 국어 : ");
			kor = scan.nextInt();
			if(!(0<=kor && kor<=100))
				System.out.println("값의 범위를 벗어났습니다. 유효범위(0~100)");
		}
		while(!(0<=kor && kor<=100));
		do
		{
			System.out.printf(" 영어 : ");
			eng = scan.nextInt();
			if(!(0<=eng && eng<=100))
				System.out.println("값의 범위를 벗어났습니다. 유효범위(0~100)");
		}
		while(!(0<=eng && eng<=100));
		do
		{
			System.out.printf(" 수학 : ");
			math = scan.nextInt();
			if(!(0<=math && math<=100))
				System.out.println("값의 범위를 벗어났습니다. 유효범위(0~100)");
		}
		while(!(0<=math && math<=100));
		
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
	}
	
	static void outputExam(Exam exam) {
		
		int kor = exam.kor;
		int eng = exam.eng;
		int math = exam.math;
		
		int total = kor + eng + math;
		float avg = (float) (total / 3.0);			
		
		System.out.println("┌────────────┐");
		System.out.println("│      성적  출력        │");
		System.out.println("└────────────┘");
		System.out.printf(" 국어 : %5d\n", kor);
		System.out.printf(" 영어 : %5d\n", eng);
		System.out.printf(" 수학 : %5d\n", math);
		System.out.printf(" 총점 : %5d\n", total);
		System.out.printf(" 평균 : %8.2f\n", avg);
		System.out.println("────────────────────");
		
		
	}
	public void inputExam() {
		// TODO Auto-generated method stub
		
	}

}
