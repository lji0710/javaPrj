package oop;

import java.util.Scanner;

public class ExamConsole {

	private Exam exam = new Exam();
	
/*	private Exam exam;
	public ExamConsole() {
		exam = new Exam(); 
	}*/
	
	
	public void inputExam() {

		int kor;
		int eng;
		int math;
		
		Scanner scan = new Scanner(System.in);
		
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
				
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
	}
	
	public void outputExam() {
		
		System.out.println("┌────────────┐");
		System.out.println("│      성적  출력        │");
		System.out.println("└────────────┘");
		System.out.printf(" 국어 : %5d\n", exam.getKor());
		System.out.printf(" 영어 : %5d\n", exam.getEng());
		System.out.printf(" 수학 : %5d\n", exam.getMath());
		System.out.printf(" 총점 : %5d\n", exam.total());
		System.out.printf(" 평균 : %8.2f\n", exam.avg());
		System.out.println("────────────────────");		
	}

}
