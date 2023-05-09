package day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

public class FileReaderHangul {
	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream= new FileInputStream("C:\\Temp\\hangul.txt");
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"MS949");
			System.out.println("인코딩 방식은==="+inputStreamReader.getEncoding());
			int c;
			while((c = inputStreamReader.read()) != -1) {
				System.out.print((char)c);
			}
			inputStreamReader.close();
			fileInputStream.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
