import java.util.Scanner;

public class ex_if_else3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �ð��� �Է��ϼ��� : ");
		int a = sc.nextInt();

		if (a <= 8) {
			System.out.print("�� �ӱ��� " + (a * 5000) + "�Դϴ�.");
		} else if (a > 8) {
			System.out.print("�� �ӱ��� " + ((8 * 5000) + (a - 8) * 7500) + "�Դϴ�");
		}

	}

}

// �������� �ڵ�
// int result = 0;
//
//
// if(a > 8) {
//    result = (8*5000) + (a-8)*7500;
// �Ǵ� result = (int)((8*5000) + (a-8)* 5000 * 1.5);  ->�� ������ �� ��ȯ(casting)�� ������ 
//     =>
//
//
// }else{
//    result = a*5000
// }
//
// System.out.print("�� �ӱ��� " + result +"�Դϴ�.");
//
// ����ȯ ����
// int a= 4;
// double b = 5.7;
//
// b = a; ���� �ȳ� ������ ����ȯ 
// a = (int)b; ���� ������ ��ȭ�ϰ� ���������� ��ȯ�ϱ⿡ ������ ���ټ� ���� ����� ����ȯ
