package preview01;

import java.util.Scanner;

public class prob08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� >> ");
		int a = sc.nextInt();
		
		if(a%10 >= 5) {
			System.out.println("�ݿø� �� : " + ((a/10)+1) + "0");
		}else {
			System.out.println("�ݿø� �� : " + (a/10) + "0");
		}

	}

}
