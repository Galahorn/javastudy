import java.util.Scanner;

public class ex_연산자6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요. : ");
		int a = sc.nextInt();

		// System.out.print(a + (a%2 == 1 ? "는(은) 홀수입니다." : "는(은) 짝수입니다."));

		String result = a % 2 == 0 ? "짝수" : "홀수";
		System.out.println(a + "는(은)" + result + "입니다.");

	}

}
