package netio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServerProgram3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		ServerSocket serSocker = new ServerSocket(10000);
		
		System.out.println("listenning...");
		Socket socket = serSocker.accept();
		
		System.out.println("connected from "+socket.getRemoteSocketAddress());
		
		InputStream nis = socket.getInputStream();
		OutputStream nos = socket.getOutputStream();
		
		PrintStream nout = new PrintStream(nos, true); 
		Scanner nscan = new Scanner(nis);
		
		String msg;
		
		do{
			msg = nscan.nextLine();
			System.out.println(msg);
			
			nout.println("echo : " + msg);
		}while(!msg.equals("bye"));
		
		
		nout.close();
		nscan.close();
		
		nis.close();
		nos.close();
		socket.close();
		
		
	}

}
