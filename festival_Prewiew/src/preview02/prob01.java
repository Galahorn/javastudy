package preview02;

public class prob01 {

	public static void main(String[] args) {
		//num1이 num2로 나눠떨어지냐 아니냐 나눠떨어지면 true 아니면 false

		int num1 = 10;
		int num2 = 2;
		boolean result = isDivde(num1, num2);
		System.out.print("결과 확인 : " + result);

	}

	private static boolean isDivde(int num1, int num2) { //메소드
		
		
		int result1 = num1 % num2;
		
		//삼항가능 boolean result = (num1%num2 == 0) ? true : false;

		if (result1 == 0) {
			boolean result = true;
			return result;

		} else {
			boolean result = false;
			return result;
		}
	}

}
