package ex_prob04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// BookData 객체생성.
		// 배열 이용가능? <= 아니 상상이 현실이 되는 마법이냐...
		// 이걸 배열로 나열 가능.

//		Bookdata bookdata1 = new Bookdata("Java", 21000, "홍길동");
//		Bookdata bookdata2 = new Bookdata("C++", 29000, "박문수");
//		Bookdata bookdata3 = new Bookdata("Database", 31000, "김장독");
//		Bookdata bookdata4 = new Bookdata("Android", 18000, "이순신");
//		Bookdata bookdata5 = new Bookdata("Web", 26000, "김철수");

//		System.out.println(bookdata1);
//		System.out.println("==============================================================");
//		System.out.println(bookdata2);
//		System.out.println("==============================================================");
//		System.out.println(bookdata3);
//		System.out.println("==============================================================");
//		System.out.println(bookdata4);
//		System.out.println("==============================================================");
//		System.out.println(bookdata5);
//		System.out.println("==============================================================");

		Scanner sc = new Scanner(System.in);

		// 객체배열
		Bookdata[] books = new Bookdata[5];

		for (int i = 0; i < books.length; i++) {
			System.out.print("책 이름 : ");
			String title = sc.next();

			System.out.print("가격 : ");
			int price = sc.nextInt();

			System.out.print("저자 : ");
			String writer = sc.next();

			// 객체 배열 내 데이터 초기화하는 방법.
			// 객체배열[인덱스] = new 클래스명(데이터1, 데이터2, ...);
			books[i] = new Bookdata(title, price, writer);

		}
		// 초기화
		// for문 가능할듯 <= 이것도 상상이 현실로 바뀌는 마법
		// 이게 되넼ㅋㅋㅋ
//		books[0] = bookdata1;
//		books[1] = bookdata2;
//		books[2] = bookdata3;
//		books[3] = bookdata4;
//		books[4] = bookdata5;

		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i]);
			System.out.println();
		}

	}

}
