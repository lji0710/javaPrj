package netio.multi.echo;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jdk.net.Sockets;

public class EchoServerProgram2 {

	private static Socket[] sockets = new Socket[100];
	private static int add = 0;
	private static OutputStream[] nos = new OutputStream[100];
	private static PrintStream[] nout = new PrintStream[100];
	
	public static void main(String[] args) throws IOException {
		
		boolean isRun = true;
		
		ServerSocket serSocker = new ServerSocket(10000);
		
		System.out.println("listenning...");
		
		while(isRun){
				
			sockets[add] = serSocker.accept();
			
			System.out.println("connected from "+sockets[add].getRemoteSocketAddress());
			int ttt = add;
			add++;
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					
					try {
						int temp = -1;
						if(temp == -1)
							temp = ttt;
						InputStream nis = sockets[temp].getInputStream();
						
						
						
						Scanner nscan = new Scanner(nis);
						
						String msg;
						
						do{
							msg = nscan.nextLine();
							System.out.println(msg);
							
							cast(msg);

						}while(!msg.equals("bye"));
						
						
						
						nscan.close();
						
						nis.close();
						
						sockets[temp].close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					
				}

			}).start();
			
		
		}		
	}

	private static void cast(String msg) throws IOException {
		
		for(int i = 0; i< sockets.length; i++){
			if(sockets[i] != null){
			nos[i] = sockets[i].getOutputStream();
			nout[i] = new PrintStream(nos[i], true); 
				nout[i].println("echo : " + msg);
				nout[i].close();
				nos[i].close();
			}
		}
	}
}
