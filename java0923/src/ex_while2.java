import java.util.Scanner;

public class ex_while2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// �ݺ����� ����Ǵ� ������ �˻������� true���϶���. ���ݹ���� ������ ����.

		while (true) {
			System.out.print("���� �Է� >>");
			int a = sc.nextInt();

			if (a > 10) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
		}

	}

}
