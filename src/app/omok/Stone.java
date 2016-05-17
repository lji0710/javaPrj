package app.omok;

import java.util.Scanner;


public class Stone {

	private int x;
	private int y;
	private int type;
	private static boolean whiteturn; 

	public Stone()
	{
		x = -1;
		y = -1;
		type = 1; // 검은돌
			
	}
	
	public static boolean isWhiteturn() {
		return whiteturn;
	}


	static{
		whiteturn = false;
	}

	
	public static void setWhiteturn(boolean whiteturn) {
		Stone.whiteturn = whiteturn;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void input()
	{
		Scanner scan = new Scanner(System.in);
		// 돌두기 --------------------------------------
//		breakTurn:
//		while(true)
//		{

/*			// 턴 및 둘 차례 알려주기
			System.out.printf("턴수: %d    ", count+1);*/
			if(whiteturn)
				
				type = 2;
			else
				type = 1;
			if(type == 1)
				System.out.println("●돌 차례입니다.");
			else
				System.out.println("○돌 차례입니다.");
			System.out.print("돌을 둘 위치 : x sp y > ");
			x = scan.nextInt()-1;
			y = scan.nextInt()-1;
			
			
			
/*			//사용자 입력위치에 돌이 있는지 확인
			for(int i=0; i<count; i++)
			if(ys[i] == y && xs[i] == x)
			{
				System.out.printf("같은 위치에 돌이 있습니다.\n");
				continue breakTurn;
			}*/
//			break;
//		}	
		
	}

	public void put(char[][] buf) {
			buf[y][x] = (type == 1 ? '●' : '○');
			
	}
		
}
		
	

