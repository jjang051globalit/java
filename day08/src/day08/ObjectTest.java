package day08;

// inner class
class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
//	public String toString() {
//		return "Point("+x+","+y+")";
//	}

	

	

}

public class ObjectTest {
	public static void main(String[] args) {
		Point point = new Point(10, 10);
		Point point02 = new Point(10, 10);
		point.setX(20);
		System.out.println(point.getClass());
		System.out.println(point.getClass().getName());
		System.out.println(point.hashCode());
		System.out.println(point02.hashCode());
		System.out.println(point.toString());
		System.out.println(point);
	}
}
