package preview01;

import java.util.Random;

public class prob12 {

	public static void main(String[] args) {

		// �ߺ����� ���ڸ� �̴� �ζ�
		Random rd = new Random();

		// �ζǹ�ȣ�� ���� �迭
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rd.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;

				}
			}
		}
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.println("����� ���� : " + lotto[i]);
			
		}

	}

}
