import java.util.Scanner;

public class ex_���׿����ڿ��� {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է� : ");
		int a = sc.nextInt();
		
		System.out.print("�� ��° ���� �Է� : ");
		int b = sc.nextInt();
		
		int result = (a < b)?  b-a : a-b;
		
		System.out.print("�� ���� ���� : " + result);

	}

}
