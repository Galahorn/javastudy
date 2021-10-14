
public class ex_method05 {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 15;
		char op = '-';

		System.out.println(cal(num1, num2, op));

	}

	public static int cal(int num1, int num2, char op) {  //사칙연산 메소드.

		int result = 0;

		if (op == '+') {
			// return num1 + num2;
			result = num1 + num2;

		} else if (op == '-') {
			// return num1 - num2;
			result = num1 - num2;

		} else if (op == '*') {
			// return num1 * num2;
			result = num1 * num2;

		} else if (op == '/') {
			// return num1 / num2;
			result = num1 / num2;

		}
		return result;

	}

}
