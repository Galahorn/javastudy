
public class ex_method07 {

	public static void main(String[] args) {

		int num1 = -5;
		int num2 = -1;
		int result = close(num1, num2);
		System.out.println("10�� ������ : " + result);

	}

	private static int close(int num1, int num2) { //�ٻ簪 ���ϱ�.

		int result = 0;
		int a = 0;
		int b = 0;

		// n1�� n2�� ũ�⸦ ��� ����� ����.
		if (num1 > 10) {
			a = num1 - 10;
		} else {
			a = 10 - num1;
		}

		if (num2 > 10) {
			b = num2 - 10;
		} else {
			b = 10 - num2;
		}

		// ������ ���� ������ ���� 10�� ����� ��

		if (a > b) {
			result = num2;

		} else if (a < b) {
			result = num1;

		}
		return result;

	}
}
