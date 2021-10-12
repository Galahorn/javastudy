package preview02;

import java.util.Scanner;

public class prob09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 정수 입력 >> ");
			arr[i] = sc.nextInt();

		}
		System.out.print("3의 배수 : ");

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] % 3 == 0) {
				System.out.print(" " + arr[j]);
			}
		}

	}

}
