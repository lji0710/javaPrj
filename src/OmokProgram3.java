import java.util.Scanner;

public class OmokProgram3 {

	public static void main(String[] args) {
	
		int width = 20;
		int height = 20;
		Scanner scan = new Scanner(System.in);
		
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
		
			// 사용자에게 입력 받기
			System.out.println("바둑돌을 둘 위치");
			System.out.print("x sp y > ");
			x = scan.nextInt();
			y = scan.nextInt();
			
			xs[count] = x;
			ys[count] = y;
			types[count] = type;
			count++;
			
			// 사용자 입력에 대한 위치에 오목을 두는 로직
/*			for(int i=0; i<count; i++)
			{
				if(board[ys[i]-1][xs[i]-1] == '○' || board[ys[i]-1][xs[i]-1] == '●')
				{
					System.out.println("같은 위치에 돌이 있습니다.");
					continue re;
				}
				else
				{		
					System.out.println();
					if(i%2 == 0)
						board[ys[i]-1][xs[i]-1] = '○';
					else
						board[ys[i]-1][xs[i]-1] = '●';
				}
			}*/
			if(count%2 == 0)
				board[ys[count]-1][xs[count]-1] = '○';
			else
				board[ys[count]-1][xs[count]-1] = '●';
			
			
			//오목판 출력
			for(int oy=0; oy<height; oy++)
			{
				for(int ox=0; ox<width; ox++)
					System.out.printf("%c", board[oy][ox]);
			System.out.println();
			}
			
			//승패 확인
			char black = '●';
			char white = '○';
			int check = 1;
			for(int oy=0; oy<height; oy++)
			{
				for(int ox=0; ox<width; ox++)
				{
					if(oy<15)
					if(board[oy][ox]==black)
						if(board[oy+1][ox]==black)
							if(board[oy+2][ox]==black)
								if(board[oy+3][ox]==black)
									if(board[oy+4][ox]==black)
										System.out.println("흑돌 승리!!!!");
					if(oy<15 && ox<15)
					if(board[oy][ox]==black)
						if(board[oy+1][ox+1]==black)
							if(board[oy+2][ox+2]==black)
								if(board[oy+3][ox+3]==black)
									if(board[oy+4][ox+4]==black)
										System.out.println("흑돌 승리!!!!");
					if(ox < 15)
					if(board[oy][ox]==black)
						if(board[oy][ox+1]==black)
							if(board[oy][ox+2]==black)
								if(board[oy][ox+3]==black)
									if(board[oy][ox+4]==black)
										System.out.println("흑돌 승리!!!!");
					if(oy > 5 && ox < 15)
						if(board[oy][ox]==black)
							if(board[oy-1][ox+1]==black)
								if(board[oy-2][ox+1]==black)
									if(board[oy-3][ox+1]==black)
										if(board[oy-4][ox+1]==black)
											System.out.println("흑돌 승리!!!!");
//---------------------------------------------------------------------
					if(oy<15)
						if(board[oy][ox]==white)
							if(board[oy+1][ox]==white)
								if(board[oy+2][ox]==white)
									if(board[oy+3][ox]==white)
										if(board[oy+4][ox]==white)
											System.out.println("백돌 승리!!!!");
						if(oy<15 && ox<15)
						if(board[oy][ox]==white)
							if(board[oy+1][ox+1]==white)
								if(board[oy+2][ox+2]==white)
									if(board[oy+3][ox+3]==white)
										if(board[oy+4][ox+4]==white)
											System.out.println("백돌 승리!!!!");
						if(ox < 15)
						if(board[oy][ox]==white)
							if(board[oy][ox+1]==white)
								if(board[oy][ox+2]==white)
									if(board[oy][ox+3]==white)
										if(board[oy][ox+4]==white)
											System.out.println("백돌 승리!!!!");
						if(oy > 5 && ox < 15)
							if(board[oy][ox]==white)
								if(board[oy-1][ox+1]==white)
									if(board[oy-2][ox+1]==white)
										if(board[oy-3][ox+1]==white)
											if(board[oy-4][ox+1]==white)
												System.out.println("백돌 승리!!!!");
				}		
			}
			
	
			
		}
	}	
}
