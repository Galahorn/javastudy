import java.util.Scanner;

public class ex_for_5 {

	public static void main(String[] args) {
		// 100������ �� ������ ���������� ū�� ���� ���������� ����ϴ� ���α׷��� �����Ͻÿ�
		// ex) 1�� 3�� �Է��ϸ� -> 1 2 3 ���
		// ex) 7�� 5�� �Է��ϸ� -> 5 6 7 ���
		// 101�� 5�� �Է� -> 100������ ���ڸ� �Է����ּ���..! ���

		Scanner sc = new Scanner(System.in);

		System.out.println("�� ������ �Է��ϼ���.");
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a <= 100 && b <= 100) {

			if (a > b) {
				for (int i = b; i <= a; i++) {
					System.out.print(i + " ");
				}
			} else if (a < b) {
				for (int i = a; i <= b; i++) {
					System.out.print(i + " ");
				}
			} else {
				System.out.println("100������ ���ڸ� �Է����ְԳ�");
			}
		}
	}
}

///////////////////////////////////////////////////////////////////////////
//����� �غ���