package Preview01;

import java.util.Scanner;

public class prob05 {

	public static void main(String[] args) {
		// 별찍기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int a = sc.nextInt();
		
		for(int i = 1; i <= a ; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
