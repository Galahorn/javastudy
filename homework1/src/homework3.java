import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		
 // ���Ǳ� ���α׷�
        
        // ����� �ݾ�, �޴�, ���ᰡ�� ����
        int money = 0;
        int menu = 0;
        int change = 0;
        
        // õ��, �����, ��� ����
        int a = 0;
        int b = 0;
        int c = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("�ݾ��� �Է��Ͻÿ�.");
        money = sc.nextInt();
        
        System.out.println("�޴��� ������");
        System.out.print("[1] �ݶ�(800��) [2] ����(500��) [3] ��Ÿ�ο���(1500��) >> ");
        menu = sc.nextInt();
        
        switch (menu) {
        case 1:
            change = 800;
            break;
        case 2:
            change = 500;
            break;
        case 3:
            change = 1500;
            break;
        default:
            System.out.println("�޴� ����");
            break;
        }
        
        // �Է��� �ݾ��� ���� ���ݺ��� ������ �Ǻ�
        if (money < change) {
            System.out.println("���� �����ؿ� ��.��");
        } else {
            money -= change;
        }
        
        System.out.println("�ܵ� : " + money);
        
        // õ��, �����, ��� ���� ���ϱ�
        a = money/1000;
        money %= 1000;
        b = money/500;
        money %= 500;
        c = money/100;
        
        System.out.println("õ�� : " + a + "��, ����� : " + b + "��, ��� : " + c + "��");

	}

}
