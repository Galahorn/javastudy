package Preview01;

import java.util.Scanner;

public class prob07 {

	public static void main(String[] args) {

		//별찍기 역순에 스캐너만 더한거
		Scanner sc = new Scanner(System.in);

		System.out.print("행 개수 : ");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) { // 행을 돌려주는 for문
			for (int j = i; j <= row; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
