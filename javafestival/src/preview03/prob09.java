package preview03;

public class prob09 {

	public static void main(String[] args) {
		// 2개의 정수를 받아 제곱값 구하기.

		int base = 2;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("결과 확인 : " + result);
	}

	private static int powerN(int base, int n) {

		int result = 1;

		for (int i = 0; i < n; i++) {
			result *= base;
		}
		return result;
	}

}
