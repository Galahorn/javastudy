
public class ex_continue {

	public static void main(String[] args) {
		// continue�� �긦 �������� ���� �ִ� for������ �ö󰡼� ���ǰ˻縦 �ٽý���

		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
