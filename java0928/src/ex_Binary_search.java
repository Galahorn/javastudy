
public class ex_Binary_search {

	public static void main(String[] args) {
		// Binary_search >> 이진탐색or 이진검색 : 오름차순으로 정렬된 리스트에서 특정한 값의 위치를 찾는 알고리즘
		// 처음 중간의 값을 임의의 값으로 선택하여, 그 값과 찾고자 하는 값의 크고 작음을 비교하는 방식을 채택
		// 검색 원리상 정렬된 리스트에서만 사용 가능.

		int[] arr = { 1, 7, 9, 12, 13, 15, 25, 35, 47, 61, 72, 78, 90 };

		// 가장 작은 인덱스와 큰 인덱스를 기억할수 있는 변수 생성.
		int low = 0;
		int high = arr.length - 1;

		int search = 78;

		// 반복문 삽입. 횟수는 모르니까 while문을 사용하는것이 맞음

		while (true) { // 일단 조건식 없이 무조건 작동하도록 만들고

			int mid = (low + high) / 2; // 중간값은 로우와 하이값 위치정보의 평균값.

			if (arr[mid] == search) { // 운이 좋아 숫자가 같을때
				System.out.println("위치는 " + (mid + 1) + "번째임");
				break;
			
			} else if (arr[mid] > search) {
				high = mid - 1;
			
			} else if (arr[mid] < search) {
				low = mid + 1;
			}

		}
	}

}
