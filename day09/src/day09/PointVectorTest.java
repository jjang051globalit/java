package day09;

import java.util.Iterator;
import java.util.Vector;

class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}

public class PointVectorTest {
	public static void main(String[] args) {
		Vector <Point> pointVec = new Vector<>();
		
		pointVec.add(new Point(10,10));
		pointVec.add(new Point(20,20));
		pointVec.add(new Point(30,30));
//		System.out.println(pointVec.get(0).getX());
//		System.out.println(pointVec.get(0).getY());
//		System.out.println(pointVec.get(0).toString());
//		
//		for(int i=0;i<pointVec.size();i++) {
//			Point point = pointVec.get(i);
//			System.out.println(point.toString());
//		}
//		for(Point point:pointVec) {
//			System.out.println(point.toString());
//		}
		Iterator<Point> it = pointVec.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
//		System.out.println(it.next().toString());
//		System.out.println(it.next().toString());
		
	}
}












