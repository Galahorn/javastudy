import java.util.Scanner;

public class ex_if�� {

	public static void main(String[] args) {

		// ������� ���̸� �Է¹����� 20�� �̻��̸� �����Դϴ�. ����ϱ�
		Scanner sc = new Scanner(System.in); // Ű���� �Է��� ���� �ʿ��� �ҷ�����

		System.out.print("���� �Է� : "); // ����ڿ��� �Էµ� ���뿡 ���� �ȳ� ���

		int age = sc.nextInt(); // ����ڰ� �Է��� Ű����κ����� �Էµ� �������� ���� ����

		// �Էµ� ���� � ���ǿ� �ش��ϴ��� �Ǵ� ����!
		if (age >= 20) {
			// ���ȣ ������ ������ if���� ���ǿ� �ش��ϴ� �༮��.
			System.out.println("�����Դϴ�.");
			// } if(age < 20) { //if���ǹ� �ڿ� else�� ���� ����!
			System.out.println("�̼������Դϴ�.");
		}
		System.out.println("���α׷� ����");
	}

}