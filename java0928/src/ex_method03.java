
public class ex_method03 {

	public static void main(String[] args) {
		// ��Ģ���� �޼ҵ� ����=> �Ű������� �ְ� ���ϰ��� ���� ���� ����� �Ǵ� ���� �׷�. �޼ҵ�2�� 3�� �����ϵ���
		// ���� ��������� �Ҹ���. �ƹ�ư �׷��ٸ� �׷�����.

		add(3, 5);
		sub(3, 5);
		mul(3, 5);
		div(3, 5);

	}

	public static void add(int a, int b) {
		System.out.println(a + b);

	}

	public static void sub(int a, int b) {
		System.out.println(a - b);

	}

	public static void mul(int a, int b) {
		System.out.println(a * b);
	}

	public static void div(int a, int b) {
		System.out.println(a / b);
	}
}
