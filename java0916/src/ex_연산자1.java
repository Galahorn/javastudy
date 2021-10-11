import java.util.Scanner;

public class ex_연산자1 {

	public static void main(String[] args) {

		// import 단축키 = ctrl + shift + o
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();

		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();

		System.out.println(num1 / num2);
		System.out.println(num1 % num2);

	}

}
