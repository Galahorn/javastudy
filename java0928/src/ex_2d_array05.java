
public class ex_2d_array05 {

	public static void main(String[] args) {
		// 1. 2���� �迭�� ����. �������̷���
		// �̺κ��� �����κ� �����߿� �߱�����
		int[][] arr = new int[5][10];

		// 2. �״����� ����? �ʱ�ȭ �ؾ���.
		int cnt = 1;

		for (int row = 0; row < arr.length; row++) { // �࿡ ����
			for (int col = 0; col < arr[row].length; col++) { // ���� ����
				arr[row][col] = cnt++;
				System.out.print(arr[row][col] + "\t"); // ���
			}
			System.out.println(); // �ٹٲ�

		}

	}

}
