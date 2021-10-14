
public class ex_continue {

	public static void main(String[] args) {
		// continue는 얘를 만났을때 위에 있는 for문으로 올라가서 조건검사를 다시시작

		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
