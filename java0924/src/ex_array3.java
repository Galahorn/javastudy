import java.util.Random;

public class ex_array3 {

	public static void main(String[] args) {
		Random rd = new Random();
		// 1. 정수형 데이터를 담을수 있는 배열 array를 선언.
		int[] array;

		// 2. array변수에 10개의 정수형 데이터를 담을수 있는 배열 array를 선언.
		array = new int[10];

		// 3. 배열내 1~20까지의 랜덤수로 초기화.

//		array[0] = rd.nextInt(20)+1;
//		array[1] = rd.nextInt(20)+1;
//		array[2] = rd.nextInt(20)+1;
//		array[3] = rd.nextInt(20)+1;
//		array[4] = rd.nextInt(20)+1;
//		array[5] = rd.nextInt(20)+1;
//		array[6] = rd.nextInt(20)+1;
//		array[7] = rd.nextInt(20)+1;
//		array[8] = rd.nextInt(20)+1;
//		array[9] = rd.nextInt(20)+1;
//      얘가 좀 반복되는데... 줄이려면.... 

		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(20) + 1;
		}

		// 4. array변수에 모든 데이터를 반복문을 활용하여 출력하시오.

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		// 5. 4번째 인덱스의 값과 9번째의 인덱스 값을 더한후 출력

		System.out.println();
		int a = array[4];
		int b = array[9];
		System.out.println("4번째와 9번째의 합 : " + (a + b));

		// 6. 배열내 모든 인덱스 값을 더한후 출력
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i]; // sum = sum + array[i];
		}
		System.out.println("모든 수의 합 : " + sum);

	}

}
