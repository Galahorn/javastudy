package Preview01;

import java.util.Scanner;

public class prob01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int week = 0; //�������� �����ϴ� ������ 
		
		System.out.print("��������� : "); //���� ������ �Է�
		int now = sc.nextInt();
		
		System.out.print("��ǥ������ : "); // ��ǥ ������ �Է�
		int goal = sc.nextInt();
		
		do {
			week++; //���� �ɶ����� 1�־� �귯���� ���� ���
			System.out.print(week + "���� ���� ������ : "); //1������ ������ ������ �� �Է�
			int diet = sc.nextInt(); 
			
			now = now - diet; //���� �����Կ��� ������ ������ ���� ���� �����Կ� �ٽ� �����ϴ� ����
		} while(now > goal); //��ǥ�����Ժ��� ���� �����԰� ������ ��¹� ���.
			System.out.println(now + "kg �޼�!! �����մϴ�.");
			

	}

	
}