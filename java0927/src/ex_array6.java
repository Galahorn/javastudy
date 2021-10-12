import java.util.Arrays;
import java.util.Scanner;

public class ex_array6 {

	public static void main(String[] args) {
		// 성적관리 알고리즘

		Scanner sc = new Scanner(System.in);

		int[] ans = { 1, 4, 3, 2, 1 }; // 정답데이터 저장 배열
		int[] inputs = new int[5]; // 입력값 저장 배열 생성
		int score = 0;// 총점을 보관하는 변수값 지정

		System.out.println("==채점하기==");
		System.out.println("정답을 입력하시오");

		// 5개의 문제에 대한 답을 저장하는 명령문
		for (int i = 0; i < inputs.length; i++) {
			System.out.print((i + 1) + "번 답 >> ");
			inputs[i] = sc.nextInt();
		}
		// 배열의 전체 데이터 출력
		// System.out.println(Arrays.toString(inputs)); 입력된 답이 정확하게 입력되는지 일단 확인

		System.out.println("==정답확인==");

		for (int i = 0; i < inputs.length; i++) {
			if (ans[i] == inputs[i]) {
				score = score + 20;
				System.out.print("O ");

			} else {
				System.out.print("x ");
			}

		}
		System.out.println("\n총점 : \"" + score + "\"");
	}
}
