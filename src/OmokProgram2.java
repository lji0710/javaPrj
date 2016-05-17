import java.util.Scanner;

public class OmokProgram2 {

	public static void main(String[] args) {
	
		int width = 20;
		int height = 20;

		
		//오목판 배열 생성
		char[] board = new char[20*20];
		
		//오목판 초기화
		for(int i=0; i<400; i++)
			board[i] = '┼';
				
		board[width*0 + 0] = '┌';
		board[width*0 + 19] = '┐';
		board[width*19 + 0] = '└';
		board[width*19 + 19] = '┘';

		board[width*(3-1) +(3-1)] = '○';
		
		
		
		//오목판 출력
		for(int y=0; y<height; y++)
		{
			for(int x=0; x<width; x++)
				System.out.printf("%c", board[(y*height)+x]);
		System.out.println();
		}
		
	}	
}
