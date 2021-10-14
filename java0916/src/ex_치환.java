
public class ex_치환 {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		int temp = 0;

		temp = a;
		a = b;
		b = temp;

		System.out.println("a의 값 : " + a);
		System.out.println("b의 값 : " + b);

		int i = 3;
		System.out.println(i++);
		// i 부터 출력후에 1을 더해라.
		System.out.println(i);

	}

}
