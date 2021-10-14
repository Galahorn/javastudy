<<<<<<< HEAD
package ex_상속02;

public class Main {

	public static void main(String[] args) {
	
		Mouse mo = new Mouse();
		WheelMouse wmo = new WheelMouse();

		
		mo.lclick();
		mo.rclick();
		mo.move();
		
		//wmo.lclack 메소드는 부모클래스의 정의된 메소드를 호출한다
		//단 자식클래스의 lclick메소드가 정이되어있다면 자식클래스의 메소드를 호출한다.
		//override 실행순서 :
		//자식클래스의 메소드를 먼저 호출---> 재정의 X ----> 부모클래스의 메소드를 호출
		
		wmo.lclick();
		wmo.rclick();
		wmo.move();
		wmo.scroll();

	}

}
=======
package ex_상속02;

public class Main {

	public static void main(String[] args) {
	
		Mouse mo = new Mouse();
		WheelMouse wmo = new WheelMouse();

		
		mo.lclick();
		mo.rclick();
		mo.move();
		
		//wmo.lclack 메소드는 부모클래스의 정의된 메소드를 호출한다
		//단 자식클래스의 lclick메소드가 정이되어있다면 자식클래스의 메소드를 호출한다.
		//override 실행순서 :
		//자식클래스의 메소드를 먼저 호출---> 재정의 X ----> 부모클래스의 메소드를 호출
		
		wmo.lclick();
		wmo.rclick();
		wmo.move();
		wmo.scroll();

	}

}
>>>>>>> branch 'master' of https://github.com/Galahorn/javastudy.git
