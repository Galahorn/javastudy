
public class ex_2d_array4 {

	public static void main(String[] args) {
		// �Ʒ��� ���

		int[][] arr = new int[5][5];
		int num = 21;

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[col][row] = num; // �Ʒ��� ���� ����� ���� �ప�� ������ ��ġ�� �ٲ���
				num += 1;
			}

		}
		// ���
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + "\t");
			}
			System.out.println();
		}

	}

}
