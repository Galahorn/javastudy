package Preview01;

import java.util.Scanner;

public class prob02 {

	public static void main(String[] args) {
		//8시간 시급문제  8시간 초과시 초과분은 1.5배
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한 시간을 입력하시오. >> ");
		int time = sc.nextInt();
		int result = 0;
		
		if(time > 8) {
			result = (8*5000) + (time-8)*7500;
		}else {
			result = time*5000;
		}
		System.out.print("총 임금은 " + result + "입니다.");

	}

}
