import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		//switch������ ���Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int month = sc.nextInt();
		
		switch(month) {
		
		case 12:
		case 1:
		case 2:
			System.out.println(month + "���� �ܿ��Դϴ�.");
		     break;
		case 3:
		case 4:
		case 5:
			System.out.println(month + "���� ���Դϴ�.");
			 break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "���� �����Դϴ�.");
			 break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "���� �����Դϴ�.");
			 break;
		}
				


	}

}
