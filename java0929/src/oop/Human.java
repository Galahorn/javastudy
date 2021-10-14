package oop;

public class Human {
	//class ���� : Data(�ʵ庯��)�� Logic(�޼ҵ�)���� ����
	//����� �Ӽ� - �̸�(String), ����(int), ����(String), Ű(double), ������(double)
	//����� �ൿ - ����, ���ϱ�, �����ϱ�, �Ա�, �ȱ�
	
	private String name;
	private int age;
	private String gender;
	private double Height; 
	private double weight;
	
	// ������ �޼ҵ�� �⺻������ ������� �ִ�.
		// ������ �̸��� Ŭ���� �̸��� ����
		// �����ڴ� ����Ÿ���� ������ ���� ����.
		// �����ڴ� new�� ���� ��ü�� �����Ҷ��� ȣ��
		// �����ڴ� �ϳ��̻� ����Ǿ�� ��. >>�⺻������ �޼ҵ��� Ʋ�� ���������� > ������ �ο����� ���ߴ�. �ڵ����� ����.

		// ������ �޼ҵ��� ����
		// ����Ÿ���� ����. => void? �ƴ�! �׷��� ����. Ÿ���� ���°�
	
	//�⺻ ������
	public Human() {}
		
	//����� ���� ������.
	public Human(String name, int age, String gender, double Height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.Height = Height;
		this.weight = weight;
	}
	
	public Human(String name, int age, String gender) {

		// this Ű����� ���赵�� ���� ������ �ִ� �ʵ带 ����Ų��.

		this.name = name;
		this.age = age;
		this.gender = gender;

	}
		
		public void walk() {
			System.out.println("�ȴ´�.");
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
		System.out.println("���´�.");
	}
	public void talk() {
		System.out.println("���ϴ�.");
	}
}
