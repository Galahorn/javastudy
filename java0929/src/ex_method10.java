import java.util.Scanner;

public class ex_method10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();

		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();

		int result = getAbsoluteValue(num1, num2);
		System.out.println("��� Ȯ�� : " + result);

	}

	private static int getAbsoluteValue(int num1, int num2) { // ���밪 ���ϱ�

		int result = 0;

		if (num1 > num2) {
			result = num1 - num2;
		} else {
			result = num2 - num1;
		}
		return result;

		// return Math.abs(num1-num2);
	}

}
