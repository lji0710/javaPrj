package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("[회원 검색 프로그램]");
		System.out.println();
		System.out.print("이름 검색어 입력  > ");

		String qqq = scan.nextLine();
		
		System.out.println("----------------------------------");
		System.out.println("아이디\t이름　\t나이");
		System.out.println("----------------------------------");
		
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "SELECT MID, NAME, AGE FROM MEMBER WHERE NAME LIKE '%"+qqq+"%'";
		
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);

		
		
		while(rs.next())
		{
			String mid = rs.getString("MID");
			String name = rs.getString("NAME");
			String age = rs.getString("AGE");
			

			System.out.printf("%s\t%s\t%s\n", mid, name, age);
		}

	}

}
