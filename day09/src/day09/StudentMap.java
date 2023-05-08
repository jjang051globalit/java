package day09;

import java.util.HashMap;
import java.util.Scanner;

class Student {
	private int id;
	private String tel;
	public Student(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
	public int getId() {
		return id;
	}
	public String getTel() {
		return tel;
	}
	
}
public class StudentMap {
	public static void main(String[] args) {
		HashMap<String,Student> studentMap = new HashMap<>();
		studentMap.put("정진영", new Student(1, "010-1111-1111"));
		studentMap.put("안현우", new Student(2, "010-2222-2222"));
		studentMap.put("장은진", new Student(3, "010-3333-3333"));
		studentMap.put("최수민", new Student(4, "010-4444-4444"));
		studentMap.put("박태은", new Student(5, "010-5555-5555"));
		Scanner scanner = new Scanner(System.in);
		// 이름을 입력하면 정진영 id:1===tel:010-1111-1111
		while(true) {
			System.out.println("이름을 입력해 주세요. exit를 쓰면 종료합니다.");
			String name = scanner.nextLine();
			if(name.equals("exit")) break;
			Student student = studentMap.get(name);
			if(student==null) System.out.println("없는 사람입니다.");
			else System.out.println(name + "ID : "+student.getId()+"===tel : "+student.getTel());
		}
	}
	
}






