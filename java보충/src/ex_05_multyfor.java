import java.util.Scanner;

public class ex_05_multyfor {

	public static void main(String[] args) {
		//����for���� �Ǿտ� �ִ� for���� ���� ����,
		//�ι�°�� ���� for���ȿ� �ִ� ������ Ȱ��.
	
		Scanner sc = new Scanner(System.in);
		int a = 0;
		System.out.print("���� �Է� >> ");
		a = sc.nextInt();
		
		for(int i = 2; i <= a; i++) { //<< ����̳�.
			
			for(int j = 1; j <= 9; j++) { //���� ���Ұų�.
				
				System.out.println(i + " * " + j + " = " + (i*j) +" ");
		}
			System.out.println();
			
		}

	}

}
