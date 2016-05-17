package mystudy;

import java.util.Scanner;

public class Exams {

	private int kor;
	private int eng;
	private int math;
	
	public void ExamCollection() 
	{
		Exams[] exam;
		int current;
	}
	
	
	public void setKor(int kor)
	{
		this.kor = kor;
	}
	public int getKor()
	{
		return kor;
	}
	public void setEng(int eng)
	{
		this.eng = eng;
	}
	public int getEng(int eng)
	{
		return eng;
	}
	public void setMath(int math)
	{
		this.math = math;
	}
	public int getMath(int math)
	{
		return math;
	}

	public void inputExam() {
	
		Scanner scan = new Scanner(System.in);
		
/*		int kor;
		int eng;
		int math;*/
		
		System.out.println("┌────────────┐");
		System.out.println("│      성적  입력        │");
		System.out.println("└────────────┘");
		Exams exam = new Exams();
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
		
		
/*		this.kor = kor;
		this.eng = eng;
		this.math = math;*/
	}
	
	public void outputExam() {
		
		/*int kor = exam.kor;
		int eng = exam.eng;
		int math = exam.math;*/
		
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


}
