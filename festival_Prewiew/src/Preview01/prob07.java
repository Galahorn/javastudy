package Preview01;

import java.util.Scanner;

public class prob07 {

	public static void main(String[] args) {

		//����� ������ ��ĳ�ʸ� ���Ѱ�
		Scanner sc = new Scanner(System.in);

		System.out.print("�� ���� : ");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) { // ���� �����ִ� for��
			for (int j = i; j <= row; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
