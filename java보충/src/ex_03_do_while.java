import java.util.Scanner;

public class ex_03_do_while {

	public static void main(String[] args) {

		// ¦���� ������ ������ �Է¹޾ƶ�~
		Scanner sc = new Scanner(System.in);

		int a = 0; 
		
		do { 

			System.out.print("���� �Է� >> "); //���ǽ��� ����� ���϶� �ݺ��ǰ��� �ϴ� ��ɹ�
			a = sc.nextInt();

		} while (a % 2 == 1); //�˻� ���� true��� do������ �ö󰡼� �ݺ� false�� Ż��!
 		System.out.println("����Ǿ����ϴ�");
	}

}
