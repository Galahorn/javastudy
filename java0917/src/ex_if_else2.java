import java.util.Scanner;

public class ex_if_else2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int a = sc.nextInt();

		// �������� : Ư������������ ��밡���� ����
		// �������� : ��ü ������ �κп��� ����� ������ ����(main�޼ҵ忡�� ���� ����

		// int result = 0;
		String result = "";

		if (a % 10 >= 5) { // �ݿø� ����
			// System.out.println("�ݿø� �� : " + ((a/10)+1)*10);
			// result = (a/10 + 1) * 10;
			result = (a / 10 + 1) + "0";
		} else { // �ݿø� X
			// System.out.println("�ݿø� �� : " + (a/10)*10);
			// result = (a/10) * 10;
			result = (a / 10) + "0";
		}

		System.out.println("�ݿø� �� : " + result);
		// ���������� ���������� �ٲܼ� ����
		// ���⿡���� result������ 0���� �̸� �������ְ� if���� else ���� Ÿ�Ը��� ����
	}

}
