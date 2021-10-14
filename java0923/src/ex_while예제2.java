import java.util.Scanner;

public class ex_while예제2 {

	public static void main(String[] args) {
		// 일단 숫자가 입력되면 짝수 또는 홀수 카운트에 누적, -1이 삽입되면 종료
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;

		while (true) {

			System.out.print("정수 입력 >> ");
			a = sc.nextInt();

			if (a % 2 == 0) {
				b++;
			} else if (a % 2 == 1) {
				c++;
			} else if (a == -1) {
				System.out.println("종료되었습니다.");
				break;
			}
			System.out.print("짝수 갯수 : " + b);
			System.out.print("홀수 갯수 : " + c);
		}

	}

}
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//선생님의 풀이법!
//Scanner sc = new Scanner(System.in);
//
//int a = 0;
//int b = 0;
//int c = 0;
//
//while(a ! = -1) {
//
//System.out.print("숫자 입력 >> ");
//a = sc.nextInt();
//
//if(a == -1) {
//System.out.println("종료되었습니다.");							
//
//} else {
//if(a%2 == 0){ //짝수일때
//b++;					
//
//} else { //홀수일때
//c++
//
//}
//System.out.println("짝수 개수 : " + b);
//System.out.println("홀수 개수 : " + c);
//}
//}
