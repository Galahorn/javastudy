package preview02;

import java.util.Scanner;

public class prob13 {

	public static void main(String[] args) {
		// 10���� -> 2����

		Scanner sc = new Scanner(System.in);

		System.out.print("�Է¹��� ���� : ");

		int num = sc.nextInt();
		String result = "";

		for (int i = num; i > 0; i /= 2) {
			result = String.valueOf(i % 2) + result;

		}
		System.out.println(result + " ");

	}

}
