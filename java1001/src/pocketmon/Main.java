package pocketmon;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);


			
			Pocketmon mon1 = new Pocketmon("�̺���", "���", 5, 25, 25);
			Pocketmon mon2 = new Pocketmon("�����", "��Ʈ", 7, 40, 20);
			Pocketmon mon3 = new Pocketmon("������", "�巡��", 35, 160, 125);
			Pocketmon mon4 = new Pocketmon("���̸�", "�巡��", 11, 70, 65);
			

			

	/////////////////////////////////////////////////////////////////////////////		
//			
//			Pocketmon[] mons = new Pocketmon[6];
//			mons[0] = mon1;
//			mons[1] = mon2;
//			mons[2] = mon3;
			
			
//			���� ����Ʈ �����
			
			ArrayList<Pocketmon> mons = new ArrayList();
			
			//��������Ʈ�� ���ϸ� ��� add�Լ� �߿���  ����Ǵ� ������ ���� �������� ������ ������
			mons.add(mon1);
			mons.add(mon2);
			mons.add(mon3);
			mons.add(mon4);
			
			
			//�߰� ����
			mons.remove(1);
			
			//��������Ʈ �迭�� �� ���ϸ� ���� ���
			for(int i = 0; i < mons.size(); i++) {
				System.out.println("mon" + (i+1) + "�� �̸��� " + mons.get(i).getName() + "�Դϴ�.");
				System.out.println("mon" + (i+1) + "�� Ÿ���� " + mons.get(i).getType() + "�Դϴ�.");
				System.out.println("mon" + (i+1) + "�� ������ " + mons.get(i).getLv() + "�Դϴ�.");
				System.out.println("mon" + (i+1) + "�� ���ݷ��� " + mons.get(i).getAtk() + "�Դϴ�.");
				System.out.println("mon" + (i+1) + "�� ������ " + mons.get(i).getDef() + "�Դϴ�.");
				System.out.println();
				
		
			}
			
			//��������Ʈ
			
			
			
			
			
			
			
			
////////////////////////////////////////////////////////////////////////////////////////////////////			
//			
//			for(int i = 0; i < mons.length; i++) {
//				System.out.print("�̸�");
//				String name = sc.next();
//				
//			}
//			
			
			
			
			
//			System.out.println("mon1�� �̸� : " + mon1.getName());
//			System.out.println("mon1�� Ÿ�� : " + mon1.getType());
//			System.out.println("mon1�� ���� : " + mon1.getLv());
//			System.out.println("mon1�� ���ݷ� : " + mon1.getAtk());
//			System.out.println("mon1�� ���� : " + mon1.getDef());
//			System.out.println();
//			
//			System.out.println("mon2�� �̸� : " + mon2.getName());
//			System.out.println("mon2�� Ÿ�� : " + mon2.getType());
//			System.out.println("mon2�� ���� : " + mon2.getLv());
//			System.out.println("mon2�� ���ݷ� : " + mon2.getAtk());
//			System.out.println("mon2�� ���� : " + mon2.getDef());
//			System.out.println();
//			
//			System.out.println("mon3�� �̸� : " + mon3.getName());
//			System.out.println("mon3�� Ÿ�� : " + mon3.getType());
//			System.out.println("mon3�� ���� : " + mon3.getLv());
//			System.out.println("mon3�� ���ݷ� : " + mon3.getAtk());
//			System.out.println("mon3�� ���� : " + mon3.getDef());
//			System.out.println();

		}

	
}
