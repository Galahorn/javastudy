
public class ex_for_2 {

	public static void main(String[] args) {
		// 1. 1~100���� ���ڳ���
		for (int i = 1; i <= 100; i++)
			System.out.println(i);

		// 2. 100~1���� ���ڳ���
		for (int i = 100; i >= 1; i--)
			System.out.println(i);

		// 3. A~Z���� ���ĺ� ���� �ƽ�Ű �ڵ� A = 65, Z = 90
		for (char i = 65; i <= 90; i++)
			System.out.println(i);

		for (char i = 'A'; i <= 'Z'; i++) // �������� ���ڿ��갡��.
			System.out.println(i);

		for (int i = 65; i <= 90; i++)
			System.out.println((char) i);

	}

}
