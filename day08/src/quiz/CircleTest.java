package quiz;

class Circle {
	private int x,y,radius;

	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public boolean equals(Object obj) {
		Circle circle = (Circle)obj;
		if(circle.x==x && circle.y==y) return true;
		return false;
	}
	
}

public class CircleTest {
	public static void main(String[] args) {
		Circle circle01 = new Circle(10,10,100);
		Circle circle02 = new Circle(10,23,50);
		if(circle01.equals(circle02)) {
			System.out.println("같은 원입니다.");
		} else {
			System.out.println("다른 원입니다.");
		}
		
	}
}






