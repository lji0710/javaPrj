package mystudy;

import java.util.Scanner;

public class OmoksLeeJaeIl {

	private String[] player = new String[2];
	private String blacker = null;
	private String whiter = null;
	private int width = 20;
	private int height = 20;
	private int count = 0;
	private char[][] board = new char[height][width];
	private int[] xs = new int[height*width];
	private int[] ys = new int[height*width];

	
	public String[] getPlayer() {
		return player;
	}

	public void setPlayer(String[] player) {
		this.player = player;
	}

	public String getBlacker() {
		return blacker;
	}

	public void setBlacker(String blacker) {
		this.blacker = blacker;
	}

	public String getWhiter() {
		return whiter;
	}

	public void setWhiter(String whiter) {
		this.whiter = whiter;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public char[][] getBoard() {
		return board;
	}

	public void setBoard(char[][] board) {
		this.board = board;
	}

	public int[] getXs() {
		return xs;
	}

	public void setXs(int[] xs) {
		this.xs = xs;
	}

	public int[] getYs() {
		return ys;
	}

	public void setYs(int[] ys) {
		this.ys = ys;
	}

	public void setwidth(int width){
		this.width = width;
	}
	
	public void setheight(int height){
		this.height = height;
	}
	
	public void setcount(int count){
		this.count = count;
	}
	
	public int getcoount(){
		return this.count;
	}

	public void inputPlayer() {
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
	}	
	
	public void drawboard() {
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
	
	public void inputStone() {
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
	
	public void PrintStone() {
		
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
	
	public void checkStone() {
		
		Scanner scan = new Scanner(System.in);
		
		char black = '●';
		char white = '○';
		for(int oy=0; oy<height; oy++)
		{
			for(int ox=0; ox<width; ox++)
			{
				if(oy<height-4)
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
										count = 0;
									}
				if(oy<height-4 && ox<width-4)
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
										count = 0;
									}
				if(ox < width-4)
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
										count = 0;
									}
				if(oy > 5 && ox < width-4)
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
										count = 0;
									}
//---------------------------------------------------------------------
				if(oy<height-4)
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
										count = 0;
									}
				if(oy<height-4 && ox<width-4)
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
										count = 0;
									}
				if(ox < width-4)
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
										count = 0;
									}
				if(oy > 5 && ox < width-4)
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
										count = 0;
									}		
			}
		}
	}

}