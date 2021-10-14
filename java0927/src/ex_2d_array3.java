
public class ex_2d_array3 {

	public static void main(String[] args) {
		// 스네이크형 col값과 row값의 위치에 따라 출력 방법이 달라짐 지금은 상하 스네이크
		int[][] arr = new int[5][5];

		int count = 21;

		for (int row = 0; row < arr.length; row++) {
			if (row % 2 == 0) {
				for (int col = 0; col < arr.length; col++) {
					arr[col][row] = count;
					++count;
				}
			} else { //이부분의 코드 해석이 맛탱이가 간듯... 내 대가리는 빡대갈통인듯함..
				for (int col = arr[row].length - 1; col >= 0; col--) {
					arr[col][row] = count;
					++count;
				}
			}
		}
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {
				System.out.print(arr[col][row] + "\t");
			}
			System.out.println();
		}

	}

}
