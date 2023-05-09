package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;
public class WordSearch {
	public static void main(String[] args) {
		// 단어를 입력하면 해당하는 단어 찾아주기...
		// words.txt 읽어서 vector에 넣어야 한다.
		// vector에 집어 넣는거 해보기....
		File file = new File("C:\\Temp\\words.txt");
		Vector<String> wordList = new Vector<>();
		Scanner scanner = new Scanner(System.in);
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader wordReader = new BufferedReader(fileReader);
			while(true) {
				String line = wordReader.readLine();
				if(line==null) break;
				wordList.add(line);
			}
			wordReader.close();
			// 입력 끝
			//System.out.println(wordList.size());
			while(true) {
				System.out.println("단어를 입력하세요 >>> ");
				String searchWord = scanner.nextLine();
				if(searchWord.equals("그만")) break;
				for(int i=0;i<wordList.size();i++) {
					String word = wordList.get(i);
					if(word.length()<searchWord.length()) continue;
					String frontWord = word.substring(0,searchWord.length());
					if(searchWord.equals(frontWord)) {
						System.out.println(word);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}










