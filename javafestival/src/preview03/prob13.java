package preview03;

import java.util.Scanner;

public class prob13 {

	public static void main(String[] args) {
		// 1보다 큰 정수 n을 입력하여 n! 값을 구하여라
		// 3! = 1 * 2 * 3

		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 1;

		System.out.print("정수를 입력하세요 >> ");
		a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			b *= i;
		}
		System.out.println("결과값 : " + b);
	}

}
