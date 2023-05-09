package day10;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedTest {
	public static void main(String[] args) {
		int c;
		try {
			FileReader fileReader = new FileReader("C:\\Temp\\test02.txt");
			BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(System.out, 5);
			while((c = fileReader.read())!=-1) {
				bufferedOutputStream.write(c);
			}
			bufferedOutputStream.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
