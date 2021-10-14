package ex_상속03;

public class Bird extends Animal {

	@Override
	public void eat() {
		System.out.println("새가 모이를 쪼아먹는다.");
	}

	@Override
	public void move() {
		System.out.println("새가 날아다닌다.");
	}
	
	
	

}
