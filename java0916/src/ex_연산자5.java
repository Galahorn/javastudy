import java.util.Scanner;

public class ex_연산자5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("총 입력 금액 : ");
		int num1 = sc.nextInt();

		System.out.println("잔돈 : " + num1);
		System.out.println("10000원 : " + (num1 / 10000) + "개");
		System.out.println("5000원 : " + ((num1 % 10000) / 5000) + "개");
		System.out.println("1000원 : " + ((num1 % 10000) % 5000) / 1000 + "개");
		System.out.println("500원 : " + (((num1 % 10000) % 5000) % 1000) / 500 + "개");
		System.out.println("100원 : " + ((((num1 % 10000) % 5000) % 1000) % 500) / 100 + "개");

	}

}
