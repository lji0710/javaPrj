package netio.multi.echo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClientProgram {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

		
		Socket socket = new Socket("211.238.142.116", 10000);
			
		System.out.println("connected to "+ socket.getRemoteSocketAddress());
		
		
		InputStream nis = socket.getInputStream();
		OutputStream nos = socket.getOutputStream();
		
		PrintStream nout = new PrintStream(nos, true);
		Scanner nscan = new Scanner(nis);
		Scanner scan = new Scanner(System.in);
		
		String msg;
		
		do{
			msg = scan.nextLine();
			nout.println(msg);
			
			String echo = nscan.nextLine();
			System.out.println(echo);
		}while(!msg.equals("bye"));
		
		
		nout.close();
		nscan.close();
		
		nis.close();
		nos.close();
		socket.close();
		
		
		
	}

}
