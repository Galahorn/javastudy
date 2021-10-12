import java.util.Scanner;

public class ex_03_do_while {

	public static void main(String[] args) {

		// 짝수가 나오기 전까지 입력받아라~
		Scanner sc = new Scanner(System.in);

		int a = 0; 
		
		do { 

			System.out.print("정수 입력 >> "); //조건식의 결과가 참일때 반복되고자 하는 명령문
			a = sc.nextInt();

		} while (a % 2 == 1); //검사 조건 true라면 do쪽으로 올라가서 반복 false면 탈출!
 		System.out.println("종료되었습니다");
	}

}
