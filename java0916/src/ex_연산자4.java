import java.util.Scanner;

public class ex_연산자4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Java 점수 입력 : ");
		int javaScore = sc.nextInt();

		System.out.print("Web 점수 입력 : ");
		int webScore = sc.nextInt();

		System.out.print("Android 점수 입력 : ");
		int androidScore = sc.nextInt();

		System.out.println("점수 합계 : " + (javaScore + webScore + androidScore));
		System.out.println("점수 평균 : " + (javaScore + webScore + androidScore) / 3);

	}

}
