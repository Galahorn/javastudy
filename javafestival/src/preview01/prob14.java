package preview01;

import java.util.Scanner;

public class prob14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력받을 정수 : ");
		
		int num = sc.nextInt();//입력용 변수
		String result = "";//저장용 변수 문자열로
		
		for(int i = num; i > 0; i/=2) { //우리가 입력받은 숫자가 i에 들어가고 i가 0보다 클때 여기있는 i값은 i나누기 2가 될거야 근데 이걸 반복할거야 i가 0이 될때까지.
			result = String.valueOf(i%2) + result;
		}
		System.out.println(result + " ");
		
		
		
		

	}

}
 