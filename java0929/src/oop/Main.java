package oop;

public class Main {

	public static void main(String[] args) {
		// class = ���ο� �ڷ���
		// Human Ŭ������ �̿��Ͽ� Human��ü ����

		Human human = new Human();
		
		human.setName("���Գ�");
		human.setAge(32);
		human.setGender("����");
		human.setHeight(178.7);
		human.setWeight(72.6);

		System.out.println("Human�� �̸� >> " + human.getName());
		System.out.println("Human�� ���� >> " + human.getAge());
		System.out.println("Human�� ���� >> " + human.getGender());
		System.out.println("Human�� ���� >> " + human.getHeight());
		System.out.println("Human�� ü�� >> " + human.getWeight());

		System.out.println();

		// �Ǵٸ� ���赵�� ����ؼ� ��ü���� 2Ʈ
		Human human2 = new Human();

		human2.setName("ȫ�浿");
		human2.setAge(27);
		human2.setGender("����");
		human2.setHeight(180.1);
		human2.setWeight(68.6);

		System.out.println("Human�� �̸� >> " + human2.getName());
		System.out.println("Human�� ���� >> " + human2.getAge());
		System.out.println("Human�� ���� >> " + human2.getGender());
		System.out.println("Human�� ���� >> " + human2.getHeight());
		System.out.println("Human�� ü�� >> " + human2.getWeight());
		System.out.println();

		// 2�� ������ ����. �׷��� �̳� ���� ������ �Ѵٸ�? ���Ƕ˽�.. �޼ҵ� ����!
		// - > ��ü�� �����Ҷ� ���� �Ӽ����� �ο�������. = ������ �޼ҵ�.

		// ������ �޼ҵ�
		// new��� Ű���尡 ���Ǹ� �ڵ����� �����Ǵ� �޼ҵ�. �������� �ҹ�� �극��Ŀ... ����� ���ѵ� �̷��� �����...

		Human human3 = new Human("�Ӹ���", 28, "����", 180.0, 70.0); // ��ü���� 3Ʈ

		System.out.println(("Human�� �̸� >> ") + human3.getName());
		System.out.println("Human�� ���� >> " + human3.getAge());
		System.out.println("Human�� ���� >> " + human3.getGender());
		System.out.println("Human�� ���� >> " + human3.getHeight());
		System.out.println("Human�� ü�� >> " + human3.getWeight());
		System.out.println();

		Human human4 = new Human("�ں���", 32, "����"); // ��ü�κп��� 1Ʈ

		// �߰��� �������� �����......��....
		human4.setAge(26); // <- ��ģ�������� 26��� �����°���

		System.out.println("Human4�� �̸� >> " + human4.getName());
		System.out.println("Human4�� ���� >> " + human4.getAge());
		System.out.println("Human4�� ���� >> " + human4.getGender());

////////////////////////////////////////////////////////////////////////////////
	}
	}
