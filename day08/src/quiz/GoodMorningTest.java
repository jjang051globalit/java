package quiz;

import java.util.Calendar;

public class GoodMorningTest {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int hourOfDay = now.get(Calendar.HOUR_OF_DAY);
		int minutes = now.get(Calendar.MINUTE);
		System.out.println(hourOfDay+":"+minutes);
		if(hourOfDay>=6 && hourOfDay<11 ) {
			System.out.println("Good Morning");
		} else if(hourOfDay>=11 && hourOfDay<18) {
			System.out.println("Good Afternoon");
		} else if(hourOfDay>=18 && hourOfDay<22) {
			System.out.println("Good Evening");
		} else {
			System.out.println("Good Night");
		}
		
	}
}
