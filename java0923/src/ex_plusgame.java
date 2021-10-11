import java.util.Random;
import java.util.Scanner;

public class ex_plusgame {

	public static void main(String[] args) {
		// 랜덤 수 생성
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = rd.nextInt(5) + 1;
			int b = rd.nextInt(5) + 1;

			System.out.print(a + " + " + b + " = ");
			int c = sc.nextInt();

			if (c == (a + b)) {
				System.out.println("정답입니다.");
			} else {
				System.out.println("틀렸습니다.");
			}
			System.out.print("계속 하시겠습니까? >>");
			String d = sc.next();

			if (d.equals("n") && d.equals("N")) {
				System.out.println("종료하겠습니다.");
				break;
			}
		}

	}

}
