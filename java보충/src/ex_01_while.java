import java.util.Scanner;

public class ex_01_while {

	public static void main(String[] args) {

		// ���� ���ڸ� �Է��ϰڳ�� 10���� ������ ����ؼ� �Է¹޾ƶ�.
		Scanner sc = new Scanner(System.in);
		int a = 0;

		while (a < 10) { // << �갡 true���϶���!
			System.out.print("���� �Է� : ");
			a = sc.nextInt();
		}
		System.out.println("����Ǿ����ϴ�.");

	}

}
