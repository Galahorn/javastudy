package preview03;

import java.util.Scanner;

public class prob05 {

	public static void main(String[] args) {
		// n�� x�� �Է¹ް� n�� ������ŭ ���� �Է¹����� x���� ���� ���� ����϶�

		Scanner sc = new Scanner(System.in);

		System.out.print("n �Է� >> ");
		int n = sc.nextInt();

		System.out.print("x �Է� >> ");
		int x = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "���� ���� �Է� >> ");
			arr[i] = sc.nextInt();
		}
		System.out.print("��� : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < x) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
