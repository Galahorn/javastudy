package ex_prob02;

public class Person {

	// 캡슐화. 정보은닉
	private String name;
	private int age;

	// 생성자 : 객체를 초기화 하는 메소드.
	public Person() {
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
//////////////////////////////////////

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

	public void talk() {
		System.out.println("말한다!");
	}

	public void sleep() {
		System.out.println("잔다!");
	}
}
