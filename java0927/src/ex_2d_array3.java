
public class ex_2d_array3 {

	public static void main(String[] args) {
		// ������ũ�� col���� row���� ��ġ�� ���� ��� ����� �޶��� ������ ���� ������ũ
		int[][] arr = new int[5][5];

		int count = 21;

		for (int row = 0; row < arr.length; row++) {
			if (row % 2 == 0) {
				for (int col = 0; col < arr.length; col++) {
					arr[col][row] = count;
					++count;
				}
			} else { //�̺κ��� �ڵ� �ؼ��� �����̰� ����... �� �밡���� ���밥���ε���..
				for (int col = arr[row].length - 1; col >= 0; col--) {
					arr[col][row] = count;
					++count;
				}
			}
		}
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {
				System.out.print(arr[col][row] + "\t");
			}
			System.out.println();
		}

	}

}
