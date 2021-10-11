
public class ex_method07 {

	public static void main(String[] args) {

		int num1 = -5;
		int num2 = -1;
		int result = close(num1, num2);
		System.out.println("10에 가까운수 : " + result);

	}

	private static int close(int num1, int num2) { //근사값 구하기.

		int result = 0;
		int a = 0;
		int b = 0;

		// n1과 n2의 크기를 잡고 계산방법 설정.
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

		// 위에서 받은 값으로 비교후 10에 가까운 값

		if (a > b) {
			result = num2;

		} else if (a < b) {
			result = num1;

		}
		return result;

	}
}
