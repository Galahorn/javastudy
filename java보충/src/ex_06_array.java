import java.util.Scanner;

public class ex_06_array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] names = { "����", "�¿�", "����", "����", "�¾�" };

		System.out.print("�˻��� �̸��� �����ΰ���? >> ");
		String name = sc.next();

		for (int i = 0; i < names.length; i++) {
			if (name.equals(names[i])) {
				System.out.println(name + "�� ��ġ�� " + (i + 1) + "��°��");
				break;
			}
		}
	}

}
