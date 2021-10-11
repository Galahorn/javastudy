
public class ex_Binary_search {

	public static void main(String[] args) {
		// Binary_search >> ����Ž��or �����˻� : ������������ ���ĵ� ����Ʈ���� Ư���� ���� ��ġ�� ã�� �˰���
		// ó�� �߰��� ���� ������ ������ �����Ͽ�, �� ���� ã���� �ϴ� ���� ũ�� ������ ���ϴ� ����� ä��
		// �˻� ������ ���ĵ� ����Ʈ������ ��� ����.

		int[] arr = { 1, 7, 9, 12, 13, 15, 25, 35, 47, 61, 72, 78, 90 };

		// ���� ���� �ε����� ū �ε����� ����Ҽ� �ִ� ���� ����.
		int low = 0;
		int high = arr.length - 1;

		int search = 78;

		// �ݺ��� ����. Ƚ���� �𸣴ϱ� while���� ����ϴ°��� ����

		while (true) { // �ϴ� ���ǽ� ���� ������ �۵��ϵ��� �����

			int mid = (low + high) / 2; // �߰����� �ο�� ���̰� ��ġ������ ��հ�.

			if (arr[mid] == search) { // ���� ���� ���ڰ� ������
				System.out.println("��ġ�� " + (mid + 1) + "��°��");
				break;
			
			} else if (arr[mid] > search) {
				high = mid - 1;
			
			} else if (arr[mid] < search) {
				low = mid + 1;
			}

		}
	}

}
