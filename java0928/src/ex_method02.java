
public class ex_method02 {

	public static void main(String[] args) {
		// say 메소드 호출
		say(); // => 메소드를 호출하였노라.

		// getMsg메소드 호출
		// getMsg(); => 리턴값만 있어 출력할순 없어. 그래서 출력을 못한대.
		System.out.println(getMsg()); // 결과 값을 출력할수 있도록 출력문 뒤에 메소드 값을 박아버림. 변수에 담아서 출력해도 가능

		// intro 호출
		intro("강규남");

		// threeNumberSum 메소드
		int sum = threeNumberSum(1, 2, 3);
		double avg = sum / 3.0;
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);

		/*
		 * 1. 입력과 출력이 모두 없는 메소드 2. 입력은 없고 출력만 있는 메소드 3. 입력은 있고 출력은 있는 메소드 4. 입력과 출력이 모두
		 * 있는 메소드
		 */

	}

	// 너님 1번
	public static void say() {
		System.out.println("메소드는 반복적으로 작성된 코드를 최소화 할 수 있다.");
	}

	// 너님 2번
	public static String getMsg() { // get이라는 단어가 붙은건 값을 리턴해주는 애들만 모아놓는게 많다
		return "메소드는 실행할 명령문의 집합체임!"; // 반환할 데이터가 있으면 void쓰지말고 맞는 자료형 반환타입 지정을 해라.
		// 여기엔 출력문이 없다. 그래서 안나온다.
	}

	// 너님 3번
	public static void intro(String name) {
		System.out.println("저는 " + name + "입니다. 머리가 깨지고 있지요.");
	}

	// 너님 4번
	public static int threeNumberSum(int num1, int num2, int num3) {

		int result = num1 + num2 + num3;
		return result;
		// return문
		// 메소드 실행에 대한 결과값을 반환할 때
		// 혹은 중간의 코드를 중단할때도 사용가능
		// return문 아래에 코드를 작성할 수 없음. 에러나서 개피똥쌈

	}

}
