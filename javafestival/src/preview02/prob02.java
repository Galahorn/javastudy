package preview02;

import java.util.Scanner;

public class prob02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 >> ");
		int a = sc.nextInt();
		
		
		int [][]arr = new int[a][a];
		int num = 1;
		
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[j][i] = num;
				num += 1;
			}
		}
		
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j] + " ");	
			}
			System.out.println();
			}

	}

}
