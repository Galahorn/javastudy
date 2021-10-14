package preview02;

public class prob04 {

	public static void main(String[] args) {
		// 성적별 학생수

		String score = "A,A,B,C,D,A,D,D,D,F";

		// split() 함수 사용하기

		String[] score2 = score.split(",");

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;

		for (int i = 0; i < score2.length; i++) {
			if (score2[i].equals("A")) {
				a++;
			} else if (score2[i].equals("B")) {
				b++;
			} else if (score2[i].equals("C")) {
				c++;
			} else if (score2[i].equals("D")) {
				d++;
			} else {
				f++;
			}

		}
		System.out.println("A : " + a + "명");
		System.out.println("B : " + b + "명");
		System.out.println("C : " + c + "명");
		System.out.println("D : " + d + "명");
		System.out.println("F : " + f + "명");

	}

}
