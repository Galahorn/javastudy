<<<<<<< HEAD
package ex_���02;

public class Main {

	public static void main(String[] args) {
	
		Mouse mo = new Mouse();
		WheelMouse wmo = new WheelMouse();

		
		mo.lclick();
		mo.rclick();
		mo.move();
		
		//wmo.lclack �޼ҵ�� �θ�Ŭ������ ���ǵ� �޼ҵ带 ȣ���Ѵ�
		//�� �ڽ�Ŭ������ lclick�޼ҵ尡 ���̵Ǿ��ִٸ� �ڽ�Ŭ������ �޼ҵ带 ȣ���Ѵ�.
		//override ������� :
		//�ڽ�Ŭ������ �޼ҵ带 ���� ȣ��---> ������ X ----> �θ�Ŭ������ �޼ҵ带 ȣ��
		
		wmo.lclick();
		wmo.rclick();
		wmo.move();
		wmo.scroll();

	}

}
=======
package ex_���02;

public class Main {

	public static void main(String[] args) {
	
		Mouse mo = new Mouse();
		WheelMouse wmo = new WheelMouse();

		
		mo.lclick();
		mo.rclick();
		mo.move();
		
		//wmo.lclack �޼ҵ�� �θ�Ŭ������ ���ǵ� �޼ҵ带 ȣ���Ѵ�
		//�� �ڽ�Ŭ������ lclick�޼ҵ尡 ���̵Ǿ��ִٸ� �ڽ�Ŭ������ �޼ҵ带 ȣ���Ѵ�.
		//override ������� :
		//�ڽ�Ŭ������ �޼ҵ带 ���� ȣ��---> ������ X ----> �θ�Ŭ������ �޼ҵ带 ȣ��
		
		wmo.lclick();
		wmo.rclick();
		wmo.move();
		wmo.scroll();

	}

}
>>>>>>> branch 'master' of https://github.com/Galahorn/javastudy.git
