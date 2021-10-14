import java.util.Arrays;
import java.util.Random;

public class ex_problem1 {

	public static void main(String[] args) {
		Random rd = new Random(); // 랜덤값 작업

		int[] arr = new int[10];

		// 배열 생성
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100) + 1;

		}
		System.out.println("원본 : " + Arrays.toString(arr));

//		// 선택정렬 진행하기.
//		for (int i = 0; i < arr.length - 1; i++) {
//
//			int max = i; // 기준 지정
//
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[max] < arr[j]) {
//					max = j;
//				}
//
//			}
//			int temp = arr[i];
//			arr[i] = arr[max];
//			arr[max] = temp;
//		}
//		System.out.println("결과 : " + Arrays.toString(arr));

		
		//버블 정렬
		for(int i = 0; i < arr.length -1; i++) {
			
			for(int j = 0; j < arr.length -1; j++) {
				//기준 설정
				if (arr[j] < arr[j+1]) {
					
					//치환식
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("결과 : " + Arrays.toString(arr));
	}



//for (int k = 0; k < arr.length; k++) { // 랜덤수 생성
//	= rd.nextInt(100) + 1;
//	
//	// 2.
//	for (int j = 0; j < arr.length - 1; j++) {
//		
//		int max = j;
//		
//		for (int i = j + 1; i < arr.length; i++) {
//			if (arr[max] < arr[i]) {
//				max = i;
//			}
//		}
//		int temp = arr[k];
//		arr[k] = arr[max];
//		arr[max] = temp;
//	}
//	
//}
//
//System.out.println(Arrays.toString(arr));

	}


