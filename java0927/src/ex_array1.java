import java.util.Random;

public class ex_array1 {

	public static void main(String[] args) {
		// 1���� �迭 (ũ�� 5) �����ϱ�
		int[] arr = new int[5];

		// 2. ������ �迭�� �������� �����ϱ�
		Random rd = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(20) + 1;

			System.out.print(arr[i] + " ");
		}
		// 3. ������ ���� ���Ͽ� ���� ū ���� ã�Ƴ���!
		// ������ ���� ���� �� �ִ� ������ �ʿ�
		// ���� ū ���� ����Ҽ� �ִ� ���� ����
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

			} else if (arr[i] < min) {
				min = arr[i];
			}

		}
		System.out.println();
		System.out.println("���� ū �� :" + max);
		System.out.println("���� ���� �� :" + min);
	}
}