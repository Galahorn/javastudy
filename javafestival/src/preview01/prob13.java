package preview01;

import java.util.Scanner;

public class prob13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("소인수분해 할 수를 입력하시오 : ");
		int input = sc.nextInt();
		System.out.print(input + " = ");

		for (int i = 2; i <= input; i++) { //나누는 수를 돌리는거야.
			while (input % i == 0) { //나누는 횟수인데 몇번이나 나눌건데?
				input /= i; // input = input/i
				System.out.print(i);
				if(input != 1) {
					System.out.print(" * ");
				}
				
				

			}

		}

	}

}
