package app.omok;

public class Game {

	public static void main(String[] args) {
		
		Board board = new Board(20, 20);	
				
		while(true)
		{
			
			board.Print();
			Stone stone = new Stone();

			board.wincheck();
			
			stone.input();

			if(board.checkDuplicated(stone) == true)
				printError();
			else
				board.add(stone);
			
		}
		

	}

	private static void printError() {
		System.out.println("해당 위치에 다른 돌이 있습니다.");

		
	}


}
