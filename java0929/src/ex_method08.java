
public class ex_method08 {

	public static void main(String[] args) {
		// ������ : ��� ���� ������ ��
		// 2�� 3���� 8 = 2*2*2 = 8 �̷�����

		int base = 3;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("��� Ȯ�� : " + result);

	}

	private static int powerN(int base, int n) { //������ ���ϱ�.

//	int result = (int)Math.pow(base, n);
//				
//	return result;

		int result = 1;

		for (int i = 0; i < n; i++) {
			result *= base;

		}
		return result;
	}

}
