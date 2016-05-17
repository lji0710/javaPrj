import java.util.Scanner;

public class TeamTest {

	public static void main(String[] args) {

		System.out.println("공개투표");
		
		Scanner scan = new Scanner(System.in);
				
		//후보 선언
		System.out.print("후보 인원을 입력하세요 >");
		int sign = scan.nextInt();
		String[] candidate = new String[sign];
		int[] ballot = new int[sign]; 
		String election = null;
		
		for(int i=0; i<sign; i++)
		{
			System.out.printf("%d 번째 후보의 성명을 입력하세요.\n", i+1);			
			candidate[i] = scan.nextLine();
			scan.nextLine();
		//	System.out.printf("%d 번째 후보는 %s 입니다.\n", i+1, candidate[i]);
		}
		
		//투표 인원
		System.out.print("투표인원을 입력하세요 >");
		int mans = scan.nextInt();
		String[] name = new String[mans];
		int[] choice = new int[mans];
		
		//투표 하기
		for(int i=0; i<mans; i++)
		{
			System.out.printf("%d 번째 투표자 입니다.", i+1);
			System.out.println("당신의 성명을 입력하세요.");
			name[i] = scan.nextLine();

			for(int j=0; j<sign; j++)
			System.out.printf("%d번 후보는 %s \n", j+1, candidate[j]);
			
			System.out.println("---------------------------");
			System.out.print("투표하세요. > ");
			choice[i] = scan.nextInt();
		}
		
		//결과 산출
		
		for(int i=0; i<mans; i++)
			for(int j=0; j<sign; j++)
			if(choice[i] == j+1)	
				ballot[j] += 1;

		for(int i=0; i<name.length; i++)
			System.out.print(name[i]);
		System.out.println();
		for(int i=0; i<choice.length; i++)
			System.out.print(choice[i]);
		System.out.println();
		for(int i=0; i<candidate.length; i++)
			System.out.print(candidate[i]);
		System.out.println();
		for(int i=0; i<ballot.length; i++)
			System.out.print(ballot[i]);
		System.out.println();
		
		election = candidate[0];
		for(int i=0; i < candidate.length-1; i++)
			if(ballot[i] < ballot[i+1])
				election = candidate[i+1];
		
		for(int i=0; i<name.length; i++)
			System.out.print(name[i]);
		System.out.println();
		for(int i=0; i<choice.length; i++)
			System.out.print(choice[i]);
		System.out.println();
		for(int i=0; i<candidate.length; i++)
			System.out.print(candidate[i]);
		System.out.println();
		for(int i=0; i<ballot.length; i++)
			System.out.print(ballot[i]);
		System.out.println();

		//출력  // 단성자에게 투표한 사람 오류!
		System.out.printf("당선자는 %s 입니다.", election);
		System.out.println("당선자에게 투표한 사람은 >");
/*		for(int i=0; i<mans; i++)
			if(choice[i] == )
				System.out.printf("%s, ", name[i]);*/
					
	}

}
