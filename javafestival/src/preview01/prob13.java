package preview01;

import java.util.Scanner;

public class prob13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���μ����� �� ���� �Է��Ͻÿ� : ");
		int input = sc.nextInt();
		System.out.print(input + " = ");

		for (int i = 2; i <= input; i++) { //������ ���� �����°ž�.
			while (input % i == 0) { //������ Ƚ���ε� ����̳� �����ǵ�?
				input /= i; // input = input/i
				System.out.print(i);
				if(input != 1) {
					System.out.print(" * ");
				}
				
				

			}

		}

	}

}
