package ex_prob02;

public class Person {

	// ĸ��ȭ. ��������
	private String name;
	private int age;

	// ������ : ��ü�� �ʱ�ȭ �ϴ� �޼ҵ�.
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
		System.out.println("���Ѵ�!");
	}

	public void sleep() {
		System.out.println("�ܴ�!");
	}
}
