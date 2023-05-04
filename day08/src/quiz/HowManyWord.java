package quiz;

import java.util.Scanner;
import java.util.StringTokenizer;

public class HowManyWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String str =  scanner.nextLine();
			if(str.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			// 갯수 세기....
			// 여기다가 출력
			StringTokenizer st = new StringTokenizer(str," ");
			System.out.println("단어의 갯수는 "+st.countTokens());
		}
	}
}
