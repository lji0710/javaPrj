import java.util.Random;

public class LottoProgram2 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] lotto = new int[6];
		int bonus = 0;
break1:	// *********
while(true) // *********
{ // *********
		
		
		// 숙제 : 중복 검사 입력
		for(int i=0; i<6; i++)
			lotto[i] = rand.nextInt(45)+1;
		re:
		while(true)
		{	
			for(int i=0; i<6; i++)
				for(int j=0; j<6; j++)
					if((i!=j) && (lotto[i] == lotto[j]))
					{
						lotto[j] = rand.nextInt(45)+1;
						continue re;
					}
					
		break;
		}
		// 출력
		for(int i=0; i<6; i++)
			System.out.printf("%d ", lotto[i]);
		System.out.println();

		// 재정렬
		int temp = 0;
		for(int j=0; j<5; j++)
			for(int i=0; i<5-j; i++)
				if(lotto[i]>lotto[i+1])
				{
					temp = lotto[i];
					lotto[i] = lotto[i+1];
					lotto[i+1] = temp;
				}
		// 출력
		for(int i=0; i<6; i++)
			System.out.printf("%d ", lotto[i]);
		System.out.println();// *********
		for(int i=0; i<5; i++)// *********
			if(lotto[i] == lotto[i+1])// *********
			{	System.out.println("중복!!");// *********
				break break1;// *********
			}// *********
		
		
}// *********
	}
}


