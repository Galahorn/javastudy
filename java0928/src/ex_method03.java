
public class ex_method03 {

	public static void main(String[] args) {
		// 사칙연산 메소드 구현=> 매개변수는 있고 리턴값은 없는 것을 만들면 되는 거임 그럼. 메소드2의 3번 참조하도록
		// 아직 여기까지는 할만함. 아무튼 그렇다면 그런거임.

		add(3, 5);
		sub(3, 5);
		mul(3, 5);
		div(3, 5);

	}

	public static void add(int a, int b) {
		System.out.println(a + b);

	}

	public static void sub(int a, int b) {
		System.out.println(a - b);

	}

	public static void mul(int a, int b) {
		System.out.println(a * b);
	}

	public static void div(int a, int b) {
		System.out.println(a / b);
	}
}
