package Preview01;

import java.util.Scanner;

public class prob05 {

	public static void main(String[] args) {
		// �����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int a = sc.nextInt();
		
		for(int i = 1; i <= a ; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
