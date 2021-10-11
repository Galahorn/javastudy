
public class ex_array2 {

	public static void main(String[] args) {
		// call by value : 값을 호출하다. -> 변수의 값이 저장된 상태에서 그 저장된 값을 복사하여 불러오는 것.

		int num = 5;
		int num2 = num; // num에 저장된 5라는 데이터를 num2에 복사하여 저장

		System.out.println(num);
		System.out.println(num2);

		/////////////////////////////////////////////////////////////////////////////////////////////////////

		// call by reference -> 주소값을 호출하다. -> 주소의 값을 복사하여 불러오는 것.
		int[] numbers = new int[2];

		/*
		 * numbers2에는 numbers가 참조하고 이쓴 배열의 주소값을 참조한다. 즉 numbers와 numbers2는 같은 주소값을 참조.
		 */

		int[] numbers2 = numbers;

		System.out.println(numbers);
		System.out.println(numbers2);

		numbers[0] = 1;

		// 0번의 위치에 값 접근.
		System.out.println(numbers[0]);
		System.out.println(numbers2[0]);

		numbers2[1] = 5;
		System.out.println(numbers2[1]);
		System.out.println(numbers[1]);

	}

}
