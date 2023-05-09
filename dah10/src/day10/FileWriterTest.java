package day10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			FileWriter fileWriter = new FileWriter("C:\\Temp\\my.txt");
			while(true) {
				String line = scanner.nextLine();
				if(line.length()==0) break; // 빠져 나가기 
				fileWriter.write(line,0,line.length());
				fileWriter.write("\r\n");
			}
			fileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}
