
public class ex_multy_for3 {

	public static void main(String[] args) {
		// ����� ����� 2ź ���� ��������

//		for(int i = 1; i <= 5; i++) {
//			
//			for(int j = i; j <= 5; j++) {
//				System.out.print("*");
//			}
//		System.out.println();
//		}

///////////////////////////////////////////////////////////////////////		
//      
		// �̷� ����� �ִ�~

		for (int i = 1; i <= 5; i++) { // ������ �����ִ� for��

			for (int j = 5; j >= i; j--) { // ���� �׷��� �� �ִ� for��
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
