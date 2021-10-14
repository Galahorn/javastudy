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

	// 행동
	public void fight() {
		System.out.println(name + "은 다른 포켓몬과 싸우기 시작했다.");
	}

	public void skill() {
		System.out.println(name + "은 몸통박치기를 사용하였다. 효과는 모르겠다.");
	}

	public void useItem() {
		System.out.println(name + "은 회복약을 사용하였다. 체력이 회복되었다.");
	}

	public void victory() {
		System.out.println(name + "전투에서 승리했다.");
	}

	public void defeat() {
		System.out.println(name + "전투에서 패배했다. " + name + "은 기절했다.");
	}

	public void exp() {
		System.out.println(name + "은 100 경험치를 획득했다. " + (lv + 1) + "(으)로 성장했다.");
		System.out.println("공격력이 " + (atk + 2) + "(으)로 올랐다.");
		System.out.println("방어력이 " + (atk + 2) + "(으)로 올랐다.");

	}

}
