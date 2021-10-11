import java.util.Scanner;

public class ex_multy_for5 {

	public static void main(String[] args) {
		// 약수 구하기.

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 >> ");
		int input = sc.nextInt();

		System.out.print(input + "의 약수는 ");

		for (int i = 1; i <= input; i++) {
//			if(input%i == 0) {
//				System.out.println(i + " ");
//			}
			System.out.print((input % i == 0) ? i + " " : "");

		}
		System.out.print("입니다.");

	}

}
