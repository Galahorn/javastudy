
public class ex_for_7 {

	public static void main(String[] args) {
		// 1~100������ ���ڵ� ������ ���� ����Ͻÿ�
		// ���) 1 -2 3 -4 5 -6 7 -8 9
		// -�� ������ ���ڴ� ¦�� = ¦���� ������ ���ض�

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i * (-1) + " ");
			} else if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		// �ܼ� �����̶�� ���׿����ڰ� �� ������ ���ǹ��� �������� ��쿡�� �������� ��������.
//		for(int i = 1; i <= 100; i++) {
//			System.out.print((i%2) == 1 ? i + " " : i*(-1) + " " );
	}

}
