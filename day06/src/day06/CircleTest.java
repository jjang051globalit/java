package day06;

public class CircleTest {
	public static void main(String[] args) {
		
		Circle  gong = new Circle(30,"축구공");
		System.out.println(gong.name+"의 넓이는 "+gong.getArea()+"입니다.");
		
		Circle circle = new Circle();
		circle.name="써클";
		circle.radius=10;
		
		Circle circle02 = new Circle(17);
		circle02.name="써클02";
		
		System.out.println(circle02.name+"의 넓이는 "+circle02.getArea()+"입니다.");
		
		Circle pizza = new Circle();
		pizza.name = "도미노피자";
		pizza.radius = 25;
		System.out.println(pizza.name+"의 넓이는 "+pizza.getArea()+"입니다.");
		
		//던킨도넛
		Circle dunkin = new Circle();
		dunkin.name="던킨도넛";
		dunkin.radius = 10;
		System.out.println(dunkin.name+"의 넓이는 "+dunkin.getArea()+"입니다.");
		
	}
}
