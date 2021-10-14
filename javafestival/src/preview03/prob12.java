package preview03;

import java.util.Scanner;

public class prob12 {

	public static void main(String[] args) {
		// 입력된 문장의 알파벳 빈도수를 세는 알고리즘을 구성. 대소문자 구분 x

		Scanner sc = new Scanner(System.in);
		System.out.print("문장 입력 >> ");
		String word = sc.nextLine();// 문장입력이기에 뒤에 Line

		String trans = word.toLowerCase();// 소문자 변환.
		String[] w_arr = trans.split("");// 입력된 문자를 하나하나 배열에 저장

		// 비교할 알파벳 저장용 배열
		String[] spelling = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };

		for (int i = 0; i < spelling.length; i++) {//비교용 배열 순환용
			int count = 0;
			for (int j = 0; j < w_arr.length; j++) {//입력된 문장과 비교용 배열 비교후 카운트
				if (w_arr[j].equals(spelling[i])) {
					count++;
				}
			}
			System.out.println(spelling[i] + " : " + count);
		}

	}

}
