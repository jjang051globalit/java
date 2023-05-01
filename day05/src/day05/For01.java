package day05;

public class For01 {
	public static void main(String[] args) {
		// 1+2+3+...9+10=55
		//System.out.println("1+2+");
		// 문 (statement 제어문, 반복문)
		// 식 (계산)
		int sum = 0;
		for(int i = 1;i<=10;i++) {
			sum=sum+i; // 1
			System.out.print(i);
			if(i<10) {
				System.out.print("+");
			} else {
				System.out.print("=");
				System.out.print(sum);
			}
		}
	}
}
