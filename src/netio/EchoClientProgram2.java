package netio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClientProgram2 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		
		//char[] aaa = new char[]{'w','h','o','a','r','e','y','o','u','?'};
		//for(int i=0; i < aaa.length; i++){
		
		Socket socket = new Socket("211.238.142.159", 10000);
			
		System.out.println("connected to "+ socket.getRemoteSocketAddress());
		
		
		InputStream nis = socket.getInputStream();
		OutputStream nos = socket.getOutputStream();
		
		PrintStream nout = new PrintStream(nos, true);
		Scanner nscan = new Scanner(nis);
		
		nout.println("babo babo babo");
		
		String msg = nscan.nextLine();
		System.out.println(msg);
		
		nout.close();
		nscan.close();
		
		nis.close();
		nos.close();
		socket.close();
		
		
		
	}

}
