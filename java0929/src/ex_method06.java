
public class ex_method06 {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 5;
		int result = largerNumbers(num1, num2);
		System.out.println("ū �� Ȯ�� : " + result);

	}

	public static int largerNumbers(int num1, int num2) { //���� ���� ū�� ��� �޼ҵ�.

		int result = 0; // ������ �����

		if (num1 > num2) {
			result = num1; // n1�� n2 ���� ū���

		} else if (num1 < num2) { // n2�� n1 ���� ū���
			result = num2;

		}
		return result; // ���ϰ�.
	}

}
