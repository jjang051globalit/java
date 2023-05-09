package day10;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File file01 = new File("C:\\Windows\\system.ini");
		System.out.println(file01.getPath());
		System.out.println(file01.getName());
		System.out.println(file01.getParent());
		System.out.println(file01.isDirectory());
		
		File file02 = new File("C:\\Temp\\sample");
		if(!file02.exists()) file02.mkdir();
		file02.renameTo(new File("C:\\Temp\\java_sample"));
		
		File file03 = new File("C:\\Temp");
		File[] subFiles =  file03.listFiles();
		for(int i=0;i<subFiles.length;i++) {
			File file = subFiles[i];
			System.out.println(file.getName());
		}
	}
}
