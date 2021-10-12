package preview02;

import java.util.Scanner;

public class prob06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 >> ");
		int a = sc.nextInt();
		int b = 1;
		
		for(int i = 0; i <= a; i++) {
			b += i;
			System.out.print(b +" ");
		}

	}

}
