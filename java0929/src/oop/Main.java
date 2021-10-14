package oop;

public class Main {

	public static void main(String[] args) {
		// class = 새로운 자료형
		// Human 클래스를 이용하여 Human객체 생성

		Human human = new Human();
		
		human.setName("강규남");
		human.setAge(32);
		human.setGender("남자");
		human.setHeight(178.7);
		human.setWeight(72.6);

		System.out.println("Human의 이름 >> " + human.getName());
		System.out.println("Human의 나이 >> " + human.getAge());
		System.out.println("Human의 성별 >> " + human.getGender());
		System.out.println("Human의 신장 >> " + human.getHeight());
		System.out.println("Human의 체중 >> " + human.getWeight());

		System.out.println();

		// 또다른 설계도를 사용해서 인체연성 2트
		Human human2 = new Human();

		human2.setName("홍길동");
		human2.setAge(27);
		human2.setGender("남자");
		human2.setHeight(180.1);
		human2.setWeight(68.6);

		System.out.println("Human의 이름 >> " + human2.getName());
		System.out.println("Human의 나이 >> " + human2.getAge());
		System.out.println("Human의 성별 >> " + human2.getGender());
		System.out.println("Human의 신장 >> " + human2.getHeight());
		System.out.println("Human의 체중 >> " + human2.getWeight());
		System.out.println();

		// 2명 까지는 쉽지. 그런데 겁나 많이 만들어야 한다면? 개피똥쌈.. 메소드 등장!
		// - > 객체를 생성할때 부터 속성값을 부여해주자. = 생성자 메소드.

		// 생성자 메소드
		// new라는 키워드가 사용되면 자동으로 생성되는 메소드. 마법같은 뚝배기 브레이커... 기능은 편한데 이론이 어려워...

		Human human3 = new Human("임명진", 28, "남자", 180.0, 70.0); // 인체연성 3트

		System.out.println(("Human의 이름 >> ") + human3.getName());
		System.out.println("Human의 나이 >> " + human3.getAge());
		System.out.println("Human의 성별 >> " + human3.getGender());
		System.out.println("Human의 신장 >> " + human3.getHeight());
		System.out.println("Human의 체중 >> " + human3.getWeight());
		System.out.println();

		Human human4 = new Human("박보영", 32, "여자"); // 인체부분연성 1트

		// 중간에 경유지를 들려서......작....
		human4.setAge(26); // <- 이친구때문에 26살로 나오는거임

		System.out.println("Human4의 이름 >> " + human4.getName());
		System.out.println("Human4의 나이 >> " + human4.getAge());
		System.out.println("Human4의 성별 >> " + human4.getGender());

////////////////////////////////////////////////////////////////////////////////
	}
	}
