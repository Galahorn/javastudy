import java.util.Random;
import java.util.Scanner;

public class ex_plusgame {

	public static void main(String[] args) {
		// ���� �� ����
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = rd.nextInt(5) + 1;
			int b = rd.nextInt(5) + 1;

			System.out.print(a + " + " + b + " = ");
			int c = sc.nextInt();

			if (c == (a + b)) {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
			System.out.print("��� �Ͻðڽ��ϱ�? >>");
			String d = sc.next();

			if (d.equals("n") && d.equals("N")) {
				System.out.println("�����ϰڽ��ϴ�.");
				break;
			}
		}

	}

}
