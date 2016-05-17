package mystudy.marble;

import java.util.Scanner;

public class Game {
	
	public static void main(String[] args) {
		
		Board board = new Board();
		
	
		switch(printMenu())
		{
		case 1:
			Player player = new Player();
			player.setPlayer();
			for(int i=0; i<Player.getMans(); i++) 
			{
				player.input(i+1);
				//board.addPlayers();
				
			}
			break;
		case 2:
			
			break;
		case 3:
			break;
				
		}
		
		

		
		

	


		
	
	}

	private static int printMenu() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나의 첫 번째 마블");
		System.out.println("1. 플레이어 셋팅");
		System.out.println("2. 게임시작");
		System.out.println("3. 끝내기");
		System.out.print(" 선택 > ");
		return scan.nextInt();
		
	}
}
