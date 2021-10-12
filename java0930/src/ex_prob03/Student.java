package ex_prob03;

public class Student {

	private String name;
	private String number;
	private int age;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;
	
	public Student() {}
	
	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
		super();
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}

	public int getScoreWeb() {
		return scoreWeb;
	}

	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}

	public int getScoreAndroid() {
		return scoreAndroid;
	}

	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}
	
	public void show() {
		System.out.println(this.name + "님 안녕하세요.");
		System.out.println("[ " + this.number + ", " + this.age + "살 ]");
		System.out.println(this.name + "의 Java점수는 " + this.scoreJava + "입니다.");
		System.out.println(this.name + "의 Web점수는 " + this.scoreWeb + "입니다.");
		System.out.println(this.name + "의 Android점수는 " + this.scoreAndroid + "입니다.");
		System.out.println(this.name + "의 점수 평균은 " + (this.scoreJava + this.scoreWeb + this.scoreAndroid)/3 + "점 입니다.");
		System.out.println();
		System.out.println("==============================================================");
		System.out.println();
	}

	@Override
	public String toString() {
		return "Studunt [name=" + name + ", number=" + number + ", age=" + age + ", scoreJava=" + scoreJava
				+ ", scoreWeb=" + scoreWeb + ", scoreAndroid=" + scoreAndroid + "]";
	}
	
	
}
