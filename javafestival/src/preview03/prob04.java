package preview03;

public class prob04 {

	public static void main(String[] args) {
		

		int[][] arr = new int[5][5];
		int num = 1;

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = (row*5) + (col+1);  // 아래로 순차 출력을 위해 행값과 열값의 위치를 바꿔줌
				num += 1;
			}

		}
		// 출력
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + "  ");
			}
			System.out.println();
		}

		System.out.println("\n90도 회전");
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr.length; col++) {
				System.out.print(arr[col][(arr.length-1)-row] + "  ");
			}
			System.out.println();
		}
	}

}