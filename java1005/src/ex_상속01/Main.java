package ex_���01;

public class Main {

	public static void main(String[] args) {
		
		Character ch = new Character();
		
		//������ ����
		ch.forword();
		
		MageCharacter mg = new MageCharacter(); 

		mg.forword(); // => �θ�Ŭ������ ������ ��ӹ޾ұ⿡ ������ �ȳ�
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
