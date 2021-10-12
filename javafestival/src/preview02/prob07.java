package preview02;

import java.util.Scanner;

public class prob07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 0;
		int sum = 0;

		System.out.print("숫자 입력 >> ");
		num = sc.nextInt();

		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println("합은 " + sum + "입니다.");

	}

}
