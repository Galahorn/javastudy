import java.util.Arrays;

public class ex_bubble_sort {

	public static void main(String[] args) {
		// 오늘도 배열이구나아아!!! 정렬 알고리즘이래요 >> 원소들을 일정한 순서대로 열거하는 알고리즘
				// Bubble sort > 두 인접한 원소를 비교해서 정렬하는 방법 속도는 느리지만 코드가 단순하다.
				// 처음부터 끝까지 한싸이클 완벽하게 오름차순 정렬을 완료하는 것을 원스텝이라고 한다. 두번째면 투스텝
				// 들여쓰기는 ctrㅣ + a 다음 ctrl + shift + f
				// 많이는 쓰이지 않지만 언젠가는 써먹겠지. 원리는 알아야할거 이해할거아님
		
		int [] arr = { 45, 7, 12, 82, 25, 3 };
		
		// 증가하는 모양과 이미 정해진 횟수를 보니 for문~
				// 1step -> [0],[1] [1],[2] [2],[3] [3],[4]
				// 2step -> [0],[1] [1],[2] [2],[3]
				// 3step -> [0],[1] [1],[2]
				// 4step -> [0],[1]
		for(int j = 0; j < arr.length-1; j++) {
			for(int i = 0; i < arr.length-1; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
				System.out.println(Arrays.toString(arr));
				
				
			}
			
		}

	}

}
