package test;

public class test1 {

	public static void main(String[] args) {

		
		// ������ �ڵ� �׽�Ʈ
		
		int num1 = -5;
		int num2 = -1;
		int result = close(num1, num2);
		System.out.println("10�� ������ : " + result);

	}

	private static int close(int num1, int num2) {
		int a = 0;
		int b = 10;

		if (num1 > a && num1 > b) {
			return num1;
		} else if (num2 > a && num2 > b) {
			return num2;

		} else {
			return 0;
		}
	}

}
