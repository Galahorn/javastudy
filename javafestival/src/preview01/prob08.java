package preview01;

import java.util.Scanner;

public class prob08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 >> ");
		int a = sc.nextInt();
		
		if(a%10 >= 5) {
			System.out.println("반올림 수 : " + ((a/10)+1) + "0");
		}else {
			System.out.println("반올림 수 : " + (a/10) + "0");
		}

	}

}
