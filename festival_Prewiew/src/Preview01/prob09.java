package Preview01;

import java.util.Scanner;

public class prob09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� : ");
		int a = sc.nextInt();

		System.out.print("�ι�° ���� : ");
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

		System.out.println("�ּҰ���� : " + result1);
		System.out.println("�ִ����� : " + result2);
	}
}
