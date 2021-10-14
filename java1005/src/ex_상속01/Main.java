package ex_상속01;

public class Main {

	public static void main(String[] args) {
		
		Character ch = new Character();
		
		//앞으로 가기
		ch.forword();
		
		MageCharacter mg = new MageCharacter(); 

		mg.forword(); // => 부모클래스의 내용을 상속받았기에 에러가 안남
		mg.back();
		mg.jump();
		mg.magic1();
		
		WarriorCharacter wr = new WarriorCharacter();
		
		wr.forword();
		wr.back();
		wr.jump();
		wr.bash();
	


	}

}
