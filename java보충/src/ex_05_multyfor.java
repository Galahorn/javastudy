import java.util.Scanner;

public class ex_05_multyfor {

	public static void main(String[] args) {
		//이중for문은 맨앞에 있는 for문에 대한 변수,
		//두번째에 속한 for문안에 있는 변수를 활용.
	
		Scanner sc = new Scanner(System.in);
		int a = 0;
		System.out.print("숫자 입력 >> ");
		a = sc.nextInt();
		
		for(int i = 2; i <= a; i++) { //<< 몇단이냐.
			
			for(int j = 1; j <= 9; j++) { //몇을 곱할거냐.
				
				System.out.println(i + " * " + j + " = " + (i*j) +" ");
		}
			System.out.println();
			
		}

	}

}
