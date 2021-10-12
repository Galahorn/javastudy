
public class ex_Sequential_search {

	public static void main(String[] args) {
		// 검색 알고리즘 >> 말그대로 검색이다
		// Sequential search = 순차검색 > 단순, 정렬이 필요없음, 다만 비효율적.
		// 좀 많이 씀

		int[] arr = { 12, 35, 15, 11, 25, 72, 78, 13, 61, 90, 47 };

		int search = 11;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				System.out.println("위치는 " + (i + 1) + "번째임");
			}
		}

	}

}
