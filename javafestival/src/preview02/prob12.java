package preview02;

import java.util.Scanner;

public class prob12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("단수 입력 >> ");
		int a = sc.nextInt();

		System.out.println("어느 수까지 출력 >> ");
		int b = sc.nextInt();

		System.out.println(a + "단");

		for (int i = 1; i <= b; i++) {
			System.out.println(a + " * " + i + " = " + (a * i));

		}
	}

}
