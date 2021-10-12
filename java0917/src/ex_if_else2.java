import java.util.Scanner;

public class ex_if_else2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int a = sc.nextInt();

		// 지역변수 : 특정영역에서만 사용가능한 변수
		// 전역변수 : 전체 영역의 부분에서 사용이 가능한 변수(main메소드에서 선언덴 변수

		// int result = 0;
		String result = "";

		if (a % 10 >= 5) { // 반올림 진행
			// System.out.println("반올림 수 : " + ((a/10)+1)*10);
			// result = (a/10 + 1) * 10;
			result = (a / 10 + 1) + "0";
		} else { // 반올림 X
			// System.out.println("반올림 수 : " + (a/10)*10);
			// result = (a/10) * 10;
			result = (a / 10) + "0";
		}

		System.out.println("반올림 수 : " + result);
		// 지역변수를 전역변수로 바꿀수 있음
		// 여기에서는 result변수를 0으로 미리 지정해주고 if문과 else 문의 타입명을 제거
	}

}
