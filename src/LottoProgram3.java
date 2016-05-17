import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

import javax.tools.FileObject;

public class LottoProgram3 {

	public static void main(String[] args) throws IOException {
		
	    //FileInputStream fis = new FileInputStream("D:\\files\\lotto.txt");
		
		//Scanner fscan = new Scanner(fis);
		
		Random rand = new Random();
		int[] lotto = new int[6];
		int bonus = 0;

		// 숙제 : 중복 검사 입력
		for(int i=0; i<6; i++)
			lotto[i] = rand.nextInt(45)+1;//lotto[i] = fscan.nextInt();
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
		
		//fscan.close();
		//fis.close();
		
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
		
		// 파일 출력을 위한 FileOutputStream
		//FileOutputStream fos = new FileOutputStream("D:\\files\\lotto.txt");
		//PrintStream pfos = new PrintStream(fos);
		// 출력
		for(int i=0; i<6; i++)
		{
			System.out.printf("%d ", lotto[i]);
			//pfos.printf("%d ", lotto[i]);
		}
		//pfos.close();
		//fos.close();

	}
}


