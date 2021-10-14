package preview02;

public class prob03 {

	public static void main(String[] args) {
		// 가운데 글자 뽑아내기

		System.out.println(getMid("power"));

	}

	public static String getMid(String word) {

		String[] arr = word.split("");

		String result = "";

		if (arr.length % 2 == 0) { // 글자수가 짝수일 경우
			result = arr[arr.length / 2 - 1] + arr[arr.length / 2];

		} else {
			result = arr[arr.length / 2];

		}

		return result;
	}

}
