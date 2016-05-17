package netio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClientProgram {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		
		//char[] aaa = new char[]{'w','h','o','a','r','e','y','o','u','?'};
		//for(int i=0; i < aaa.length; i++){
		
		Socket socket = new Socket("211.238.142.159", 10000);
			
		System.out.println("connected to "+ socket.getRemoteSocketAddress());
		
		
		/*try(Socket socket = new Socket("211.238.142.157", 10000)){
			socket.setSoTimeout(15000);
		}catch(IOException ex){
			System.out.println("연결 오류");
		}
		System.out.println("connected to "+ socket.getRemoteSocketAddress());*/
		
		InputStream nin = socket.getInputStream();
		OutputStream nout = socket.getOutputStream();
		
		nout.write(aaa[i]);
		
		nout.flush();
		
	}

}
