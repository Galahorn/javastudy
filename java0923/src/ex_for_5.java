import java.util.Scanner;

public class ex_for_5 {

	public static void main(String[] args) {
		// 100이하의 두 정수를 작은수부터 큰수 까지 순차적으로 출력하는 프로그램을 구연하시오
		// ex) 1과 3을 입력하면 -> 1 2 3 출력
		// ex) 7과 5를 입력하면 -> 5 6 7 출력
		// 101과 5를 입력 -> 100이하의 숫자만 입력해주세요..! 출력

		Scanner sc = new Scanner(System.in);

		System.out.println("두 정수를 입력하세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a <= 100 && b <= 100) {

			if (a > b) {
				for (int i = b; i <= a; i++) {
					System.out.print(i + " ");
				}
			} else if (a < b) {
				for (int i = a; i <= b; i++) {
					System.out.print(i + " ");
				}
			} else {
				System.out.println("100이하의 숫자만 입력해주게나");
			}
		}
	}
}

///////////////////////////////////////////////////////////////////////////
//디버깅 해볼것