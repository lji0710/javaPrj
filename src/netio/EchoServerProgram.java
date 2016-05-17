package netio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		ServerSocket serSocker = new ServerSocket(10000);
		
		System.out.println("listenning...");
		Socket socket = serSocker.accept();
		
		System.out.println("connected from "+socket.getRemoteSocketAddress());
		
		InputStream nin = socket.getInputStream();
		OutputStream nout = socket.getOutputStream();
		
		OutputStream fout = new FileOutputStream("C:\\aaa\\111.jpg");
		
		for(int i = nin.read(); i != -1; i= nin.read())
			fout.write(i);
		
		fout.flush();
		
		fout.close();
		
		nin.close();
		nout.close();
		socket.close();
		System.out.println("전송된 파일이 저장되었습니다.");
		
		
//		
//		char c = (char) nin.read();
//		
//		System.out.println(c);
	}

}
