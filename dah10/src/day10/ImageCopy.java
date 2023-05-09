package day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

public class ImageCopy {
	public static void main(String[] args) {
		File originalImg = new File("C:\\Temp\\jun.jpg");
		File copyImg = new File("C:\\Temp\\jun_copy.jpg");
		Date date = null;
		int c;
		try {
			FileInputStream fileInputStream = new FileInputStream(originalImg);
			FileOutputStream fileOutputStream = new FileOutputStream(copyImg);
			byte buffer[]=new byte[1024*10];
			date = new Date();
			long start = date.getTime();
			System.out.println(start);
			//eof
//			while((c = fileInputStream.read())!=-1) {
//				fileOutputStream.write((byte)c);
//			}
			while(true) {
				int num = fileInputStream.read(buffer);
				//System.out.println(num);
				fileOutputStream.write(buffer,0,num);
				if(num<buffer.length) break;
			}
			date = new Date();
			long end = date.getTime();
			System.out.println((end-start));
			fileInputStream.close();
			fileOutputStream.close();
			System.out.println(originalImg.getPath()+"를 "+copyImg.getPath()+"로 복사하였습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}


