
public class ex_for_3 {

	public static void main(String[] args) {
		// 1. 21~57���� ���ڸ� ����Ͻÿ�
		for (int i = 21; i <= 57; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

//2. 96~53���� ���ڸ� ����Ͻÿ�
		for (int i = 96; i >= 53; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		// 3 21~57������ ������ Ȧ���� ����Ͻÿ�
		for (int i = 21; i <= 57; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}

	}

}
