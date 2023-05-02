package day06;

public class GradeTest {
	public static void main(String[] args) {
		Grade myGrade = new Grade(12,88,99);
		double avg = myGrade.average(5);
		System.out.println(avg);
	}
}
