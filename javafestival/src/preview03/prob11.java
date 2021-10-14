package preview03;

import java.util.Random;
import java.util.Scanner;

public class prob11 {

	public static void main(String[] args) {
		// 랜덤으로 두 정수값을 뽑아 맞으면 성공 틀리면 실패 5번 실패시 게임끝

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
				System.out.println("정답!");
								
			} else {
				System.out.println("오답!");
				failcount++;
			}
		}
		System.out.println("Game over.");

	}

}
