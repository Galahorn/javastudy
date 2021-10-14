package arraylist;

import java.util.ArrayList;

public class ex_01 {

	public static void main(String[] args) {

		// ArrayList << 크기가 유동적으로 변경됨. 가변리스트
		// 특징
		// 일반적인 배열과 같은 순차적인 리스트이다.
		// 인덱스를 사용하여 내부의 데이터를 관리한다.
		// 크기를 지정하지 않아도 원하는 만큼 데이터를 담을 수있다.

		// ArrayList의 선언
		// ArratList<가변리스트의 타입 (객체 타입)> 변수명 = new ArrayList<객체타입>();
		// <> = 제네릭

		ArrayList<String> names = new ArrayList<>();

		// 2. 데이터 추가하기.
		// 함수를 사용한 순서대로 하나씩 데이터가 저장된다.
		// 10개까지는 기본제공 그이후는 추가를 해주는 형식. 하지만 눈에 보이지 않는다.
		names.add("강규남");
		names.add("최성우");
		names.add("임명진");
		names.add(1, "채수민");

		// 3. 데이터확인하기 -> .get(인덱스);
		// for문으로
//		System.out.println(names.get(0));
//		System.out.println(names.get(1));
//		System.out.println(names.get(2));
//		System.out.println(names.get(3));
		// 4. 데이터 삭제하기. -> .remove(인덱스 번호);

		names.remove(0);
		System.out.println();

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));

		}

	}
}
