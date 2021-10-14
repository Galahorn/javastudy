
public class MyMath {

	public static int cal(int num1, int num2, char op) { 

		int result = 0;

		if (op == '+') {
			result = num1 + num2;
		} else if (op == '-') {
			result = num1 - num2;
		} else if (op == '*') {
			result = num1 * num2;
		} else if (op == '/') {
			result = num1 / num2;
		}
		return result;

	}

	public static int largerNumbers(int num1, int num2) {

		int result = 0;
		if (num1 > num2) {
			result = num1;
		} else if (num1 < num2) {
			result = num2;
		}
		return result;
	}

	public static int close10(int num1, int num2) {

		int result = 0;
		int a = 0;
		int b = 0;

		if (num1 > 10) {
			a = num1 - 10;
		} else {
			a = 10 - num1;
		}

		if (num2 > 10) {
			b = num2 - 10;
		} else {
			b = 10 - num2;
		}

		if (a > b) {
			result = num2;
		} else if (a < b) {
			result = num1;
		}
		return result;
	}

	public static int powerN(int base, int n) {

//	int result = (int)Math.pow(base, n);
//	
//	return result;

		int result = 1;
		for (int i = 0; i < n; i++) {
			result *= base;
		}
		return result;
	}

	public static int getAbsoluteValue(int num1, int num2) {

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
