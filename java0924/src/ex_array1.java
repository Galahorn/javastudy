
public class ex_array1 {

	public static void main(String[] args) {
		/*
		 * 배열(array) : 같은 데이터 타입의 수많은 데이터를 하나로 관리하는 자료구조 
		 * 배열 선언 & 초기화 
		 * 자료형 [] 변수명 = new 자료형[생성할 공간의 크기];
		 *  ( 선언 )                    ( 초기화 )
		 */
		int[] numbers = new int[5]; // 5개의 데이터를 저장할수 있는 5개의 데이터

		// 레퍼런스 변수(참조변수)를 그대로 출력 => 배열의 주소값을 출력한다.
		System.out.println(numbers);

		// 인덱스(위치)를 활용하여 배열 내 데이터에 접근
		// 대괄호 가운데의 숫자를 인덱스라고 부른다. 인덱스는 0부터 시작.

		System.out.println(numbers[0]); // 인덱스내 기본값은 자료형마다 다름. int형의 기본값은 0임
		System.out.println(numbers[1]);

		// 배열내 데이터 초기화
		// : 레퍼런스변수[인덱스] = 초기화 할 값;
		numbers[0] = 5;
		numbers[1] = 10;
		numbers[2] = 15;
		numbers[3] = 20;
		numbers[4] = 25;
//		numbers[5] = 30; // <- java.lang.ArrayIndexOutOfBoundsException : 범위를 벗어난 오류

		// 초기화 된 배열내 데이터를 모두 접근하시오.
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
//		System.out.println(numbers[3]);
//		System.out.println(numbers[4]);

//      반복문을 활용하여 배열내 데이터 접근
//      배열 레퍼런스변수.length : 배열의 크기		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		// 1,2,3,4,5 데이터를 저장하는 numbers2 배열변수를 생성하시오.

		int[] numbers2 = { 1, 2, 3, 4, 5 };

		// numbers 변수내 데이터를 모두 접근 후 출력하시오.

		for (int i = 0; i < numbers2.length; i++) {
			System.out.println(numbers2[i]);
		}

	}

}
