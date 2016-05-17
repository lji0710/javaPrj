import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileProgram2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("res/photo/photo01.bmp");

		FileOutputStream fos = new FileOutputStream("res/photo/photo-copy.bmp");

		
		fis.read();
		fis.read();
		byte[] buf = new byte[4];
		buf[0] = (byte)fis.read();
		buf[1] = (byte)fis.read();
		buf[2] = (byte)fis.read();
		buf[3] = (byte)fis.read();
		
		int totalSize = ((int)buf[3]&0xff)<<24 |
						  ((int)buf[2]&0xff)<<16 |
						  ((int)buf[1]&0xff)<<8 |
						  ((int)buf[0]&0xff)<<0;
		System.out.println(totalSize);
	
		
		
		
/*		while(true)
		{
			int n = fis.read();
			if(n == -1)
				break;
			else
				fos.write(n);
		}*/
		
		/*int n;
		do
		{
			n = fis.read();
			fos.write(n);
		}while(n != -1);*/
		
/*		int n;
		while((n=fis.read()) != -1)
			fos.write(n);*/
		
		
/*		byte[] buf = new byte[1024];
		
		int size;
		
		while((size = fis.read(buf)) != -1)
			fos.write(buf, 0, size);
		
		fis.read();*/
				
/*		fis.close();
		fos.close();
		*/

	}

}
