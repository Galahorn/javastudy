
public class ex_2d_array1 {

	public static void main(String[] args) {

		// 2���� �迭�� 1���� �迭 ���� 1���� �迭�� ����ִ� ����.
		// int[][] array = new int[3][2];
		// 2���� �迭�� length
		// -intArray.length => 2���� �迭�� ���ǰ��� = 3
		// -intArray[1].length => 1��° ���� ���� ���� = 2

		int[][] arr = new int[3][2];

		// 2���� �迭 ������ �ʱ�ȭ
		// : �迭[���ε���][���ε���] = ��;

		arr[0][0] = 1;
		arr[0][1] = 2;

		arr[1][0] = 3;
		arr[1][1] = 4;

		arr[2][0] = 5;
		arr[2][1] = 6;

		// ����for���� �̿��Ͽ� 2���� �迭 ������ ���
		// array.length; = �� ũ��
		// array[�ε���].length; = �� ũ��
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {

				System.out.println(arr[row][col] + " \t");
			}
			System.out.println();
		}
		// \n�� �ٹٲ� �̽������� ����, \t�� tab���, \r�� �ü���� ���� �ٸ�
		// "" => ���ڿ� \' or \" => �ڷ����� �ƴ� ���ڵ����ͷ� �ν�
	}

}
