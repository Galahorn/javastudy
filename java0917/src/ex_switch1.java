import java.util.Scanner;

public class ex_switch1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("점수 입력 : ");
		int grade = sc.nextInt();
		String result = "";
		// 10,20,30점만 있음
		switch (grade) {
		case 10:
			System.out.println("C학점입니다.");
			break;
		case 20:
			System.out.println("B학점입니다.");
			break;
		case 30:
			System.out.println("A학점입니다.");
			break;

		default:
			System.out.println("F학점입니다.");
			// break;

		}

	}

}
