package Preview01;

import java.util.Scanner;

public class prob13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���μ����� �� ���� �Է��Ͻÿ�. : ");
		int input = sc.nextInt();
		System.out.print(input + " = ");

		for (int i = 2; i <= input; i++) {
			while (input % i == 0) {
				input /= i;
				System.out.print(i);
				if (input != 1) {
				System.out.print(" * ");}
			

			}
		}

	}

}
