import java.util.Scanner;

public class ex_02_while2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// �μ��ڸ� �Է��ϰڳ��. �ٵ� �Ѵ� 0�� �ԷµǸ� �۵��� ���߰Ŷ�.
		System.out.print("A�� : ");
		int a = sc.nextInt();
		System.out.print("B�� : ");
		int b = sc.nextInt();
		
		System.out.println("��� >> " + (a - b));
	
		while (true) {

			System.out.print("A�� : ");
			a = sc.nextInt();
			System.out.print("B�� : ");
			b = sc.nextInt();

			if (a == 0 && b == 0) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
				System.out.println("��� >> " + (a - b));
			}
		}

	}

