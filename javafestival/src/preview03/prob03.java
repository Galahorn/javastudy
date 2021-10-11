package preview03;

import java.util.Arrays;
import java.util.Scanner;

public class prob03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 수 입력 : ");
			arr[i] = sc.nextInt();

		}
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					// 큰수를 뒤로 보내주기 위해 치환 사용하기!
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;

				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}
