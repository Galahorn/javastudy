
public class ex_method06 {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 5;
		int result = largerNumbers(num1, num2);
		System.out.println("큰 수 확인 : " + result);

	}

	public static int largerNumbers(int num1, int num2) { //숫자 비교후 큰값 출력 메소드.

		int result = 0; // 데이터 저장용

		if (num1 > num2) {
			result = num1; // n1이 n2 보다 큰경우

		} else if (num1 < num2) { // n2가 n1 보다 큰경우
			result = num2;

		}
		return result; // 리턴값.
	}

}
