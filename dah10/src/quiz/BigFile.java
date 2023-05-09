package quiz;

import java.io.File;

public class BigFile {
	public static void main(String[] args) {
		File file = new File("C:\\");
		File files[] = file.listFiles();
		long bigSize = 0;
		File bigFile = null;
		System.out.println(files.length);
		for(int i=0;i<files.length;i++) {
			File tempFile = files[i];
			//System.out.println(tempFile.getName()); 
			if(tempFile.isDirectory()) continue;
			long fileSize = tempFile.length();
			if(fileSize > bigSize) {
				bigSize = fileSize;
				bigFile = tempFile;
			}
		}
		System.out.println("가장 큰 파일은 "+bigFile.getPath()+" 용량은 "+bigSize+"바이트");
	}
}
