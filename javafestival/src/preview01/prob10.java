package preview01;

import java.util.Random;

public class prob10 {

	public static void main(String[] args) {

		Random rd = new Random();

		int[] arr = new int[8];

		for (int i = 0; i < arr.length; i++) {// 배열8개에 랜덤수 8개를 각각 저장하기위해서 돌리는 for문
			arr[i] = rd.nextInt(20) + 1;//랜덤수 1~20번까지 

			System.out.print(arr[i] + " ");// 배열의 부여된 8개의 랜덤수를 출력하기위해 -> 어떤수가 나왔는지 확인하기위해서.
		}
//////////////////////////////////////////////////////////////////
		int max = arr[0]; //가장 큰값을 저장하기 위한 변수 
		int min = arr[0]; //가장 작은 값을 저장하기 위한 변수
		for (int i = 0; i < arr.length; i++) { //우리가 전체 배열을 돌아다니면서 비교가 끝날때까지 돌아다니게 해주는 for문
			if (arr[i] > max) { // arr[i]에 저장된 값이 max와 비교했을때 크다면 if문 아래있는 수식을 실행할게요. 작다면 실행안할거에요.
				max = arr[i];// 만약 if문의 조건에 해당하다면 지금 있는 max값에 저장된 숫자는 날려버리고 max보다 컸던 arr[i]을 여기에 저장할거에요.근데 이작업은 반복이 될거에요 언제까지?

			} else if (arr[i] < min) {//만약에 arr[i] 값이 min보다 작으면 아래에 있는 수식을 실행할게요. 크다면 실행을 안할거에요.
				min = arr[i];//만약 else if문에 해당한다면 지금있는 min 값에 저장된 숫자는 날려버리고 min보다 작았던 arr[i]를 여기에 저장할거에요. 언제까지? for문이 끝날때까지.

			}
		}
		System.out.println();
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);

	}

}