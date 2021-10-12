package Preview01;

import java.util.Random;

public class prob12 {

	public static void main(String[] args) {

		// 로또 번호를 생성해줄 난수값 불러오기
		Random rd = new Random();

		// 로또 번호를 담을 배열을 생성
		int[] lotto = new int[6];

		// 랜덤 번호 6개 만들기
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rd.nextInt(45) + 1;
			for (int j = 0; j < i; j++) { // 중복숫자가 나왔을때 전에 만들어진 인덱스값으로 가서 번호 재생성.
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}

		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println("행운의 숫자 : " + lotto[i]);
		}
	}

}
