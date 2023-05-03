package day07;

public class Point {
	// 속성 (properties)
	private int x;
	private int y;
	
	//행위(메서드)를 통해서 내부의 속성을 바꾸는게 좋다.
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println( "(" + x + "," + y + ")" );
	}
	
}
