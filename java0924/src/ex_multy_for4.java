
public class ex_multy_for4 {

	public static void main(String[] args) {
		// 이등변 삼각형에 공백 추가!

		for (int i = 0; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
