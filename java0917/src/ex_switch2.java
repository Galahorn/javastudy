import java.util.Scanner;

public class ex_switch2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");

		int grade = sc.nextInt();

		switch (grade / 10) {

		case 10: // 내가 누락했었네에~ 아이고오오오
		case 9:
			System.out.println("A학점입니다.");
			break;

		case 8:
			System.out.println("B학점입니다.");
			break;

		case 7:
			System.out.println("C학점입니다.");
			break;

		default:
			System.out.println("D학점입니다.");
			// break;

		}

	}
}