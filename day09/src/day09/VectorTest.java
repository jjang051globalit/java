package day09;

import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>();
		vec.add(5);
		vec.add(3);
		vec.add(1);
		
		vec.add(1, 100);

		
		
//		System.out.println(vec.size());
//		System.out.println(vec.get(0));
//		System.out.println(vec.get(1));
		System.out.println(vec.capacity());
		for(int i=0;i<vec.size();i++) {
			int num = vec.get(i);
			System.out.print(num+",");
		}
		for(int num:vec) {
			System.out.print(num+",");
		}
	}
}








