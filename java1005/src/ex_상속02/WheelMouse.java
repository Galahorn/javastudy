
package ex_���02;

public class WheelMouse extends Mouse {

	//Override(������) : �θ�Ŭ������ ������ �ڽ�Ŭ�������� ���ο� �������� ������ �ϴ°�.
	//Override�� �θ�Ŭ�������� ���ǵ� Ʋ�� �״�� ����ؾ��Ѵ�.
	//superŰ���� : �θ�Ŭ������ ��Ī
	
	

	@Override
	public void lclick() {
		System.out.println("�ٸ��콺 ���� Ŭ��");
	}

	@Override
	public void rclick() {
		System.out.println("�ٸ��콺 ������ Ŭ��");
	}

	@Override
	public void move() {
		System.out.println("�ٸ��콺 �̵�");
	}
	public void scroll() {
		System.out.println("��ũ��");
	}
