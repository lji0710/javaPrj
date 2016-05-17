package app.omok;

import java.util.Scanner;

public class Board {
	
	private int width;
	private int height;
	private char[][] buf;
	private Stone[] stones;
	private int current;

	
	public Board(){
		this(19, 19);
	}

	public Board(int whidth, int height){
		this.width = whidth;
		this.height = height;
		buf = new char[height][width];
		stones = new Stone[height*width]; 
		this.current = -1;
		
		
		//initBuf(); //	"buf[][]"에 바둑판 생성

	}
	
	private void initBuf(){
		// "buf[][]"에 바둑판 생성
		for(int y=0; y<height; y++)
			for(int x=0; x<width; x++)
				buf[y][x] = '┼';
				
		for(int i =0; i<width; i++)
		{
			buf[0][i] = '┬';
			buf[height-1][i] = '┴';
		}
		
		for(int i=0; i<height; i++)
		{
			buf[i][0] = '├';
			buf[i][width-1] = '┤';
		}
					
		buf[0][0] = '┌';
		buf[0][width-1] = '┐';
		buf[height-1][0] = '└';
		buf[height-1][width-1] = '┘';	
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

	public char[][] getBuf() {
		return buf;
	}

	public void setBuf(char[][] buf) {
		this.buf = buf;
	}

	public void putStone(Stone stone)
	{
		
			buf[stone.getY()][stone.getX()] = (stone.getType() == 1 ? '●' : '○');
		
	}

	public void Print() {
		//오목판 출력
		
		initBuf();
		for(int i=0; i<=current; i++)
			putStone(stones[i]);
		
		for(int y=0; y<height; y++)
		{
			for(int x=0; x<width; x++)
				System.out.printf("%c", buf[y][x]);
		System.out.println();
		
		}		
	}
	
	
	public void wincheck() {
Scanner scan = new Scanner(System.in);
		
		char black = '●';
		char white = '○';
		for(int oy=0; oy<height; oy++)
		{
			for(int ox=0; ox<width; ox++)
			{
				if(oy<height-4)
					if(buf[oy][ox]==black)
						if(buf[oy+1][ox]==black)
							if(buf[oy+2][ox]==black)
								if(buf[oy+3][ox]==black)
									if(buf[oy+4][ox]==black)
									{
										System.out.println("********************");
										//System.out.printf("%s(흑)의 승리!!!!\n", blacker);
										System.out.println("********************");
										scan.nextLine();
										//count = 0;
									}
				if(oy<height-4 && ox<width-4)
					if(buf[oy][ox]==black)
						if(buf[oy+1][ox+1]==black)
							if(buf[oy+2][ox+2]==black)
								if(buf[oy+3][ox+3]==black)
									if(buf[oy+4][ox+4]==black)
									{
										System.out.println("********************");
										//System.out.printf("%s(흑)의 승리!!!!\n", blacker);
										System.out.println("********************");
										scan.nextLine();
										//count = 0;
									}
				if(ox < width-4)
					if(buf[oy][ox]==black)
						if(buf[oy][ox+1]==black)
							if(buf[oy][ox+2]==black)
								if(buf[oy][ox+3]==black)
									if(buf[oy][ox+4]==black)
									{
										System.out.println("********************");
										//System.out.printf("%s(흑)의 승리!!!!\n", blacker);
										System.out.println("********************");
										scan.nextLine();
										//count = 0;
									}
				if(oy > 5 && ox < width-4)
					if(buf[oy][ox]==black)
						if(buf[oy-1][ox+1]==black)
							if(buf[oy-2][ox+1]==black)
								if(buf[oy-3][ox+1]==black)
									if(buf[oy-4][ox+1]==black)
									{
										System.out.println("********************");
										//System.out.printf("%s(흑)의 승리!!!!\n", blacker);
										System.out.println("********************");
										scan.nextLine();
										//count = 0;
									}
//---------------------------------------------------------------------
				if(oy<height-4)
					if(buf[oy][ox]==white)
						if(buf[oy+1][ox]==white)
							if(buf[oy+2][ox]==white)
								if(buf[oy+3][ox]==white)
									if(buf[oy+4][ox]==white)
									{
										System.out.println("********************");
										//System.out.printf("%s(백)의 승리!!!!\n", whiter);
										System.out.println("********************");
										scan.nextLine();
										//count = 0;
									}
				if(oy<height-4 && ox<width-4)
					if(buf[oy][ox]==white)
						if(buf[oy+1][ox+1]==white)
							if(buf[oy+2][ox+2]==white)
								if(buf[oy+3][ox+3]==white)
									if(buf[oy+4][ox+4]==white)
									{
										System.out.println("********************");
										//System.out.printf("%s(백)의 승리!!!!\n", whiter);
										System.out.println("********************");
										scan.nextLine();
										//count = 0;
									}
				if(ox < width-4)
					if(buf[oy][ox]==white)
						if(buf[oy][ox+1]==white)
							if(buf[oy][ox+2]==white)
								if(buf[oy][ox+3]==white)
									if(buf[oy][ox+4]==white)
									{
										System.out.println("********************");
										//System.out.printf("%s(백)의 승리!!!!\n", whiter);
										System.out.println("********************");
										scan.nextLine();
										//count = 0;
									}
				if(oy > 5 && ox < width-4)
					if(buf[oy][ox]==white)
						if(buf[oy-1][ox+1]==white)
							if(buf[oy-2][ox+1]==white)
								if(buf[oy-3][ox+1]==white)
									if(buf[oy-4][ox+1]==white)
									{
										System.out.println("********************");
										//System.out.printf("%s(백)의 승리!!!!\n", whiter);
										System.out.println("********************");
										scan.nextLine();
										//count = 0;
									}		
			}
		}
		
	}
	
	public void add(Stone stone) {
		stones[++current] = stone;
		//stone.setWhiteturn();

		Stone.setWhiteturn(!Stone.isWhiteturn());
		
	}
	
	public Stone[] getStones() {
		return stones;
	}
	
	public void setStones(Stone[] stone) {
		this.stones = stone;
	}


	public boolean checkDuplicated(Stone stone) {
		//return (buf[stone.getY()][stone.getX()]=='○' || buf[stone.getY()][stone.getX()]=='●');
		for(int i=0; i<=current; i++)
			if(stones[i].getY()==stone.getY() && stones[i].getX()==stone.getX())
				return true;
		return false;
		
	}
	
	
}
