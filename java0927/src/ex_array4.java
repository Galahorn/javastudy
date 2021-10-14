
public class ex_array4 {

	public static void main(String[] args) {

		int[] arr = { 3, 4, 4, 2, 1 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " : ");

			for (int j = 0; j < arr[i]; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

}
