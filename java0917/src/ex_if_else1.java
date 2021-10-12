import java.util.Scanner;

public class ex_if_else1 {

	public static void main(String[] args) {

		// if else는 삼항연산자와 비슷

		// 사용자의 나이를 입력받은후 20살 이상이면 성인입니다. 20살미만일때에는 미성년자입니다. 출력하기
		Scanner sc = new Scanner(System.in); // 키보드 입력을 위한 필요기능 불러오기

		System.out.print("나이 입력 : "); // 사용자에게 입력될 내용에 대한 안내 출력

		int age = sc.nextInt(); // 사용자가 입력한 키보드로부터의 입력된 정수값을 변수 저장

		// 입력된 값이 어떤 조건에 해당하는지 판단 시작!
		if (age >= 20) {
			// 대괄호 이후의 문장은 if문의 조건에 해당하는 녀석들.
			System.out.println("성인입니다.");
		} else { // if조건문 뒤에 else가 들어옴! else뒤에는 조건문이 안와요오오옹!
			System.out.println("미성년자입니다.");
		}
		System.out.println("프로그램 종료");
	}

	// 삼항연산자
	// String result = age >= 20? "성인입니다" : "미성년자입니다";
	// System.out.println(result);

}
