package ex_prob03;

public class Main {

	public static void main(String[] args) {
		

		Student student1 = new Student();

		student1.setName("홍길동");
		student1.setNumber("20150675");
		student1.setAge(22);
		student1.setScoreJava(50);
		student1.setScoreWeb(89);
		student1.setScoreAndroid(77);

//		System.out.println("이름 >> " + student1.getName());
//		System.out.println("학번 >> " + student1.getNumber());
//		System.out.println("나이 >> " + student1.getAge() + "살");
//		System.out.println("자바 점수 >> " + student1.getScoreJava() + "점");
//		System.out.println("웹 점수 >> " + student1.getScoreWeb() + "점");
//		System.out.println("안드로이드 점수 >> " + student1.getScoreAndroid() + "점");
//		System.out.println();

/////////////////////////////////////////////////////////////////////////////////////////		
		Student student2 = new Student("김영희", "20090541", 29, 90, 25, 30);

//		System.out.println("이름 >> " + student2.getName());
//		System.out.println("학번 >> " + student2.getNumber());
//		System.out.println("나이 >> " + student2.getAge() + "살");
//		System.out.println("자바 점수 >> " + student2.getScoreJava() + "점");
//		System.out.println("웹 점수 >> " + student2.getScoreWeb() + "점");
//		System.out.println("안드로이드 점수 >> " + student2.getScoreAndroid() + "점");
//		System.out.println();
		
		
//		student1.show();
//		student2.show();
		
		System.out.println(student1);
		System.out.println("==============================================================");
		System.out.println(student2);
	
	}

}
