package ex_prob01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Ա� �ݾ��� �Է��Ͻÿ�. >> ");
		int pay = sc.nextInt();

		Piggybank piggy = new Piggybank(pay);

		piggy.showMoney();

		// �Ա�
		System.out.print("�Ա� �ݾ� >> ");
		pay = sc.nextInt();
		piggy.deposit(pay);
		piggy.showMoney();

		// ���
		System.out.print("��� �ݾ� >> ");
		pay = sc.nextInt();

		piggy.withdraw(pay);
		piggy.showMoney();

	}

}
