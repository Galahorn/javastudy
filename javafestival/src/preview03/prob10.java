package preview03;

import java.util.Scanner;

public class prob10 {

	public static void main(String[] args) {
		// ���ڿ��� 10������ -> 2������ ��ȯ.

		Scanner sc = new Scanner(System.in);

		System.out.print("�Է¹��� 2���� >> ");
		String a = sc.next();
		System.out.print(a + "(2)" + " = ");

		String[] arr = a.split("");

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			switch (arr[i]) {
			case "0":
				break;
			case "1":
				sum += (int) Math.pow(2, (arr.length - 1) - i);
			}

		}
		System.out.println(sum + "(10)");
	}
}
