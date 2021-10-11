package ex_상속03;

public class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("강아지가 사료를 허겁지겁 먹는다.");
	}

	@Override
	public void move() {
		System.out.println("오늘은 산책좀 그만하자아아아아앜");
	}

}
