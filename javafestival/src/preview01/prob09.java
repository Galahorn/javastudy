package preview01;

import java.util.Scanner;

public class prob09 {

	public static void main(String[] args) {
		// �ִ����� �ּҰ���� ���ϱ�.

		Scanner sc = new Scanner(System.in); //�� ��ĳ�ʸ� �ҷ�������? �츮�� ���ڸ� �Է��ϱ� ���� �����ϱ�. �Է��Ҷ��.

		System.out.print("���� 1�Է� >> ");//���ڸ� �ֱ� ����. �ٵ� �ý����� ���ư��� �츮�� ���ڸ� �־���ϴ��� ���ݾ�. �׷��ϱ� ��ǻ�;� �˷��� ���� �������.
		int a = sc.nextInt();// �˷������ϱ� ���ڸ� ������

		System.out.print("���� 2�Է� >> ");
		int b = sc.nextInt();

		// �ּҰ���� -> ���� ���� ����� ���ϱ� ��. a�� b�� ���� ������ ������ ���� ���� ������ ���� ���� ��.

		int result1 = 0; //���� ������ �� ����? �ּҰ�������� �����ϱ� ���ؼ���!
		for (int i = 1; i <= (a * b); i++) {//�������� 0�� ���� ���� �� 0�� �Ǵ� i�� 11
			if (i % a == 0 && i % b == 0) { //a = 20 b = 30 i = 600      600 % 20 == 0       30 600/20
				result1 = i;
				break;
			}
///////////////////////////////////////////////////////////////////////////
//			while���� ����Ҷ�.
//			int result1 = a;
//			while (true) {
//				if (result % a == 0 && result % b == 0) {
//					break;
//				}
//				result1++; // �ּҰ������ ��ã������ �ٽ� �ѹ� �õ��ض�.
		}

		// �ִ����� = ���� ū ����� ���
		int result2 = 0;//�ִ� ����� ���� ����

		for (int i = 1; i >= 1; i--) {// 
			if (a % i == 0 && b % i == 0) {
				result2 = i;
				break;
			}

		}

		System.out.println("�ּҰ���� : " + result1);
		System.out.println("�ִ����� : " + result2);
	}
}
