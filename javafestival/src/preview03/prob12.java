package preview03;

import java.util.Scanner;

public class prob12 {

	public static void main(String[] args) {
		// �Էµ� ������ ���ĺ� �󵵼��� ���� �˰����� ����. ��ҹ��� ���� x

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� >> ");
		String word = sc.nextLine();// �����Է��̱⿡ �ڿ� Line

		String trans = word.toLowerCase();// �ҹ��� ��ȯ.
		String[] w_arr = trans.split("");// �Էµ� ���ڸ� �ϳ��ϳ� �迭�� ����

		// ���� ���ĺ� ����� �迭
		String[] spelling = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };

		for (int i = 0; i < spelling.length; i++) {//�񱳿� �迭 ��ȯ��
			int count = 0;
			for (int j = 0; j < w_arr.length; j++) {//�Էµ� ����� �񱳿� �迭 ���� ī��Ʈ
				if (w_arr[j].equals(spelling[i])) {
					count++;
				}
			}
			System.out.println(spelling[i] + " : " + count);
		}

	}

}
