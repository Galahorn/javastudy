package preview03;

import java.util.Scanner;

public class prob13 {

	public static void main(String[] args) {
		// 1���� ū ���� n�� �Է��Ͽ� n! ���� ���Ͽ���
		// 3! = 1 * 2 * 3

		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 1;

		System.out.print("������ �Է��ϼ��� >> ");
		a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			b *= i;
		}
		System.out.println("����� : " + b);
	}

}
