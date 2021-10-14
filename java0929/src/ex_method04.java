
public class ex_method04 {

	public static void main(String[] args) {

		int n1 = 5;
		int n2 = 10;

		int sum = addNumber(n1, n2);
		System.out.println(sum);

	}

	// 4번구조
	public static int addNumber(int num1, int num2) {

		int result = num1 + num2;
		return result;

		// returnn num1+ num+2; 변수지정해서 대입해도 되는 거지만 간단하면 주석처럼 해도 가능

	}

}
