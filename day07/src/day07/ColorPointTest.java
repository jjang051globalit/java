package day07;

public class ColorPointTest {
	public static void main(String[] args) {
		Point point = new Point();
		point.set(10, 10);
		point.showPoint();
		
		ColorPoint colorPoint = new ColorPoint();
		colorPoint.set(30, 30);
		colorPoint.setColor("red");
		colorPoint.showColorPoint();
	}
}



