import java.util.Arrays;
import java.util.Scanner;

public class ex_array6 {

	public static void main(String[] args) {
		// �������� �˰���

		Scanner sc = new Scanner(System.in);

		int[] ans = { 1, 4, 3, 2, 1 }; // ���䵥���� ���� �迭
		int[] inputs = new int[5]; // �Է°� ���� �迭 ����
		int score = 0;// ������ �����ϴ� ������ ����

		System.out.println("==ä���ϱ�==");
		System.out.println("������ �Է��Ͻÿ�");

		// 5���� ������ ���� ���� �����ϴ� ��ɹ�
		for (int i = 0; i < inputs.length; i++) {
			System.out.print((i + 1) + "�� �� >> ");
			inputs[i] = sc.nextInt();
		}
		// �迭�� ��ü ������ ���
		// System.out.println(Arrays.toString(inputs)); �Էµ� ���� ��Ȯ�ϰ� �ԷµǴ��� �ϴ� Ȯ��

		System.out.println("==����Ȯ��==");

		for (int i = 0; i < inputs.length; i++) {
			if (ans[i] == inputs[i]) {
				score = score + 20;
				System.out.print("O ");

			} else {
				System.out.print("x ");
			}

		}
		System.out.println("\n���� : \"" + score + "\"");
	}
}
