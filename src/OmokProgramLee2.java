import java.util.Scanner;

public class OmokProgramLee2 {

	public static void main(String[] args) {
	
		String blacker = null;
		String whiter = null;
		Scanner scan = new Scanner(System.in);
		
		ReturnMenu:
		while(true)
		{
			int width = 20;
			int height = 20;
			int menu;

			// 메인 메뉴 구성----------------------------------------------------------------------------------------------
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

			// 메뉴 선택 및 유효성 검사-------------------------------------------------------------------------------------
			while(true)
			{

				String strMenu = scan.nextLine();
			
				if(strMenu.equals("1") || strMenu.equals("2") || strMenu.equals("3")) 
				menu = Integer.parseInt(strMenu);
				else
				{
					System.out.println("잘못 입력하셨습니다.");
					System.out.println("1~3 중 하나를 선택해 주세요.");
					continue ReturnMenu;
				}
				break;
			}
		
			// 메뉴에 따른 실행 --------------------------------------------------------------------------------------------
			switch(menu)
			{
				case 1: // 플레이어 입력
					{
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
								blacker = player1;
								whiter = player2;
								break;
							}
							else if(choice.equals("2"))
							{
								blacker = player2;
								whiter = player1;
								break;
							}
							else
							{
								System.out.println("잘못 입력하셨습니다.");
								System.out.println("1~2 중 하나를 선택해 주세요.");
							}
							
						}
						continue ReturnMenu;
					}
				case 2: // 게임 시작
					//오목판 배열 생성
					char[][] board = new char[height][width];
					
					int[] xs = new int[height*width];
					int[] ys = new int[height*width];
					int[] types = new int[height*width];
					
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
					
					int count = 0;
					int x;
					int y;
					int type = 1;
					re:
					while(true)
					{	
					
						// 턴 및 둘 차례 알려주기
						System.out.printf("턴수: %d    ", count+1);
						if(count%2 == 0)
							System.out.println("●돌 차례입니다.");//System.out.print("%s차례 ●돌 입니다.", blacker);
						else
							System.out.println("○돌 차례입니다.");//System.out.print("%s차례 ○돌 입니다.", whiter);
						System.out.print("돌을 둘 위치 : x sp y > ");
						x = scan.nextInt();
						y = scan.nextInt();
						
						
						// 사용자에게 입력 받기
						xs[count] = x;
						ys[count] = y;
						types[count] = type;
						
						//사용자 입력위치에 돌이 있는지 확인
						for(int i=0; i<count; i++)
						if(ys[i] == y && xs[i] == x)
						{
							System.out.printf("같은 위치에 %c이 있습니다.\n", board[ys[i]-1][xs[i]-1]);
							continue re;
						}
						
						count++; // 턴 증가
						
						// 사용자 입력에 대한 위치에 오목을 두는 로직
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
						
						//승패 확인 및 결과 출력
						char color;
						if(count%2 == 1)
							color = '●';
						else
							color = '○';
							
							
						int cx = x-1;
						int cy = y-1;
						System.out.println(cy+ " " + cx);
						if(board[cy][cx] == color) // 흑돌 확인 !!!!!!!!!!!!
						{
							if(cy<16) // 세로 확인 -------------------------
								if(board[cy+1][cx]==color)
									if(board[cy+2][cx]==color)
										if(board[cy+3][cx]==color)
											if(board[cy+4][cx]==color)
											{
												System.out.println("********************");
												System.out.printf("%s(흑)의 승리!!!!\n", blacker);
												System.out.println("********************");
												scan.nextLine();
												continue ReturnMenu;
											}
							if(0<cy && cy<17)
								if(board[cy+1][cx]==color)
									if(board[cy+2][cx]==color)
										if(board[cy+3][cx]==color)
											if(board[cy-1][cx]==color)
											{
												System.out.println("********************");
												System.out.printf("%s(흑)의 승리!!!!\n", blacker);
												System.out.println("********************");
												scan.nextLine();
												continue ReturnMenu;
											}
							if(1<cy && cy<18)
								if(board[cy+1][cx]==color)
									if(board[cy+2][cx]==color)
										if(board[cy-1][cx]==color)
											if(board[cy-2][cx]==color)
											{
												System.out.println("********************");
												System.out.printf("%s(흑)의 승리!!!!\n", blacker);
												System.out.println("********************");
												scan.nextLine();
												continue ReturnMenu;
											}
							if(2<cy && cy<19)
								if(board[cy+1][cx]==color)
									if(board[cy-1][cx]==color)
										if(board[cy-2][cx]==color)
											if(board[cy-3][cx]==color)
											{
												System.out.println("********************");
												System.out.printf("%s(흑)의 승리!!!!\n", blacker);
												System.out.println("********************");
												scan.nextLine();
												continue ReturnMenu;
												
											}
							if(3<cy && cy<20)
								if(board[cy-1][cx]==color)
									if(board[cy-2][cx]==color)
										if(board[cy-3][cx]==color)
											if(board[cy-4][cx]==color)
											{
												System.out.println("********************");
												System.out.printf("%s(흑)의 승리!!!!\n", blacker);
												System.out.println("********************");
												scan.nextLine();
												continue ReturnMenu;
												
											}
							if(cx<16) // 가로 확인 --------------------------
								if(board[cy][cx+1]==color)
									if(board[cy][cx+2]==color)
										if(board[cy][cx+3]==color)
											if(board[cy][cx+4]==color)
											{
												System.out.println("********************");
												System.out.printf("%s(흑)의 승리!!!!\n", blacker);
												System.out.println("********************");
												scan.nextLine();
												continue ReturnMenu;
											}
							if(0<cx && cx<17)
								if(board[cy][cx+1]==color)
									if(board[cy][cx+2]==color)
										if(board[cy][cx+3]==color)
											if(board[cy][cx-1]==color)
											{
												System.out.println("********************");
												System.out.printf("%s(흑)의 승리!!!!\n", blacker);
												System.out.println("********************");
												scan.nextLine();
												continue ReturnMenu;
											}
							if(1<cx && cx<18)
								if(board[cy][cx+1]==color)
									if(board[cy][cx+2]==color)
										if(board[cy][cx-1]==color)
											if(board[cy][cx-2]==color)
											{
												System.out.println("********************");
												System.out.printf("%s(흑)의 승리!!!!\n", blacker);
												System.out.println("********************");
												scan.nextLine();
												continue ReturnMenu;
											}
							if(2<cx && cx<19)
								if(board[cy][cx+1]==color)
									if(board[cy][cx-1]==color)
										if(board[cy][cx-2]==color)
											if(board[cy][cx-3]==color)
											{
												System.out.println("********************");
												System.out.printf("%s(흑)의 승리!!!!\n", blacker);
												System.out.println("********************");
												scan.nextLine();
												continue ReturnMenu;
											}
							if(3<cx && cx<20)
								if(board[cy][cx-1]==color)
									if(board[cy][cx-2]==color)
										if(board[cy][cx-3]==color)
											if(board[cy][cx-4]==color)
											{
												System.out.println("********************");
												System.out.printf("%s(흑)의 승리!!!!\n", blacker);
												System.out.println("********************");
												scan.nextLine();
												continue ReturnMenu;
											}
							if(cy<16 && cx<16) //  대각선 "↘" 확인 --------------------------
								if(board[cy+1][cx+1]==color)
									if(board[cy+2][cx+2]==color)
										if(board[cy+3][cx+3]==color)
											if(board[cy+4][cx+4]==color)
											{
												System.out.println("********************");
												System.out.printf("%s(흑)의 승리!!!!\n", blacker);
												System.out.println("********************");
												scan.nextLine();
												continue ReturnMenu;
											}
							if(0<cy && cy<17 && 0<cx && cx<17)
								if(board[cy+1][cx+1]==color)
									if(board[cy+2][cx+2]==color)
										if(board[cy+3][cx+3]==color)
											if(board[cy-1][cx-1]==color)
											{
												System.out.println("********************");
												System.out.printf("%s(흑)의 승리!!!!\n", blacker);
												System.out.println("********************");
												scan.nextLine();
												continue ReturnMenu;
											}
							if(1<cy && cy<18 && 1<cx && cx<18)
								if(board[cy+1][cx+1]==color)
									if(board[cy+2][cx+2]==color)
										if(board[cy+3][cx-1]==color)
											if(board[cy-2][cx-2]==color)
											{
												System.out.println("********************");
												System.out.printf("%s(흑)의 승리!!!!\n", blacker);
												System.out.println("********************");
												scan.nextLine();
												continue ReturnMenu;
											}
							if(2<cy && cy<19 && 2<cx && cx<19)
								if(board[cy+1][cx+1]==color)
									if(board[cy-1][cx-1]==color)
										if(board[cy-2][cx-2]==color)
											if(board[cy-3][cx-3]==color)
											{
												System.out.println("********************");
												System.out.printf("%s(흑)의 승리!!!!\n", blacker);
												System.out.println("********************");
												scan.nextLine();
												continue ReturnMenu;
											}
							if(3<cy && cy<20 && 3<cx && cx<20)
								if(board[cy-1][cx-1]==color)
									if(board[cy-2][cx-2]==color)
										if(board[cy-3][cx-3]==color)
											if(board[cy-4][cx-4]==color)
											{
												System.out.println("********************");
												System.out.printf("%s(흑)의 승리!!!!\n", blacker);
												System.out.println("********************");
												scan.nextLine();
												continue ReturnMenu;
											}
							if(3<cy && cx<16) //  대각선 "↗" 확인 --------------------------
								if(board[cy-1][cx+1]==color)
									if(board[cy-2][cx+2]==color)
										if(board[cy-3][cx+3]==color)
											if(board[cy-4][cx+4]==color)
											{
												System.out.println("********************");
												System.out.printf("%s(흑)의 승리!!!!\n", blacker);
												System.out.println("********************");
												scan.nextLine();
												continue ReturnMenu;
											}
							if(2<cy && cy<19 && 0<cx && cx<17)
								if(board[cy-1][cx+1]==color)
									if(board[cy-2][cx+2]==color)
										if(board[cy-3][cx+3]==color)
											if(board[cy+1][cx-1]==color)
											{
												System.out.println("********************");
												System.out.printf("%s(흑)의 승리!!!!\n", blacker);
												System.out.println("********************");
												scan.nextLine();
												continue ReturnMenu;
											}
							if(1<cy && cy<18 && 1<cx && cx<18)
								if(board[cy-1][cx+1]==color)
									if(board[cy-2][cx+2]==color)
										if(board[cy+1][cx-1]==color)
											if(board[cy+2][cx-2]==color)
											{
												System.out.println("********************");
												System.out.printf("%s(흑)의 승리!!!!\n", blacker);
												System.out.println("********************");
												scan.nextLine();
												continue ReturnMenu;
											}
							if(0<cy && cy<17 && 2<cx && cx<19)
								if(board[cy-1][cx+1]==color)
									if(board[cy-2][cx+2]==color)
										if(board[cy+1][cx-1]==color)
											if(board[cy+2][cx-2]==color)
											{
												System.out.println("********************");
												System.out.printf("%s(흑)의 승리!!!!\n", blacker);
												System.out.println("********************");
												scan.nextLine();
												continue ReturnMenu;
											}
							if(cy<16 && 3<cx && cx<20)
								if(board[cy+1][cx-1]==color)
									if(board[cy+2][cx-2]==color)
										if(board[cy+3][cx-3]==color)
											if(board[cy+4][cx-4]==color)
											{
												System.out.println("********************");
												System.out.printf("%s(흑)의 승리!!!!\n", blacker);
												System.out.println("********************");
												scan.nextLine();
												continue ReturnMenu;
											}
						}
						
						
					}
				case 3:
					break ReturnMenu; // 끝내기
			}
		}
	}	
}
