
public class ex_2d_array2 {

	public static void main(String[] args) {
		// 5�� 5�� ũ���� 2���� array�� ������ �� 1~25���� �����͸� �ʱ�ȭ �Ͻÿ�.

		int[][] arr = new int[5][5];

		int count = 1;

		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {

				arr[row][col] = count;
				count += 1;

			}
		}

		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {

				System.out.print(arr[row][col] + "\t");
			}
			System.out.println();
		}

	}

}
