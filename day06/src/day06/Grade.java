package day06;

public class Grade {
	// kor, eng, math
	// 평균 출력하는 class
//	Grade myGrade = new Grade(60,80,70);
//	double myGrade.average();
//	나의 평균은 82.5입니다.
	public double kor;
	public double eng;
	public double math;
	
	public Grade() {
			
	}
	public Grade(double kor, double eng, double math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public double average(int digit) {
//		double num = 1;
//		for(int i=0;i<digit;i++ ) {
//			num=num*10;
//		}
		double num = Math.pow(10, digit);
		double avg = Math.round((kor+eng+math)/3*num);
		
		return avg/num;
	}
}













