import java.util.Scanner;

public class ex_������6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��ϼ���. : ");
		int a = sc.nextInt();

		// System.out.print(a + (a%2 == 1 ? "��(��) Ȧ���Դϴ�." : "��(��) ¦���Դϴ�."));

		String result = a % 2 == 0 ? "¦��" : "Ȧ��";
		System.out.println(a + "��(��)" + result + "�Դϴ�.");

	}

}
