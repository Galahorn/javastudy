
public class ex_method02 {

	public static void main(String[] args) {
		// say �޼ҵ� ȣ��
		say(); // => �޼ҵ带 ȣ���Ͽ����.

		// getMsg�޼ҵ� ȣ��
		// getMsg(); => ���ϰ��� �־� ����Ҽ� ����. �׷��� ����� ���Ѵ�.
		System.out.println(getMsg()); // ��� ���� ����Ҽ� �ֵ��� ��¹� �ڿ� �޼ҵ� ���� �ھƹ���. ������ ��Ƽ� ����ص� ����

		// intro ȣ��
		intro("���Գ�");

		// threeNumberSum �޼ҵ�
		int sum = threeNumberSum(1, 2, 3);
		double avg = sum / 3.0;
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);

		/*
		 * 1. �Է°� ����� ��� ���� �޼ҵ� 2. �Է��� ���� ��¸� �ִ� �޼ҵ� 3. �Է��� �ְ� ����� �ִ� �޼ҵ� 4. �Է°� ����� ���
		 * �ִ� �޼ҵ�
		 */

	}

	// �ʴ� 1��
	public static void say() {
		System.out.println("�޼ҵ�� �ݺ������� �ۼ��� �ڵ带 �ּ�ȭ �� �� �ִ�.");
	}

	// �ʴ� 2��
	public static String getMsg() { // get�̶�� �ܾ ������ ���� �������ִ� �ֵ鸸 ��Ƴ��°� ����
		return "�޼ҵ�� ������ ��ɹ��� ����ü��!"; // ��ȯ�� �����Ͱ� ������ void�������� �´� �ڷ��� ��ȯŸ�� ������ �ض�.
		// ���⿣ ��¹��� ����. �׷��� �ȳ��´�.
	}

	// �ʴ� 3��
	public static void intro(String name) {
		System.out.println("���� " + name + "�Դϴ�. �Ӹ��� ������ ������.");
	}

	// �ʴ� 4��
	public static int threeNumberSum(int num1, int num2, int num3) {

		int result = num1 + num2 + num3;
		return result;
		// return��
		// �޼ҵ� ���࿡ ���� ������� ��ȯ�� ��
		// Ȥ�� �߰��� �ڵ带 �ߴ��Ҷ��� ��밡��
		// return�� �Ʒ��� �ڵ带 �ۼ��� �� ����. �������� ���Ƕ˽�

	}

}
