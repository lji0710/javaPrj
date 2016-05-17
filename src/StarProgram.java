
public class StarProgram {

	public static void main(String[] args) {
		
		for(int y=1; y<=20; y++)
		{
			for(int x=1; x<=20; x++)
			{
				if(x<=y && x <= -y+21)
					System.out.print("★");
				else
					System.out.print("○");
			}
			System.out.println();
		}
		
		
		
		
		/*for(int i=0; i<20; i++)
			if(i%3 == 1)
				System.out.print("☆");
			else
				System.out.print("○");*/

	
/*System.out.print("\n----------------\n");

		for(int j=1; j<10; j++)
		{
			for(int i=0; i<10; i++)
				if(i==j)
					System.out.print("☆");
				else
					System.out.print("○");
			System.out.println();
		}
*/	}

}
