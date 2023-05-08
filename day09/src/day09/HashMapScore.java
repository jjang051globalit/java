package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScore {
	public static void main(String[] args) {
		HashMap<String,Integer> score = new HashMap<>();
		score.put("정진영", 85);
		score.put("안현우", 88);
		score.put("장은진", 90);
		score.put("최수민", 95);
		score.put("박태은", 92);
		score.put("박태은", 102);
		score.put("박태은", 200);
		
		
		
		Set<String> keyList = score.keySet();
		Iterator<String> it = keyList.iterator();
		while(it.hasNext()) {
			String name = it.next();
			int num = score.get(name);
			System.out.println(name+":"+num);
		}
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
	}
}











