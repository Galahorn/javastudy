package Preview01;

import java.util.Scanner;

public class prob11 {

	public static void main(String[] args) {
		// 계차수열 구하기

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int a = sc.nextInt();
		int b = 1;

		for (int i = 0; i <= a; i++) {
			b += i;
			System.out.print(b + " ");
		}

	}

}
