package day05;

public class Array02 {
	public static void main(String[] args) {

		int nums[] = { 1, 3, 5, 7, 9, 10, 12, 19, 900, 40 }; // 배열은 중요하다.
		int total = nums.length;
		System.out.println(total);

		String fruits[] = new String[5];
		fruits[0] = "포도";
		fruits[1] = "딸기";
		fruits[2] = "사과";
		fruits[3] = "오렌지";
		fruits[4] = "키위";

		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}

		String fruit0 = "포도";
		String fruit1 = "딸기";
		String fruit2 = "사과";
		String fruit3 = "오렌지";
		String fruit4 = "키위";
		System.out.println(fruit0);
		System.out.println(fruit1);
		System.out.println(fruit2);
		System.out.println(fruit3);
		System.out.println(fruit4);

		String animals[] = { "강아지", "고양이", "사자", "호랑이" };
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}
		for (String animal : animals) {
			System.out.println(animal);
		}

		// 3,5,6,7,8,14,37,64,87,90
		int nums02[] = { 23, 45, 67, 78, 56, 3, 9, 12, 85, 889889, 898, 909, 784387 };
		for (int i = 0; i < nums02.length; i++) {
			if (nums02[i] % 3 == 0) {
				System.out.print(nums02[i] + " ");
			}
		}
		System.out.println();
		for(int num : nums02) {
			if (num % 3 == 0) {
				System.out.print(num + " ");
			}
		}
	}
}
//2차원 배열,






