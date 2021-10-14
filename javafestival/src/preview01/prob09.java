package preview01;

import java.util.Scanner;

public class prob09 {

	public static void main(String[] args) {
		// 최대공약수 최소공배수 구하기.

		Scanner sc = new Scanner(System.in); //왜 스캐너를 불러왔을까? 우리가 숫자를 입력하기 위한 도구니까. 입력할라고.

		System.out.print("숫자 1입력 >> ");//숫자를 넣기 위해. 근데 시스템은 돌아가도 우리가 숫자를 넣어야하는지 모르잖아. 그러니까 컴퓨터야 알려줘 숫자 넣으라고.
		int a = sc.nextInt();// 알려줬으니까 숫자를 넣을게

		System.out.print("숫자 2입력 >> ");
		int b = sc.nextInt();

		// 최소공배수 -> 가장 작은 공통된 곱하기 값. a와 b가 각각 곱셈을 했을때 같은 값이 나오는 가장 작은 값.

		int result1 = 0; //변수 선언이 된 이유? 최소공배수값을 저장하기 위해서지!
		for (int i = 1; i <= (a * b); i++) {//곱셈에서 0을 쓰면 값은 다 0이 되니 i는 11
			if (i % a == 0 && i % b == 0) { //a = 20 b = 30 i = 600      600 % 20 == 0       30 600/20
				result1 = i;
				break;
			}
///////////////////////////////////////////////////////////////////////////
//			while문을 사용할때.
//			int result1 = a;
//			while (true) {
//				if (result % a == 0 && result % b == 0) {
//					break;
//				}
//				result1++; // 최소공배수를 못찾았을시 다시 한번 시도해라.
		}

		// 최대공약수 = 가장 큰 공통된 약수
		int result2 = 0;//최대 공약수 값을 저장

		for (int i = 1; i >= 1; i--) {// 
			if (a % i == 0 && b % i == 0) {
				result2 = i;
				break;
			}

		}

		System.out.println("최소공배수 : " + result1);
		System.out.println("최대공약수 : " + result2);
	}
}
