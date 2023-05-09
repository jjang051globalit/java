package day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamTest {
	public static void main(String[] args) {
		byte byteArray[] = new byte[6];
		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\Temp\\test.out");
			int num=0;
			int c;
			while((c=fileInputStream.read())!=-1) {
				byteArray[num] = (byte)c;
				num++;
			}
			for(int i=0;i<byteArray.length;i++) {
				System.out.print(byteArray[i]+" ");
			}
			fileInputStream.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
