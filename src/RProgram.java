
public class RProgram {

	public static void main(String[] args) {

		int n = 3;
		
		int sum = sum(n);

		System.out.println(sum);
	}

	private static int sum(int n) {
		
		if(n==1)
			return 3;
		return sum(n-1) + an(n);
		
	}

	private static int an(int n) {
		 
		return 3+(n-1)*7;
	}

}
