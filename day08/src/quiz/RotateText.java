package quiz;

public class RotateText {
	public static void main(String[] args) {
		String str= "오늘 지나면 3일 연휴입니다. 신난다.";
		int total = str.length();
		for(int i=0;i<total*100;i++) {
			String first = str.substring(0,1);
			String rest = str.substring(1);
			str=rest + first;
			System.out.println(str);
		}
	}
}
