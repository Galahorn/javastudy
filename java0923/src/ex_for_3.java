
public class ex_for_3 {

	public static void main(String[] args) {
		// 1. 21~57까지 숫자를 출력하시요
		for (int i = 21; i <= 57; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

//2. 96~53까지 숫자를 출력하시오
		for (int i = 96; i >= 53; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		// 3 21~57까지의 숫자중 홀수만 출력하시오
		for (int i = 21; i <= 57; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}

	}

}
