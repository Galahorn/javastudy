import java.util.Scanner;

public class ex_다중if문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");

		int grade = sc.nextInt();

		String result = ""; // 전역변수 지정

		if (grade >= 90) {
			// System.out.println("A학점 입니다.");
			result = "A";
		} else if (grade >= 80) {
			// System.out.println("B학점 입니다.");
			result = "B";
		} else if (grade >= 70) {
			// System.out.println("C학점 입니다.");
			result = "C";
		} else {
			// System.out.println("D학점 입니다.");
			result = "D";
		}

		System.out.println(result + "학점입니다.");

	}

}
