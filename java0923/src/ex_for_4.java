import java.util.Scanner;

public class ex_for_4 {

	public static void main(String[] args) {
		// 정수를 입력받아 1부터 입력받은 정수까지 순차적으로 출력하는 프로그램을 구현하라

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 >> ");
		int a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			System.out.println(i + " ");
		}

	}

}
