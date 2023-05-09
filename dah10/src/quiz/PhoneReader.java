package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PhoneReader {
	public static void main(String[] args) {
		File phone = new File("C:\\Temp\\phone.txt");
		try {
			int c;
			FileReader fileReader = new FileReader(phone);
			while(true) {
				c = fileReader.read();
				if(c == -1) break;
				System.out.print((char)c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
}	
