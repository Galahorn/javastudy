
public class ex_multy_for1 {

	public static void main(String[] args) {
		// ���� for�� ������ 2�ܺ��� 9�ܱ���.

//		for(int i = 2; i <= 9; i++) {
//			System.out.print(i + "�� : ");
//			
//			for(int j = 1; j <= 9; j++ ) {
//				System.out.print(i + " * " + j + " = " + (i*j) + "  ");
//			}
//		    System.out.println();			
//		}

		for (int i = 1; i <= 9; i++) {

			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + (i * j) + "  ");
			}
			System.out.println();
		}

	}

}
