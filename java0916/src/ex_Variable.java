
public class ex_Variable {

	public static void main(String[] args) {
		// 변수 : 데이터를 저장할 수 있는 공간
		// 변수선언)
		// 데이터타입 변수명 = 데이터;

		// 5라는 정수형 데이터를 num이라는 공간에 저장(초기화)
		// int num = 5; // 정수형

		int num; // 변수선언
		num = 5; // 초기화
		num = 10;

		System.out.println(num);

		// 변수를 사용하는 이유
		String name = "강규남";
		int age = 32;
		String gender = "남자";

		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("성별: " + gender);

//////////////////////////////////////////////////////////////////////////////////

		// 상수: 데이터를 담을 수 있는 공간(불변)
		// 상수 선언)
		// final 데이터 타입 + 변수명(대문자) = 값;
		final int NUMBER = 1;

		// 변수명 지정 규직
		// 1. 키워드 사용 불가
		// 2. 대소문자 구분되며 길이에 제한이 없다.
		// 3. 숫자로 시작할수 없다.
		// 4. 특수문자는 '_'와 '$'만 허용한다.

	}

}
