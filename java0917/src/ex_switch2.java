import java.util.Scanner;

public class ex_switch2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");

		int grade = sc.nextInt();

		switch (grade / 10) {

		case 10: // ���� �����߾��׿�~ ���̰������
		case 9:
			System.out.println("A�����Դϴ�.");
			break;

		case 8:
			System.out.println("B�����Դϴ�.");
			break;

		case 7:
			System.out.println("C�����Դϴ�.");
			break;

		default:
			System.out.println("D�����Դϴ�.");
			// break;

		}

	}
}