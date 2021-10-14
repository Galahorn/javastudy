
public class ex_2d_array1 {

	public static void main(String[] args) {

		// 2차원 배열은 1차원 배열 안의 1차원 배열이 들어있는 구조.
		// int[][] array = new int[3][2];
		// 2차원 배열의 length
		// -intArray.length => 2차원 배열의 행의개수 = 3
		// -intArray[1].length => 1번째 행의 열의 개수 = 2

		int[][] arr = new int[3][2];

		// 2차원 배열 데이터 초기화
		// : 배열[행인덱스][열인덱스] = 값;

		arr[0][0] = 1;
		arr[0][1] = 2;

		arr[1][0] = 3;
		arr[1][1] = 4;

		arr[2][0] = 5;
		arr[2][1] = 6;

		// 다중for문을 이용하여 2차원 배열 데이터 출력
		// array.length; = 행 크기
		// array[인덱스].length; = 열 크기
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {

				System.out.println(arr[row][col] + " \t");
			}
			System.out.println();
		}
		// \n은 줄바꿈 이스케이프 문자, \t는 tab기능, \r은 운영체제에 따라 다름
		// "" => 문자열 \' or \" => 자료형이 아닌 문자데이터로 인식
	}

}
