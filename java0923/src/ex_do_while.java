import java.util.Scanner;

public class ex_do_while {

	public static void main(String[] args) {
//		do-while���� while ���� ���. ������ do {
//		�ݵ�� �ѹ��� ����Ǿ�� �ϴ� ����.
//		} while();
//      ���̾�Ʈ ����!

		Scanner sc = new Scanner(System.in);

		int week = 0;

		System.out.print("���� ������ : ");
		int now = sc.nextInt();

		System.out.print("��ǥ ������ : ");
		int goal = sc.nextInt();

		do {
			week++;
			System.out.print(week + "���� ���� ������ : ");
			int d = sc.nextInt();

			now = now - d;
		} while (now > goal);

		System.out.println(now + "kg�Դϴ�. ���ϵ帳�ϴ�.");

	}

}
