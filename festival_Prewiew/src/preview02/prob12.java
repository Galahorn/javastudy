package preview02;

import java.util.Scanner;

public class prob12 {
	
	public static void main(String[] args) {
		//������ ���ϴ� ������ ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ܼ� �Է� >> ");
		int a = sc.nextInt();
		
		System.out.print("��� ������ ��� >> ");
		int b = sc.nextInt();
		
		System.out.println(a + "��");
		
		for(int i = 1; i <= b; i++ ) {
			System.out.println(a + " * " + i + " = " + (a*b));
		}
		
		
	}

}
