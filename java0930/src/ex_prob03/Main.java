package ex_prob03;

public class Main {

	public static void main(String[] args) {
		

		Student student1 = new Student();

		student1.setName("ȫ�浿");
		student1.setNumber("20150675");
		student1.setAge(22);
		student1.setScoreJava(50);
		student1.setScoreWeb(89);
		student1.setScoreAndroid(77);

//		System.out.println("�̸� >> " + student1.getName());
//		System.out.println("�й� >> " + student1.getNumber());
//		System.out.println("���� >> " + student1.getAge() + "��");
//		System.out.println("�ڹ� ���� >> " + student1.getScoreJava() + "��");
//		System.out.println("�� ���� >> " + student1.getScoreWeb() + "��");
//		System.out.println("�ȵ���̵� ���� >> " + student1.getScoreAndroid() + "��");
//		System.out.println();

/////////////////////////////////////////////////////////////////////////////////////////		
		Student student2 = new Student("�迵��", "20090541", 29, 90, 25, 30);

//		System.out.println("�̸� >> " + student2.getName());
//		System.out.println("�й� >> " + student2.getNumber());
//		System.out.println("���� >> " + student2.getAge() + "��");
//		System.out.println("�ڹ� ���� >> " + student2.getScoreJava() + "��");
//		System.out.println("�� ���� >> " + student2.getScoreWeb() + "��");
//		System.out.println("�ȵ���̵� ���� >> " + student2.getScoreAndroid() + "��");
//		System.out.println();
		
		
//		student1.show();
//		student2.show();
		
		System.out.println(student1);
		System.out.println("==============================================================");
		System.out.println(student2);
	
	}

}
