package preview03;

import java.util.Random;
import java.util.Scanner;

public class prob11 {

	public static void main(String[] args) {
		// �������� �� �������� �̾� ������ ���� Ʋ���� ���� 5�� ���н� ���ӳ�

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		int failcount = 0;

		while (failcount < 5) {
			int a = rd.nextInt(8) + 1;
			int b = rd.nextInt(8) + 1;

			int sum = a + b;
			System.out.print(a + " + " + b + " = ");
			
			int c = sc.nextInt();
			
			if (c == sum) {
				System.out.println("����!");
								
			} else {
				System.out.println("����!");
				failcount++;
			}
		}
		System.out.println("Game over.");

	}

}
