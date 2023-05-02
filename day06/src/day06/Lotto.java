package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
	public Lotto() {
		
	}
	public Lotto(int many) {
		howMany(many);
	}
	public void howMany(int many) {
		for(int i=0;i<many;i++) {
			makeLotto();
		}
	}
	
	private void makeLotto() {
		int lotto[] = new int[6]; // 공간확보
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		for (int j = 0; j < lotto.length; j++) {
			System.out.print(lotto[j] + ",");
		}
		System.out.println();
	}
}




