package preview03;

import java.util.Scanner;

public class prob08 {

	public static void main(String[] args) {
		// ���� ä��.
		Scanner sc = new Scanner(System.in);

		System.out.println("==== ä���ϱ� ====");
		System.out.print("���� ���� >> ");
		String result = sc.next(); // ���ڴϱ� next

		int score = 0; // ������ �������ֱ� ���� ����
		int sum = 0; // ��ü ������ �հ踦 �����ϱ� ���� ����

		for (int i = 0; i < result.length(); i++) {
			if(result.charAt(i) == 'o') {
				score++;
			}else {
				score = 0;
			}
			sum += score;
		}
		System.out.println(sum);

	}

}
