import java.util.Scanner;

public class ex_array2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 입력 : ");
			arr[i] = sc.nextInt();
						
		}
		
		System.out.println();
		System.out.print("입력된 점수 : ");
		
		for(int i = 0; i < arr.length; i++) {
			int score = arr[i];
			System.out.print(arr[i] + " ");
		}

	}

}
