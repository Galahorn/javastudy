package preview03;

import java.util.Scanner;

public class prob07 {

	public static void main(String[] args) {
		// 3�ڸ��� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է� >> ");
		int a = sc.nextInt();
		System.out.print("�� ��° ���� �Է� >> ");
		int b = sc.nextInt();
		
		int sum = 0;
		
		for(int i =1 ; i <=3; i++) {
			int result = a * (b % (int)Math.pow(10, i) - b % (int)Math.pow(10, i-1));
			System.out.println(result/(int)Math.pow(10, i-1));
			sum += result;
		}
		System.out.println(sum);

	}

}
