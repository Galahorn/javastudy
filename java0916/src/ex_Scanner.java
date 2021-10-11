import java.util.Scanner;

public class ex_Scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = sc.next();

		System.out.println("나의 이름은 " + name);

		System.out.print("나이 : ");
		int age = sc.nextInt();

		System.out.println("나의 나이는 " + age);

	}

}
