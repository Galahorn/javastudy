
public class ex_2d_array05 {

	public static void main(String[] args) {
		// 1. 2차원 배열을 생성. 정수형이래요
		// 이부분은 복습부분 기초중에 쌩기초임
		int[][] arr = new int[5][10];

		// 2. 그다음엔 뭐다? 초기화 해야지.
		int cnt = 1;

		for (int row = 0; row < arr.length; row++) { // 행에 관련
			for (int col = 0; col < arr[row].length; col++) { // 열에 관련
				arr[row][col] = cnt++;
				System.out.print(arr[row][col] + "\t"); // 출력
			}
			System.out.println(); // 줄바꿈

		}

	}

}
