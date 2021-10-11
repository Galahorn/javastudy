import java.util.Scanner;

public class ex_do_while {

	public static void main(String[] args) {
//		do-while문은 while 문과 비슷. 하지만 do {
//		반드시 한번은 실행되어야 하는 로직.
//		} while();
//      다이어트 로직!

		Scanner sc = new Scanner(System.in);

		int week = 0;

		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();

		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();

		do {
			week++;
			System.out.print(week + "주차 감량 몸무게 : ");
			int d = sc.nextInt();

			now = now - d;
		} while (now > goal);

		System.out.println(now + "kg입니다. 축하드립니다.");

	}

}
