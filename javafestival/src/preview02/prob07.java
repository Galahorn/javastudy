package preview02;

import java.util.Scanner;

public class prob07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 0;
		int sum = 0;

		System.out.print("���� �Է� >> ");
		num = sc.nextInt();

		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println("���� " + sum + "�Դϴ�.");

	}

}
