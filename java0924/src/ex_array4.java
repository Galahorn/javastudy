import java.util.Random;

public class ex_array4 {

	public static void main(String[] args) {

		Random rd = new Random();
		System.out.print("array에 들어있는 짝수는 ");

		// 1. 5개의 숫자를 저장할수 있는 정수형 배열 array를 생성하시오
		int[] array = new int[5];

		// 2.array배열 내의 임의의 값을 초기화 하시오.

		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(20) + 1;
		}
		// 3. 배열 내 짝수의 값만 출력하시오.
		for (int i = 0; i < array.length; i++) {
//			if(array[i]%2 == 0) {
//		       System.out.print(+ array[i] + " ");
//		}
			System.out.print((array[i] % 2 == 0) ? array[i] + " " : "");

		}
		System.out.println("입니다.");

	}

}
