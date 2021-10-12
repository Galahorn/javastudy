package preview01;

import java.util.Scanner;

public class prob11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("n ют╥б  : ");
		int a = sc.nextInt();
		int b = 1;

		for (int i = 0; i <= a; i++) {
			b += i;

			System.out.print(b + " ");
		}

	}

}
