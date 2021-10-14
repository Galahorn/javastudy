package preview02;

import java.util.Scanner;

public class prob13 {

	public static void main(String[] args) {
		// 10진수 -> 2진수

		Scanner sc = new Scanner(System.in);

		System.out.print("입력받은 정수 : ");

		int num = sc.nextInt();
		String result = "";

		for (int i = num; i > 0; i /= 2) {
			result = String.valueOf(i % 2) + result;

		}
		System.out.println(result + " ");

	}

}
