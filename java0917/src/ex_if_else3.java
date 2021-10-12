import java.util.Scanner;

public class ex_if_else3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("일한 시간을 입력하세요 : ");
		int a = sc.nextInt();

		if (a <= 8) {
			System.out.print("총 임금은 " + (a * 5000) + "입니다.");
		} else if (a > 8) {
			System.out.print("총 임금은 " + ((8 * 5000) + (a - 8) * 7500) + "입니다");
		}

	}

}

// 선생님의 코드
// int result = 0;
//
//
// if(a > 8) {
//    result = (8*5000) + (a-8)*7500;
// 또는 result = (int)((8*5000) + (a-8)* 5000 * 1.5);  ->이 때에는 형 변환(casting)이 들어가야함 
//     =>
//
//
// }else{
//    result = a*5000
// }
//
// System.out.print("총 임금은 " + result +"입니다.");
//
// 형변환 예시
// int a= 4;
// double b = 5.7;
//
// b = a; 에러 안남 묵시적 형변환 
// a = (int)b; 에러 나지만 괄화하고 정수형으로 변환하기에 에러를 없앨수 있음 명시적 형변환
