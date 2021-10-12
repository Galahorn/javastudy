
public class ex_method08 {

	public static void main(String[] args) {
		// 제곱근 : 어떠한 수를 제곱한 수
		// 2의 3승은 8 = 2*2*2 = 8 이런개념

		int base = 3;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("결과 확인 : " + result);

	}

	private static int powerN(int base, int n) { //제곱근 구하기.

//	int result = (int)Math.pow(base, n);
//				
//	return result;

		int result = 1;

		for (int i = 0; i < n; i++) {
			result *= base;

		}
		return result;
	}

}
