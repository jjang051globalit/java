package day09;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> dictionary = new HashMap<>();
		dictionary.put("apple", "사과");
		dictionary.put("grape", "포도");
		dictionary.put("strawberry", "딸기");
//		String kor = dictionary.get("grape");
//		System.out.println(kor);
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("찾고 싶은 단어를 입력하시면 찾아주니다. exit 쓰면 종료합니다.");
			String eng = scanner.next();
			if(eng.equals("exit")) break;
			String kor = dictionary.get(eng);
			if(kor==null) System.out.println("없는 단어입니다.");
			else System.out.println(kor);
		}
	}
}







