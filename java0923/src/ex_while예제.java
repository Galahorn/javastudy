import java.util.Scanner;

public class ex_while���� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// A�� B�� ��� 0�� �ԷµǸ� ����ǰ� �װ��� �ƴϸ� A-B�� �ǰ��϶�.
		int a = 0;
		int b = 0;

		while (true) {

			System.out.print("A �Է� >> ");
			a = sc.nextInt();

			System.out.print("A �Է� >> ");
			b = sc.nextInt();

			if (a == 0 && b == 0) {
				System.out.println("����Ǿ����ϴ�.");
			} else {
				System.out.println("��� >> " + (a - b));
			}
		}

	}

}
