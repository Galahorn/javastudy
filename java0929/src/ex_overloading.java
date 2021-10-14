
public class ex_overloading {

	public static void main(String[] args) {
		// method overloadin = 메소드 오버로딩
		// :매소드의 이름은도일하나,매개변수의 타입이 다르거나 개수를 다르게 정의하 방법

		System.out.println(true);
		System.out.println(12);
		System.out.println("hello");

///////////////////////////////////////////////////////////////////////
	}// 오버로딩 적용전. 메소드의 이름이 전부 다른 것을 확인할것.

	public static int addTwoNumber(int num1, int num2) {
		return num1 + num2;

	}

	public static double addTwofloatNumber(int num1, int num2) {
		return num1 + num2;

	}

	public static int addThreeNumber(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	///////////////////////////////////////////////////////////////////
	// method_overloading 적용후
	// 메소드 이름은 통일되었지만 매개변수 반환타입 또는 갯수가 다른 것을 확인할수 있음
	
	public static int addNumber(int num1, int num2) {
		return num1 + num2;

	}

	public static double addNumber(int num1, float num2) {
		return num1 + num2;

	}

	public static int addNumber(int num1, int num2, int num3) {
		return num1 + num2 + num3;

	}

}
