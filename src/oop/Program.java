package oop;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		ExamConsole examCon = new ExamConsole();
	
		// Exam exam1 = new Exam(kor, eng, math)	
				
		breakEnd:
		while(true) 
			switch(inputMainMenu())// 메인메뉴 출력 후 메뉴 선택
			{
			case 1:
				examCon.inputExam();
				break;
			case 2:
				examCon.outputExam();
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
	
	private static void endProgram() {
		System.out.println("안녕~~ 잘가~~");
		
	}
	
	private static void errorChoice() {
		System.out.println("잘 보고 골라라잉");
		
	}
}