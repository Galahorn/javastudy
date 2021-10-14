
public class ex_2d_array2 {

	public static void main(String[] args) {
		// 5행 5열 크기의 2차원 array를 생성한 후 1~25까지 데이터를 초기화 하시오.

		int[][] arr = new int[5][5];

		int count = 1;

		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {

				arr[row][col] = count;
				count += 1;

			}
		}

		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {

				System.out.print(arr[row][col] + "\t");
			}
			System.out.println();
		}

	}

}
