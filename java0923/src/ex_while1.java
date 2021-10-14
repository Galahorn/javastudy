import java.util.Scanner;

public class ex_while1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = 0;
		while (a < 10) {
			System.out.print("정수 입력 >> ");
			a = sc.nextInt();

		}
		System.out.println("종료되었습니다.");

	}

}
