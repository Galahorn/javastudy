package ex_prob04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// BookData ��ü����.
		// �迭 �̿밡��? <= �ƴ� ����� ������ �Ǵ� �����̳�...
		// �̰� �迭�� ���� ����.

//		Bookdata bookdata1 = new Bookdata("Java", 21000, "ȫ�浿");
//		Bookdata bookdata2 = new Bookdata("C++", 29000, "�ڹ���");
//		Bookdata bookdata3 = new Bookdata("Database", 31000, "���嵶");
//		Bookdata bookdata4 = new Bookdata("Android", 18000, "�̼���");
//		Bookdata bookdata5 = new Bookdata("Web", 26000, "��ö��");

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

		// ��ü�迭
		Bookdata[] books = new Bookdata[5];

		for (int i = 0; i < books.length; i++) {
			System.out.print("å �̸� : ");
			String title = sc.next();

			System.out.print("���� : ");
			int price = sc.nextInt();

			System.out.print("���� : ");
			String writer = sc.next();

			// ��ü �迭 �� ������ �ʱ�ȭ�ϴ� ���.
			// ��ü�迭[�ε���] = new Ŭ������(������1, ������2, ...);
			books[i] = new Bookdata(title, price, writer);

		}
		// �ʱ�ȭ
		// for�� �����ҵ� <= �̰͵� ����� ���Ƿ� �ٲ�� ����
		// �̰� �ǆ�������
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
