package netio.multi.chat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class EchoServerProgram {

	public static void main(String[] args) throws IOException {
		
		List<PrintStream> nouts = new ArrayList<>();
		ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
		
		boolean isRun = true;
		
		ServerSocket serSocker = new ServerSocket(10000);
		
		System.out.println("listenning...");
		
		while(isRun){
				
			Socket socket = serSocker.accept();
			System.out.println("connected from "+socket.getRemoteSocketAddress());
			
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					
					try {
						InputStream nis = socket.getInputStream();
						OutputStream nos = socket.getOutputStream();
						
						readWriteLock.writeLock().lock();
						PrintStream nout = new PrintStream(nos, true); 
						nouts.add(nout);
						readWriteLock.writeLock().unlock();
						
						Scanner nscan = new Scanner(nis);
						
						String msg;
						
						do{
							msg = nscan.nextLine();
							System.out.println(msg);
							
							//nout.println("echo : " + msg);
							for(int i=0; i< nouts.size(); i++)
								nouts.get(i).println(msg);
							
						}while(!msg.equals("bye"));
						
						
						nout.close();
						nscan.close();
						
						nis.close();
						nos.close();
						socket.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					
				}
			}).start();
			
		
		}		
	}

}
