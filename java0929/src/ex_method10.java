import java.util.Scanner;

public class ex_method10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 점수 입력 : ");
		int num1 = sc.nextInt();

		System.out.print("두번째 점수 입력 : ");
		int num2 = sc.nextInt();

		int result = getAbsoluteValue(num1, num2);
		System.out.println("결과 확인 : " + result);

	}

	private static int getAbsoluteValue(int num1, int num2) { // 절대값 구하기

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
