package mystudy;
import java.util.Scanner;

public class OmokProgram_LeeJaeIl {



	public static void main(String[] args) {
		
		OmoksLeeJaeIl omoks = new OmoksLeeJaeIl();

		// 오목판 가로 X 세로 크기(기본20)
		//omoks.setwidth(10);
		//omoks.setheight(10);	
		
		ReturnMenu:
		while(true)
		{
			printMainMenu();	 // 메인 메뉴 출력
		
			switch(inputMainMenu()) 	 // 메뉴 선택 및 유효성 검사 ------
			{
				case 1: 
					omoks.inputPlayer();	// 플레이어 입력 및  '선'정하기
					break;		
					
				case 2: 

					omoks.drawboard(); 	// 보드 생성 ---------------------------
											
					while(true)
					{	
						omoks.inputStone();	// 돌 위치 입력
						
						omoks.setcount(omoks.getcoount()+1); // 턴 증가
						
						omoks.PrintStone(); // 입력 받은 오목 출력 
					
						omoks.checkStone(); //승패 확인 및 결과 출력
						
						if(omoks.getcoount()==0)
							continue ReturnMenu;
					}
				case 3:
					System.out.println("게임을 종료합니다. Good Bye~");
					break ReturnMenu; // 끝내기
			}
		}
	}
	
	
//====================================================================================

	private static void printMainMenu() {
		// 메인 메뉴 출력--------------------------------------------------------------
		System.out.println("○●○●○●○●○●○●○●");
		System.out.println("●○●○●○●○●○●○●○");
		System.out.println("○●                    ○●");
		System.out.println("●○    오목    게임    ●○");
		System.out.println("○●                    ○●");
		System.out.println("●○●○●○●○●○●○●○");
		System.out.println("○●○●○●○●○●○●○●");
		System.out.println();
		System.out.println("1. 플레이어 입력");
		System.out.println("2. 게임 시작");
		System.out.println("3. 게임 끝내기");
		System.out.println();
		System.out.print("선택 > ");	
	}

	private static int inputMainMenu() {
		// 메뉴 선택 및 유효성 검사----------------------------------------------------
		while(true)
		{
			Scanner scan = new Scanner(System.in);
			String strMenu = scan.nextLine();
		
			if(strMenu.equals("1") || strMenu.equals("2") || strMenu.equals("3")) 
				return Integer.parseInt(strMenu);
			else
			{
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("1~3 중 하나를 선택해 주세요.");
			}
			
		}

	}	
}
