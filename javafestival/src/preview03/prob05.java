package preview03;

import java.util.Scanner;

public class prob05 {

	public static void main(String[] args) {
		// n과 x를 입력받고 n의 갯수만큼 수를 입력받은뒤 x보다 작은 수를 출력하라

		Scanner sc = new Scanner(System.in);

		System.out.print("n 입력 >> ");
		int n = sc.nextInt();

		System.out.print("x 입력 >> ");
		int x = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번재 정수 입력 >> ");
			arr[i] = sc.nextInt();
		}
		System.out.print("결과 : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < x) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
