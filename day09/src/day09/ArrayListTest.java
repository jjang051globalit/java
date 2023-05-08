package day09;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		//이름을 입력받아서 제일 긴 이름 출력해보기....
		ArrayList<String> nameList = new ArrayList<>();
		nameList.add("토르");
		nameList.add("아이언맨");
		nameList.add("캡틴아메리카");
		nameList.add("스파이더맨");
		nameList.add("김수한무 거북이와 두루미 삼천갑자 동방삭");
		
		
		int longest = 0;
		
		for(int i=0;i<nameList.size();i++) {
			System.out.println(nameList.get(i));
		}
		for(int i=0;i<nameList.size();i++) {
			if(nameList.get(longest).length()  <  nameList.get(i).length()) {
				longest = i;
			}
		}
		System.out.println("가장 긴 이름은==="+nameList.get(longest));
	}
}
