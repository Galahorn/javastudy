import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int money, menu, change = 0; //���� �ݾ�, �޴�, �Ž����� ���� ����
		int coke = 800; // �ݶ�
        int water = 500; // ����
        int vitawater = 1500; // ��Ÿ�ο���
        int a, b, c = 0; // õ��, �����, ���
        
        System.out.println("�ݾ��� �Է��ϼ��� : ");
        money = sc.nextInt();
        
        System.out.println("�޴��� ������");
        System.out.print("1. �ݶ�(800��) 2. ����(500��) 3. ��Ÿ�ο���(1500��) >> ");
		menu = sc.nextInt();
		
		if(menu == 1 && money > coke) {
			change = money-coke;
		} else if (menu == 2 && money > water) {
			change = money-water;
		} else if (menu == 2 && money > vitawater) {
			change = money-vitawater;
		} else {
			change = money;
			System.out.println("���� �����ؿ� �Ф�");
		}
		System.out.println("�ܵ� : " + change +"��");
		
		a = change/1000;
		b= change%1000/500;
		c = change%1000%500/100;
		
		System.out.println("õ�� : " + a + "��");
		System.out.println("����� : " + b + "��");
		System.out.println("��� : " + c + "��");

	}

}
