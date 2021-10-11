package ex_prob01;

public class Piggybank {

	// Ŭ������ ��ü�� ����� ���� ���赵�� �ȴ�.
	// ���赵�� ������ �� �ִ� ����� ���� -> main() �������� �ʴ´�.

	// Ŭ������ ���� -> �Ӽ�, ���
	// 1. �Ӽ� = �ʵ�, ������
	
	private int money;
	
	// 2. ��� = �ൿ, �޼ҵ�, ����
	// deposit -> �Ա��ϴ� �޼ҵ�
	// withdraw -> �����ϴ� �޼ҵ�
	// showMoney -> �ܾ��� �����ִ� �޼ҵ�
	
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
		System.out.println("���� �ܾ��� " + this.money + "�Դϴ�.");
		System.out.println();
	}



}
