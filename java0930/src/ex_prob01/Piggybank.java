package ex_prob01;

public class Piggybank {

	// 클래스는 객체를 만들기 위한 설계도만 된다.
	// 설계도를 생성할 수 있는 기능이 없다 -> main() 존재하지 않는다.

	// 클래스의 구조 -> 속성, 기능
	// 1. 속성 = 필드, 데이터
	
	private int money;
	
	// 2. 기능 = 행동, 메소드, 로직
	// deposit -> 입금하는 메소드
	// withdraw -> 인출하는 메소드
	// showMoney -> 잔액을 보여주는 메소드
	
	public Piggybank(int money) {
		this.money += money;
	}
	public void deposit(int money) {
		this.money += money;
	}
	public void withdraw(int money) {
		this.money -= money;
	}
	public void showMoney() {
		System.out.println("현재 잔액은 " + this.money + "입니다.");
		System.out.println();
	}



}
