import java.util.Scanner;

public class ex_if_else1 {

	public static void main(String[] args) {

		// if else�� ���׿����ڿ� ���

		// ������� ���̸� �Է¹����� 20�� �̻��̸� �����Դϴ�. 20��̸��϶����� �̼������Դϴ�. ����ϱ�
		Scanner sc = new Scanner(System.in); // Ű���� �Է��� ���� �ʿ��� �ҷ�����

		System.out.print("���� �Է� : "); // ����ڿ��� �Էµ� ���뿡 ���� �ȳ� ���

		int age = sc.nextInt(); // ����ڰ� �Է��� Ű����κ����� �Էµ� �������� ���� ����

		// �Էµ� ���� � ���ǿ� �ش��ϴ��� �Ǵ� ����!
		if (age >= 20) {
			// ���ȣ ������ ������ if���� ���ǿ� �ش��ϴ� �༮��.
			System.out.println("�����Դϴ�.");
		} else { // if���ǹ� �ڿ� else�� ����! else�ڿ��� ���ǹ��� �ȿͿ������!
			System.out.println("�̼������Դϴ�.");
		}
		System.out.println("���α׷� ����");
	}

	// ���׿�����
	// String result = age >= 20? "�����Դϴ�" : "�̼������Դϴ�";
	// System.out.println(result);

}
