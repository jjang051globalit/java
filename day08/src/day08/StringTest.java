package day08;

public class StringTest {
	public static void main(String[] args) {
		String str01 = new String("Java");
		String str02 = new String("Java Script");
		
		System.out.println(str01.length());
		System.out.println(str02.length());
		System.out.println(str01.contains("Java"));
		System.out.println(str02.contains("Java"));
		System.out.println(str01.concat(str02));
		String str03 = "Java,Oracle,Javascript,Jsp,Spring";
		String strList[] = str03.split(",");
		
		for(String str : strList) {
			System.out.print(str+"/");
		}
		System.out.println();
		String jumin =  "9012122312345";
		System.out.println(jumin.substring(0,6)); 
		String year = jumin.substring(0,2);
		String month = jumin.substring(2,4);
		String date = jumin.substring(4,6);
		System.out.println(year+"년"+month+"월"+date+"일");
		
		
		//90년12월12일
		//System.out.println(strList[1]);
		
	}
}












