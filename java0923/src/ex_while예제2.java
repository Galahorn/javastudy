import java.util.Scanner;

public class ex_while����2 {

	public static void main(String[] args) {
		// �ϴ� ���ڰ� �ԷµǸ� ¦�� �Ǵ� Ȧ�� ī��Ʈ�� ����, -1�� ���ԵǸ� ����
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;

		while (true) {

			System.out.print("���� �Է� >> ");
			a = sc.nextInt();

			if (a % 2 == 0) {
				b++;
			} else if (a % 2 == 1) {
				c++;
			} else if (a == -1) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
			System.out.print("¦�� ���� : " + b);
			System.out.print("Ȧ�� ���� : " + c);
		}

	}

}
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//�������� Ǯ�̹�!
//Scanner sc = new Scanner(System.in);
//
//int a = 0;
//int b = 0;
//int c = 0;
//
//while(a ! = -1) {
//
//System.out.print("���� �Է� >> ");
//a = sc.nextInt();
//
//if(a == -1) {
//System.out.println("����Ǿ����ϴ�.");							
//
//} else {
//if(a%2 == 0){ //¦���϶�
//b++;					
//
//} else { //Ȧ���϶�
//c++
//
//}
//System.out.println("¦�� ���� : " + b);
//System.out.println("Ȧ�� ���� : " + c);
//}
//}
