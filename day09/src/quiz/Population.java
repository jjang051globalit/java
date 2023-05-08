package quiz;

import java.util.HashMap;
import java.util.Scanner;

public class Population {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<>();
		nations.put("한국", 5000);
		nations.put("미국", 25000);
		nations.put("중국", 100000);
		nations.put("인도", 140000);
		nations.put("일본", 15000);

		Scanner scanner = new Scanner(System.in);
		
			
		while (true) {
			System.out.println("나라를 입력하면 인구수를 알려드립니다. exit를 입력하면 빠져 나갑니다.");
			String nation = scanner.next();
			if (nation.equals("exit")) {
				break;
			} else {
				Integer population = nations.get(nation);
				if (population == null) {
					System.out.println("없는 나라입니다.");
				} else {
					System.out.println(nation + "의 인구는 " + population);
				}
			}
		}
	}
}
