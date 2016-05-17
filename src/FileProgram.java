import java.io.IOException;


public class FileProgram {

	public static void main(String[] args) throws IOException {
		
		char[] str = new char[]{'H','e','l','l','o',0,'o','k','\0'}; // 0 = '\0'
		
		System.out.println("Hello Wellcome to Korea".substring(6));
		System.out.println("Hello Wellcome to Korea".substring(5));
		System.out.println("Hello Wellcome to Korea".length());
		
		
		
		//문자열 나누기
		System.out.println("lotto : 12 23 45".split(" : "));
		String[] strs = "lotto : 12 23 45".split(" : ");
		System.out.println(strs[0]);
		System.out.println(strs[1]);
		
		//문자열 짜르기
		System.out.println("Hello".substring(2, 5));
		
		//문자열 비교하기
		String name1 = "아이유";
		String name2 = new String("아이유");
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));
		System.out.println(name1 == "아이유");
		System.out.println(name2 == "아이유");
		
		//문자열 찾기
		System.out.println("Hello".indexOf("e"));
		System.out.println("Hello".indexOf("a"));
		int idx ="Hello how are you".indexOf("o"); 
		System.out.println(idx);
		idx ="Hello how are you".indexOf("o", idx+1); 
		System.out.println(idx);
		idx ="Hello how are you".indexOf("o", idx+1);
		System.out.println(idx);
		
		String filename = "file1.txt";
		idx = "file1.txt".indexOf(".");
		System.out.println(filename.substring(idx+1));
		
		// 뒤에서부터 찾기
		String path = "D:\\files\\hello.txt";
		idx = path.lastIndexOf("\\");
		System.out.println(path.substring(idx+1));
		
		// 문자열 => 숫자 => 문자열
		
		int kor = Integer.parseInt("23");
		System.out.println(kor);
		System.out.println(kor+2);
		
		String s = "" + kor;   
		System.out.println(s);  // 문자 23
		System.out.println(s + 2);  // 문자 232
		System.out.println(s + "2");  // 문자 232
		
		
		
/*		FileOutputStream fos = new FileOutputStream("D:\\files\\hello.txt");
		PrintStream pfos = new PrintStream(fos);
		
		pfos.printf("lotto : %d %d %d", 10, 20, 30);
		
				
		//pfos.close();
		//fos.close();

		System.out.println("입력 받아 볼까요?");
		
		
		FileInputStream fis = new FileInputStream("D:\\files\\hello.txt");
		Scanner fscan = new Scanner(fis);
		
		fscan.next();
		fscan.next();
		int n1 = fscan.nextInt();
		int n2 = fscan.nextInt();
		int n3 = fscan.nextInt();
		
		System.out.printf("n1: %d\nn2: %d\nn3: %d\n", n1, n2, n3);*/
	
	}

}
