package preview02;

import java.util.Scanner;

public class prob11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[]arr = new int[5];
		for(int i = 0; i< arr.length; i++) {
			System.out.print((i+1) + "번째 별의 개수 : ");
			arr[i] = sc.nextInt();
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
