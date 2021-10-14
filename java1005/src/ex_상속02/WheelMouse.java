
package ex_상속02;

public class WheelMouse extends Mouse {

	//Override(재정의) : 부모클래스의 내용대신 자식클래스에서 새로운 내용으로 재정의 하는것.
	//Override는 부모클래스에서 정의된 틀을 그대로 사용해야한다.
	//super키워드 : 부모클래스를 지칭
	
	

	@Override
	public void lclick() {
		System.out.println("휠마우스 왼쪽 클릭");
	}

	@Override
	public void rclick() {
		System.out.println("휠마우스 오른쪽 클릭");
	}

	@Override
	public void move() {
		System.out.println("휠마우스 이동");
	}
	public void scroll() {
		System.out.println("스크롤");
	}
