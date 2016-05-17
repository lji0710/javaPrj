import java.util.Scanner;

import com.jaeillee.app.java.Exam;

// 데이터 수집을 위한 객체 다루기

public class Program8 {
	static ExamCollection list;
	public static void main(String[] args) {
		
		
		
		
/*		Exam[] exams = new Exam[3];
		int current = -1;*/
		
		
		list = new ExamCollection();
		list.exams = new Exam[3];
		list.current = -1;
		/*exam.kor = 0;
		exam.eng = 0;
		exam.math = 0;*/
			
		breakEnd:
		while(true) 
			switch(inputMainMenu())// 메인메뉴 출력 후 메뉴 선택
			{
			case 1:
				inputExam(list); // 
				break;
			case 2:
				outputExam(list);
				break;
			case 3:
				endProgram();
				break breakEnd;
			default :
				errorChoice();		
				break;
			}

	}

	private static int inputMainMenu() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("┌────────────┐");
		System.out.println("│      메인 메뉴         │");
		System.out.println("└────────────┘");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 종료");
		System.out.print("선택 > ");
		return scan.nextInt();

	}
	
	private static void inputExam(ExamCollection list) {

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
		
		Exam exam = new Exam();
		
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
		
		list.exams[++list.current] = exam;
		
	}

	private static void outputExam(ExamCollection list) {
		
		System.out.println("┌────────────┐");
		System.out.println("│      성적  출력        │");
		System.out.println("└────────────┘");
		System.out.println(list.current);
		for(int i=0; i<=list.current; i++ )
		{
			Exam exam = list.exams[i];
		
		int kor = exam.kor;
		int eng = exam.eng;
		int math = exam.math;
		
		int total = kor + eng + math;
		float avg = (float) (total / 3.0);			
		
		System.out.printf(" 국어 : %5d\n", kor);
		System.out.printf(" 영어 : %5d\n", eng);
		System.out.printf(" 수학 : %5d\n", math);
		System.out.printf(" 총점 : %5d\n", total);
		System.out.printf(" 평균 : %8.2f\n", avg);
		System.out.println("────────────────────");
		}
		
	}

	private static void endProgram() {
		System.out.println("안녕~~ 잘가~~");
		
	}
	
	private static void errorChoice() {
		System.out.println("잘 보고 골라라잉");
		
	}

}
