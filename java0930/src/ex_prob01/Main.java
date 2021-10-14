package ex_prob01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("최초 입금 금액을 입력하시오. >> ");
		int pay = sc.nextInt();

		Piggybank piggy = new Piggybank(pay);

		piggy.showMoney();

		// 입금
		System.out.print("입금 금액 >> ");
		pay = sc.nextInt();
		piggy.deposit(pay);
		piggy.showMoney();

		// 출금
		System.out.print("출금 금액 >> ");
		pay = sc.nextInt();

		piggy.withdraw(pay);
		piggy.showMoney();

	}

}
