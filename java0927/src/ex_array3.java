import java.util.Scanner;

public class ex_array3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// �迭�� ���� ��Ұ��� ������ŭ ��������.
		String[] arr = { "��", "��" };

		System.out.print("���ڸ� �Է��� �ּ��� >> ");
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
