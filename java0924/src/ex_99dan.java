import java.util.Scanner;

public class ex_99dan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("´Ü ÀÔ·Â >> ");
		int dan = sc.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}

	}

}
