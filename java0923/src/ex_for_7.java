
public class ex_for_7 {

	public static void main(String[] args) {
		// 1~100까지의 숫자들 다음과 같이 출력하시오
		// 결과) 1 -2 3 -4 5 -6 7 -8 9
		// -가 나오는 숫자는 짝수 = 짝수만 음수를 곱해라

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i * (-1) + " ");
			} else if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		// 단순 조건이라면 삼항연산자가 더 낫지만 조건문이 여러개일 경우에는 가독성이 떨어진다.
//		for(int i = 1; i <= 100; i++) {
//			System.out.print((i%2) == 1 ? i + " " : i*(-1) + " " );
	}

}
