package day07;
public class ColorPoint extends Point {
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color+" / ");
		this.showPoint();
	}
}
