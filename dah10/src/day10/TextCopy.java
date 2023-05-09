package day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class TextCopy {
	public static void main(String[] args) {
		File original = new File("C:\\Windows\\system.ini");
		File copy = new File("C:\\Temp\\system.txt");
		int c;
		try {
			FileReader fileReader = new FileReader(original);
			FileWriter fileWriter = new FileWriter(copy);
			while((c = fileReader.read())!=-1) {
				fileWriter.write((char)c);
			}
			fileWriter.close();
			fileReader.close();
			System.out.println(original.getPath()+"를 "+copy.getPath()+"로 복사하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}




