import java.util.Scanner;

public class ex_06_array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] names = { "성우", "승완", "명진", "수민", "태양" };

		System.out.print("검색할 이름은 무엇인가요? >> ");
		String name = sc.next();

		for (int i = 0; i < names.length; i++) {
			if (name.equals(names[i])) {
				System.out.println(name + "의 위치는 " + (i + 1) + "번째임");
				break;
			}
		}
	}

}
