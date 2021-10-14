import java.util.Scanner;

public class ex_01_while {

	public static void main(String[] args) {

		// 내가 숫자를 입력하겠노라 10보다 작으면 계속해서 입력받아라.
		Scanner sc = new Scanner(System.in);
		int a = 0;

		while (a < 10) { // << 얘가 true값일때만!
			System.out.print("정수 입력 : ");
			a = sc.nextInt();
		}
		System.out.println("종료되었습니다.");

	}

}
