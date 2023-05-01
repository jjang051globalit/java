package day05;

public class Score {
	public static void main(String[] args) {
		
		double scoreList[][] = 
			{{2.49,2.38},
			 {2.34,3.5},
			 {3.87,2.88},
			 {4.1,3.9}
			};
		// 코딩하지 않은자 먹지도 말지어라...
		//4년 학점 평균 구해보기...
		System.out.println("scoreList.length==="+scoreList.length);
		System.out.println("scoreList[1].length==="+scoreList[1].length);
		double sum = 0;
		for(int year=0;year<scoreList.length;year++) {
			for(int term=0;term<scoreList[year].length;term++) {
				sum+=scoreList[year][term];
			}
		}
		System.out.println(sum / (scoreList.length*scoreList[0].length));
	}
}
