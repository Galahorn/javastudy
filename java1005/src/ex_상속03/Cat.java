package ex_상속03;

public class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("고양이가 밥그릇을 엎었다.");
	}

	@Override
	public void move() {
		System.out.println("고양이가 노트북 위에서 비키지 않는다.");	
	}

}
