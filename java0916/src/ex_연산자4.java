import java.util.Scanner;

public class ex_������4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Java ���� �Է� : ");
		int javaScore = sc.nextInt();

		System.out.print("Web ���� �Է� : ");
		int webScore = sc.nextInt();

		System.out.print("Android ���� �Է� : ");
		int androidScore = sc.nextInt();

		System.out.println("���� �հ� : " + (javaScore + webScore + androidScore));
		System.out.println("���� ��� : " + (javaScore + webScore + androidScore) / 3);

	}

}
