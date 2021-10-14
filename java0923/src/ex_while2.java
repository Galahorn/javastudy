import java.util.Scanner;

public class ex_while2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 반복문이 실행되는 조건은 검사조건이 true값일때임. 지금방법이 정석과 같다.

		while (true) {
			System.out.print("정수 입력 >>");
			int a = sc.nextInt();

			if (a > 10) {
				System.out.println("종료되었습니다.");
				break;
			}
		}

	}

}
