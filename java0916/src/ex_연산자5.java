import java.util.Scanner;

public class ex_������5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("�� �Է� �ݾ� : ");
		int num1 = sc.nextInt();

		System.out.println("�ܵ� : " + num1);
		System.out.println("10000�� : " + (num1 / 10000) + "��");
		System.out.println("5000�� : " + ((num1 % 10000) / 5000) + "��");
		System.out.println("1000�� : " + ((num1 % 10000) % 5000) / 1000 + "��");
		System.out.println("500�� : " + (((num1 % 10000) % 5000) % 1000) / 500 + "��");
		System.out.println("100�� : " + ((((num1 % 10000) % 5000) % 1000) % 500) / 100 + "��");

	}

}
