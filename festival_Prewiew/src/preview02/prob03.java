package preview02;

public class prob03 {

	public static void main(String[] args) {

		System.out.println(getMid("power"));

	}

	private static String getMid(String word) {

		String[] arr = word.split("");

		String result = "";

		if (arr.length % 2 == 0) {
			result = arr[arr.length / 2 - 1] + arr[arr.length / 2];

		} else {
			result = arr[arr.length / 2];
		}

		return result;
	}

}
