package Preview01;

import java.util.Scanner;

public class prob04 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총 금액 입력 : ");
		int input = sc.nextInt();
		
		System.out.println("잔돈 : " + input);
		System.out.println("10000원 : " + input/10000 + "개");
		System.out.println("5000원 : " + input%10000/5000 + "개");
		System.out.println("1000원 : " + input%10000%5000/1000 + "개");
		System.out.println("500원 : " + input%10000%5000%1000/500 + "개");
		System.out.println("100원 : " + input%10000%5000%1000%500/100 + "개");
		
		
		

	}

}
