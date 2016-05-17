import java.util.Scanner;

public class OmokProgramLeeFc2 {



	public static void main(String[] args) {
		String[] player = new String[2];
		String blacker = null;
		String whiter = null;
		Scanner scan = new Scanner(System.in);

		int width = 20;
		int height = 20;
		int count = 0;
		ReturnMenu:
		while(true)
		{

			printMainMenu(); // 메인 메뉴 출력--------------------------------
		
			// 메뉴 선택에 따른 실행 --------------------------------------------------------------------------------------------
			switch(inputMainMenu())  // 메뉴 선택 및 유효성 검사 --------
			{
				case 1: // 플레이어 입력 및  '선'정하기
					inputPlayer(player);
					blacker = player[0];
					whiter = player[1];
					break;		
					
				case 2: // 게임 시작
					//오목판 배열 생성
					char[][] board = new char[height][width];
					int[] xs = new int[height*width];
					int[] ys = new int[height*width];
					
					drawboard(board, height, width); // 보드 생성 ---------------------------
											
					while(true)
					{	
						inputStone(xs, ys, count); // 오목 입력 받기
						
						
						count++; // 턴 증가
						
						PrintStone(xs, ys, board, height, width, count); // 입력 받은 오목 출력 
						
						
						int end = 0;
						
						end = checkStone(height, width, board, blacker, whiter, count); //승패 확인 및 결과 출력
						
						if(end==1)
							break;
						
					}
				case 3:
					count = 0;
					continue ReturnMenu; // 끝내기
			}
		}
	}
	
	
	
//==================================================================================================
	
	
	private static int checkStone(int height, int width, char[][] board, String blacker, String whiter, int count) {
		
		Scanner scan = new Scanner(System.in);
		
		char black = '●';
		char white = '○';
		for(int oy=0; oy<height; oy++)
		{
			for(int ox=0; ox<width; ox++)
			{
				if(oy<16)
					if(board[oy][ox]==black)
						if(board[oy+1][ox]==black)
							if(board[oy+2][ox]==black)
								if(board[oy+3][ox]==black)
									if(board[oy+4][ox]==black)
									{
										System.out.println("********************");
										System.out.printf("%s(흑)의 승리!!!!\n", blacker);
										System.out.println("********************");
										scan.nextLine();
										return 1;
									}
				if(oy<16 && ox<16)
					if(board[oy][ox]==black)
						if(board[oy+1][ox+1]==black)
							if(board[oy+2][ox+2]==black)
								if(board[oy+3][ox+3]==black)
									if(board[oy+4][ox+4]==black)
									{
										System.out.println("********************");
										System.out.printf("%s(흑)의 승리!!!!\n", blacker);
										System.out.println("********************");
										scan.nextLine();
										return 1;
									}
				if(ox < 16)
					if(board[oy][ox]==black)
						if(board[oy][ox+1]==black)
							if(board[oy][ox+2]==black)
								if(board[oy][ox+3]==black)
									if(board[oy][ox+4]==black)
									{
										System.out.println("********************");
										System.out.printf("%s(흑)의 승리!!!!\n", blacker);
										System.out.println("********************");
										scan.nextLine();
										return 1;
									}
				if(oy > 5 && ox < 16)
					if(board[oy][ox]==black)
						if(board[oy-1][ox+1]==black)
							if(board[oy-2][ox+1]==black)
								if(board[oy-3][ox+1]==black)
									if(board[oy-4][ox+1]==black)
									{
										System.out.println("********************");
										System.out.printf("%s(흑)의 승리!!!!\n", blacker);
										System.out.println("********************");
										scan.nextLine();
										return 1;
									}
//---------------------------------------------------------------------
				if(oy<16)
					if(board[oy][ox]==white)
						if(board[oy+1][ox]==white)
							if(board[oy+2][ox]==white)
								if(board[oy+3][ox]==white)
									if(board[oy+4][ox]==white)
									{
										System.out.println("********************");
										System.out.printf("%s(백)의 승리!!!!\n", whiter);
										System.out.println("********************");
										scan.nextLine();
										return 1;
									}
				if(oy<16 && ox<16)
					if(board[oy][ox]==white)
						if(board[oy+1][ox+1]==white)
							if(board[oy+2][ox+2]==white)
								if(board[oy+3][ox+3]==white)
									if(board[oy+4][ox+4]==white)
									{
										System.out.println("********************");
										System.out.printf("%s(백)의 승리!!!!\n", whiter);
										System.out.println("********************");
										scan.nextLine();
										return 1;
									}
				if(ox < 16)
					if(board[oy][ox]==white)
						if(board[oy][ox+1]==white)
							if(board[oy][ox+2]==white)
								if(board[oy][ox+3]==white)
									if(board[oy][ox+4]==white)
									{
										System.out.println("********************");
										System.out.printf("%s(백)의 승리!!!!\n", whiter);
										System.out.println("********************");
										scan.nextLine();
										return 1;
									}
				if(oy > 5 && ox < 16)
					if(board[oy][ox]==white)
						if(board[oy-1][ox+1]==white)
							if(board[oy-2][ox+1]==white)
								if(board[oy-3][ox+1]==white)
									if(board[oy-4][ox+1]==white)
									{
										System.out.println("********************");
										System.out.printf("%s(백)의 승리!!!!\n", whiter);
										System.out.println("********************");
										scan.nextLine();
										return 1;
									}
				
			}
		}
		return 0;
	}

	private static void PrintStone(int[] xs, int[] ys, char[][] board, int height, int width, int count) {
		
		for(int i=0; i<count; i++)
		{
			if(i%2 == 0)
				board[ys[i]-1][xs[i]-1] = '●';
			else
				board[ys[i]-1][xs[i]-1] = '○';
		}
		//오목판 출력
		for(int oy=0; oy<height; oy++)
		{
			for(int ox=0; ox<width; ox++)
				System.out.printf("%c", board[oy][ox]);
		System.out.println();
		}
	}

	private static void inputStone(int[] xs, int[] ys, int count) {
		Scanner scan = new Scanner(System.in);
		// 돌두기 --------------------------------------
		breakTurn:
		while(true)
		{
			int x;
			int y;
			// 턴 및 둘 차례 알려주기
			System.out.printf("턴수: %d    ", count+1);
			if(count%2 == 0)
				System.out.println("●돌 차례입니다.");
			else
				System.out.println("○돌 차례입니다.");
			System.out.print("돌을 둘 위치 : x sp y > ");
			x = scan.nextInt();
			y = scan.nextInt();
			
			
			// 사용자에게 입력 받기
			xs[count] = x;
			ys[count] = y;
			
			//사용자 입력위치에 돌이 있는지 확인
			for(int i=0; i<count; i++)
			if(ys[i] == y && xs[i] == x)
			{
				System.out.printf("같은 위치에 돌이 있습니다.\n");
				continue breakTurn;
			}
			break;
		}
			
		
	}

	private static void drawboard(char[][] board, int height, int width) {
		//오목판 초기화
		for(int y=0; y<height; y++)
			for(int x=0; x<width; x++)
				board[y][x] = '┼';
				
		// 테두리 꾸미기; 데코레이션
		for(int i =0; i<width; i++)
		{
			board[0][i] = '┬';
			board[height-1][i] = '┴';
		}
		
		for(int i=0; i<height; i++)
		{
			board[i][0] = '├';
			board[i][width-1] = '┤';
		}
					
		board[0][0] = '┌';
		board[0][width-1] = '┐';
		board[height-1][0] = '└';
		board[height-1][width-1] = '┘';
		
		//오목판 출력
		for(int oy=0; oy<height; oy++)
		{
			for(int ox=0; ox<width; ox++)
				System.out.printf("%c", board[oy][ox]);
		System.out.println();
		}
		
	}

	private static void inputPlayer(String[] player) {
		Scanner scan = new Scanner(System.in);
		String player1;
		String player2;
		
		System.out.print("1P의 성명을 입력하세요.> ");
		player1 = scan.nextLine();
		System.out.print("2P의 성명을 입력하세요.> ");
		player2 = scan.nextLine();
		
		while(true)
		{
			System.out.printf("1 : %s \n", player1);
			System.out.printf("2 : %s \n", player2);
			System.out.print("선(흑)을 정하세요(1 or 2) > ");
			String choice = scan.nextLine();
			
			if(choice.equals("1")) 
			{
				player[0] = player1;
				player[1] = player2;
				break;
			}
			else if(choice.equals("2"))
			{
				player[0] = player2;
				player[1] = player1;
				break;
			}
			else
			{
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("1~2 중 하나를 선택해 주세요.");
			}
		}
		
	}

	private static void printMainMenu() {
		// 메인 메뉴 출력--------------------------------
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
		// 메뉴 선택 및 유효성 검사-------------------------------------------------------------------------------------
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
