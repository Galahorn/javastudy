package preview03;

public class prob09 {

	public static void main(String[] args) {
		// 2���� ������ �޾� ������ ���ϱ�.

		int base = 2;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("��� Ȯ�� : " + result);
	}

	private static int powerN(int base, int n) {

		int result = 1;

		for (int i = 0; i < n; i++) {
			result *= base;
		}
		return result;
	}

}
