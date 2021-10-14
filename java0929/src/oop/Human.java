package oop;

public class Human {
	//class 구조 : Data(필드변수)와 Logic(메소드)으로 구성
	//사람의 속성 - 이름(String), 나이(int), 성별(String), 키(double), 몸무게(double)
	//사람의 행동 - 웃기, 말하기, 생각하기, 먹기, 걷기
	
	private String name;
	private int age;
	private String gender;
	private double Height; 
	private double weight;
	
	// 생성자 메소드는 기본구조로 만들어져 있다.
		// 생성자 이름은 클래스 이름과 동일
		// 생성자는 리턴타입을 지정할 수가 없다.
		// 생성자는 new를 통해 객체를 생성할때만 호출
		// 생성자는 하나이상 선언되어야 함. >>기본구조는 메소드의 틀만 가지고있음 > 역할을 부여받지 못했다. 자동으로 생략.

		// 생성자 메소드의 구조
		// 리턴타입은 없다. => void? 아니! 그런거 없다. 타입은 없는거
	
	//기본 생성자
	public Human() {}
		
	//사용자 지정 생성자.
	public Human(String name, int age, String gender, double Height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.Height = Height;
		this.weight = weight;
	}
	
	public Human(String name, int age, String gender) {

		// this 키워드는 설계도가 원래 가지고 있던 필드를 가르킨다.

		this.name = name;
		this.age = age;
		this.gender = gender;

	}
		
		public void walk() {
			System.out.println("걷는다.");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getHeight() {
		return Height;
	}
	public void setHeight(double Height) {
		this.Height = Height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void smile() {
		System.out.println("웃는다.");
	}
	public void talk() {
		System.out.println("말하다.");
	}
}
