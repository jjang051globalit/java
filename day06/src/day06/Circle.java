package day06;

public class Circle {
	int radius;
	String name;
	
	public Circle() {
		//System.out.println("나는 circle");
	}
	public Circle(int r) {
		//System.out.println("나는 circle");
		radius = r;
	}
	
	public Circle(int r, String n) {
		radius = r;
		name = n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}
