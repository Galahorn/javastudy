package preview02;

import java.util.Scanner;

public class prob06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� >> ");
		int a = sc.nextInt();
		int b = 1;
		
		for(int i = 0; i <= a; i++) {
			b += i;
			System.out.print(b +" ");
		}

	}

}
