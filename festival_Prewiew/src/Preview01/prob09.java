package Preview01;

import java.util.Scanner;

public class prob09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자 : ");
		int a = sc.nextInt();

		System.out.print("두번째 숫자 : ");
		int b = sc.nextInt();

		int result1 = 0;
		for (int i = 1; i <= a * b; i++) {
			if (i % a == 0 && i % b == 0) {
				result1 = i;
				break;
			}
		}

		int result2 = 0;

		for (int i = a; i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				result2 = i;
				break;

			}
		}

		System.out.println("최소공배수 : " + result1);
		System.out.println("최대공약수 : " + result2);
	}
}
