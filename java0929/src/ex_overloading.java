
public class ex_overloading {

	public static void main(String[] args) {
		// method overloadin = �޼ҵ� �����ε�
		// :�żҵ��� �̸��������ϳ�,�Ű������� Ÿ���� �ٸ��ų� ������ �ٸ��� ������ ���

		System.out.println(true);
		System.out.println(12);
		System.out.println("hello");

///////////////////////////////////////////////////////////////////////
	}// �����ε� ������. �޼ҵ��� �̸��� ���� �ٸ� ���� Ȯ���Ұ�.

	public static int addTwoNumber(int num1, int num2) {
		return num1 + num2;

	}

	public static double addTwofloatNumber(int num1, int num2) {
		return num1 + num2;

	}

	public static int addThreeNumber(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	///////////////////////////////////////////////////////////////////
	// method_overloading ������
	// �޼ҵ� �̸��� ���ϵǾ����� �Ű����� ��ȯŸ�� �Ǵ� ������ �ٸ� ���� Ȯ���Ҽ� ����
	
	public static int addNumber(int num1, int num2) {
		return num1 + num2;

	}

	public static double addNumber(int num1, float num2) {
		return num1 + num2;

	}

	public static int addNumber(int num1, int num2, int num3) {
		return num1 + num2 + num3;

	}

}
