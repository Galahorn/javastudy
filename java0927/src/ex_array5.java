import java.util.Scanner;

public class ex_array5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1 : 10���� ������ ���� ���ڿ� �迭 name�� �ʱ�ȭ�Ͻÿ�.
		String[] names = { "����", "�蹫��", "������", "�̵���", "������", "�̹���", "��Į�� ���ѽ�", "������", "�۰�ȣ", "�̹α�" };

		System.out.print("�˻��� ����� �̸��� �ۼ����ּ��� >> ");

		String name = sc.nextLine();
		// 2 : �̸��� �Է������� name�迭 �� ���° ��ġ�� �ִ��� ����Ͻÿ�.
		for (int i = 0; i < names.length; i++) {

			if (name.equals(names[i])) {
				System.out.println(name + "�� ��ġ�� " + (i + 1) + "��° ��");
				break;
			}
		}

	}

}
