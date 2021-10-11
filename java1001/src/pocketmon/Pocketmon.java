package pocketmon;

public class Pocketmon {

	private String name;
	private String type;
	private int lv;
	private int atk;
	private int def;

	public Pocketmon() {
	}

	public Pocketmon(String name, String type, int lv, int atk, int def) {
		super();
		this.name = name;
		this.type = type;
		this.lv = lv;
		this.atk = atk;
		this.def = def;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	// �ൿ
	public void fight() {
		System.out.println(name + "�� �ٸ� ���ϸ�� �ο�� �����ߴ�.");
	}

	public void skill() {
		System.out.println(name + "�� �����ġ�⸦ ����Ͽ���. ȿ���� �𸣰ڴ�.");
	}

	public void useItem() {
		System.out.println(name + "�� ȸ������ ����Ͽ���. ü���� ȸ���Ǿ���.");
	}

	public void victory() {
		System.out.println(name + "�������� �¸��ߴ�.");
	}

	public void defeat() {
		System.out.println(name + "�������� �й��ߴ�. " + name + "�� �����ߴ�.");
	}

	public void exp() {
		System.out.println(name + "�� 100 ����ġ�� ȹ���ߴ�. " + (lv + 1) + "(��)�� �����ߴ�.");
		System.out.println("���ݷ��� " + (atk + 2) + "(��)�� �ö���.");
		System.out.println("������ " + (atk + 2) + "(��)�� �ö���.");

	}

}
