package preview03;

import java.util.Scanner;

public class prob07 {

	public static void main(String[] args) {
		// 3자리수 계산
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 입력 >> ");
		int a = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int b = sc.nextInt();
		
		int sum = 0;
		
		for(int i =1 ; i <=3; i++) {
			int result = a * (b % (int)Math.pow(10, i) - b % (int)Math.pow(10, i-1));
			System.out.println(result/(int)Math.pow(10, i-1));
			sum += result;
		}
		System.out.println(sum);

	}

}
