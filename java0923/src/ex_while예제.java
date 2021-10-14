import java.util.Scanner;

public class ex_while예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// A와 B에 모두 0이 입력되면 종료되고 그것이 아니면 A-B가 되게하라.
		int a = 0;
		int b = 0;

		while (true) {

			System.out.print("A 입력 >> ");
			a = sc.nextInt();

			System.out.print("A 입력 >> ");
			b = sc.nextInt();

			if (a == 0 && b == 0) {
				System.out.println("종료되었습니다.");
			} else {
				System.out.println("결과 >> " + (a - b));
			}
		}

	}

}
