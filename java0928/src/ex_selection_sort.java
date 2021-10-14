import java.util.Arrays;

public class ex_selection_sort {

	public static void main(String[] args) {
		// 선택정렬 이랜다~ >> 가장 작은 값을 찾아서 앞으로 보냄. 이렇게 하나하나 앞으로 보내는 스타일.


		int[] arr = { 98, 13, 70, 109, 24, 36, 48, 7 };

		// 여러 스테이 진행될수 있도록 가장 큰 for문을 만들겠노라.
		for (int j = 0; j < arr.length - 1; j++) {

			// 배열중 가장 큰수의 위치값을 기억할 수 있는 변수 생성
			int max = j;

			// 가장 큰 수를 찾을 수 있는 알고리즘을 만들겠노라!
			for (int i = j + 1; i < arr.length; i++) {
				if (arr[max] < arr[i]) {
					max = i;

				} // if문 끝

			} // 내부 for문 끝

			// 큰 수를 찾고나서 치환해서 값 변경해주기
			int temp = arr[j];
			arr[j] = arr[max];
			arr[max] = temp;

		} // 외부 for문 끝

		System.out.println(Arrays.toString(arr));


		}

	
	

	}


