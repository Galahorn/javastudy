package preview02;

public class prob01 {

	public static void main(String[] args) {
		//num1�� num2�� ������������ �ƴϳ� ������������ true �ƴϸ� false

		int num1 = 10;
		int num2 = 2;
		boolean result = isDivde(num1, num2);
		System.out.print("��� Ȯ�� : " + result);

	}

	private static boolean isDivde(int num1, int num2) { //�޼ҵ�
		
		
		int result1 = num1 % num2;
		
		//���װ��� boolean result = (num1%num2 == 0) ? true : false;

		if (result1 == 0) {
			boolean result = true;
			return result;

		} else {
			boolean result = false;
			return result;
		}
	}

}
