package Preview01;

import java.util.Scanner;

public class prob04 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �ݾ� �Է� : ");
		int input = sc.nextInt();
		
		System.out.println("�ܵ� : " + input);
		System.out.println("10000�� : " + input/10000 + "��");
		System.out.println("5000�� : " + input%10000/5000 + "��");
		System.out.println("1000�� : " + input%10000%5000/1000 + "��");
		System.out.println("500�� : " + input%10000%5000%1000/500 + "��");
		System.out.println("100�� : " + input%10000%5000%1000%500/100 + "��");
		
		
		

	}

}
