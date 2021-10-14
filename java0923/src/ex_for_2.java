
public class ex_for_2 {

	public static void main(String[] args) {
		// 1. 1~100까지 숫자나열
		for (int i = 1; i <= 100; i++)
			System.out.println(i);

		// 2. 100~1까지 숫자나열
		for (int i = 100; i >= 1; i--)
			System.out.println(i);

		// 3. A~Z까지 알파벳 나열 아스키 코드 A = 65, Z = 90
		for (char i = 65; i <= 90; i++)
			System.out.println(i);

		for (char i = 'A'; i <= 'Z'; i++) // 문자형은 숫자연산가능.
			System.out.println(i);

		for (int i = 65; i <= 90; i++)
			System.out.println((char) i);

	}

}
