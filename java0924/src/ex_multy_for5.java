import java.util.Scanner;

public class ex_multy_for5 {

	public static void main(String[] args) {
		// ��� ���ϱ�.

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� >> ");
		int input = sc.nextInt();

		System.out.print(input + "�� ����� ");

		for (int i = 1; i <= input; i++) {
//			if(input%i == 0) {
//				System.out.println(i + " ");
//			}
			System.out.print((input % i == 0) ? i + " " : "");

		}
		System.out.print("�Դϴ�.");

	}

}
