import java.util.Scanner;

public class ex_array3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 배열의 값은 요소값의 갯수만큼 정해진다.
		String[] arr = { "수", "박" };

		System.out.print("숫자를 입력해 주세요 >> ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			// System.out.print(i % 2 == 0 ? arr[1] : arr[0]);

			if (i % 2 == 0) {
				System.out.print(arr[1]);
			} else {
				System.out.print(arr[0]);
			}
		}

	}

}
