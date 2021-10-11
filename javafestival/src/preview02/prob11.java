package preview02;

import java.util.Scanner;

public class prob11 {

	public static void main(String[] args) {

		// 배내의 인덱스 수만큼 별을 출력하기

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 별의 수 >> ");
			arr[i] = sc.nextInt();
	
		}
		

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				System.out.print("*");

			}
			System.out.println();

		}

	}

}
