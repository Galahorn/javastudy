
public class ex_Sequential_search {

	public static void main(String[] args) {
		// �˻� �˰��� >> ���״�� �˻��̴�
		// Sequential search = �����˻� > �ܼ�, ������ �ʿ����, �ٸ� ��ȿ����.
		// �� ���� ��

		int[] arr = { 12, 35, 15, 11, 25, 72, 78, 13, 61, 90, 47 };

		int search = 11;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				System.out.println("��ġ�� " + (i + 1) + "��°��");
			}
		}

	}

}
