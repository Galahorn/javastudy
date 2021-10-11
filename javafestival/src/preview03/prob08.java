package preview03;

import java.util.Scanner;

public class prob08 {

	public static void main(String[] args) {
		// 누적 채점.
		Scanner sc = new Scanner(System.in);

		System.out.println("==== 채점하기 ====");
		System.out.print("정답 여부 >> ");
		String result = sc.next(); // 문자니까 next

		int score = 0; // 점수를 저장해주기 위한 변수
		int sum = 0; // 전체 점수의 합계를 저장하기 위한 변수

		for (int i = 0; i < result.length(); i++) {
			if(result.charAt(i) == 'o') {
				score++;
			}else {
				score = 0;
			}
			sum += score;
		}
		System.out.println(sum);

	}

}
