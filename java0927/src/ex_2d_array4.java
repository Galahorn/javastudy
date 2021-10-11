
public class ex_2d_array4 {

	public static void main(String[] args) {
		// 아래로 출력

		int[][] arr = new int[5][5];
		int num = 21;

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[col][row] = num; // 아래로 순차 출력을 위해 행값과 열값의 위치를 바꿔줌
				num += 1;
			}

		}
		// 출력
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + "\t");
			}
			System.out.println();
		}

	}

}
