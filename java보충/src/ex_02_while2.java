import java.util.Scanner;

public class ex_02_while2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 두숫자를 입력하겠노라. 근데 둘다 0이 입력되면 작동을 멈추거라.
		System.out.print("A값 : ");
		int a = sc.nextInt();
		System.out.print("B값 : ");
		int b = sc.nextInt();
		
		System.out.println("결과 >> " + (a - b));
	
		while (true) {

			System.out.print("A값 : ");
			a = sc.nextInt();
			System.out.print("B값 : ");
			b = sc.nextInt();

			if (a == 0 && b == 0) {
				System.out.println("종료되었습니다.");
				break;
			}
				System.out.println("결과 >> " + (a - b));
			}
		}

	}

