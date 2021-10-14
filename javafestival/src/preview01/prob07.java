package preview01;

import java.util.Scanner;

public class prob07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("행 개수 : ");
		int a = sc.nextInt();

		for (int i = 1; i <= a; i++) { //라인을 돌려주는 for문
			
			for (int j = i; j <= a; j++) { //별을 그려주는 for문
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
