package day05;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		
		for (int k = 0; k < 5; k++) {
			int lotto[] = new int[6]; // 공간확보
			System.out.print("로또번호"+(k+1)+" : ");
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < lotto.length; i++) {
				// System.out.println(i);
				lotto[i] = (int) (Math.random() * 45) + 1;
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
			Arrays.sort(lotto);
			// Arrays.sort(lotto,Collections.reverseOrder());
			for (int j = 0; j < lotto.length; j++) {
				System.out.print(lotto[j] + ",");
			}
			System.out.println();
		}
	}
}
