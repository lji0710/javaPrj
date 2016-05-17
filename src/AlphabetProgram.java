
public class AlphabetProgram {

	public static void main(String[] args) {
		
		int cnt = 'Z'-'A'+1;
		
		/*for(int i=0; i<cnt; i++)
			System.out.printf("%c", 'A'+i); //'A' = 65*/

		/*for(int i=0; i<cnt; i++)
			System.out.printf("%c", 'Z'-i);*/
		
		/*cnt *=2;
		for(int i=0; i<cnt; i++)
			System.out.printf("%c", 'A'+i%(cnt/2));*/
		
		cnt *=2;
		for(int i=0; i<cnt; i++)
			System.out.printf("%c", i<26 ? 'A'+(i%26) : 'Z'-(i%26));
		
		
		

	}

}
