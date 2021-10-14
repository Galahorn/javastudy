package preview02;

import java.util.Scanner;

public class prob05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		int a = sc.nextInt();

		int[][] arr = new int[a][a];
		int count = 1;

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = count;
				count++;
				}

			} else {

				for (int j = arr[i].length -1 ; j >=0 ; j--) {
					arr[i][j] = count;
					count++;
				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}

}
