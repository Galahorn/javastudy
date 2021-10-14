import java.util.Random;

public class ex_array1 {

	public static void main(String[] args) {
		// 1차원 배열 (크기 5) 생성하기
		int[] arr = new int[5];

		// 2. 생선된 배열에 랜덤값을 저장하기
		Random rd = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(20) + 1;

			System.out.print(arr[i] + " ");
		}
		// 3. 각각의 값을 비교하여 가장 큰 값을 찾아내기!
		// 각각의 값을 비교할 수 있는 기준이 필요
		// 가장 큰 값을 기억할수 있는 변수 생성
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

			} else if (arr[i] < min) {
				min = arr[i];
			}

		}
		System.out.println();
		System.out.println("가장 큰 값 :" + max);
		System.out.println("가장 작은 값 :" + min);
	}
}