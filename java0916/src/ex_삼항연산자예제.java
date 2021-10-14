import java.util.Scanner;

public class ex_삼항연산자예제 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("두 번째 정수 입력 : ");
		int b = sc.nextInt();
		
		int result = (a < b)?  b-a : a-b;
		
		System.out.print("두 수의 합은 : " + result);

	}

}
