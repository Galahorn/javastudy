package pocketmon;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);


			
			Pocketmon mon1 = new Pocketmon("이브이", "노멀", 5, 25, 25);
			Pocketmon mon2 = new Pocketmon("고오스", "고스트", 7, 40, 20);
			Pocketmon mon3 = new Pocketmon("망나뇽", "드래곤", 35, 160, 125);
			Pocketmon mon4 = new Pocketmon("파이리", "드래곤", 11, 70, 65);
			

			

	/////////////////////////////////////////////////////////////////////////////		
//			
//			Pocketmon[] mons = new Pocketmon[6];
//			mons[0] = mon1;
//			mons[1] = mon2;
//			mons[2] = mon3;
			
			
//			가변 리스트 만들기
			
			ArrayList<Pocketmon> mons = new ArrayList();
			
			//가변리스트에 포켓몬 담기 add함수 중요함  실행되는 순서에 따라 데이터의 순서가 결정됨
			mons.add(mon1);
			mons.add(mon2);
			mons.add(mon3);
			mons.add(mon4);
			
			
			//중간 삭제
			mons.remove(1);
			
			//가변리스트 배열에 들어간 포켓몬 정보 출력
			for(int i = 0; i < mons.size(); i++) {
				System.out.println("mon" + (i+1) + "의 이름은 " + mons.get(i).getName() + "입니다.");
				System.out.println("mon" + (i+1) + "의 타입은 " + mons.get(i).getType() + "입니다.");
				System.out.println("mon" + (i+1) + "의 레벨은 " + mons.get(i).getLv() + "입니다.");
				System.out.println("mon" + (i+1) + "의 공격력은 " + mons.get(i).getAtk() + "입니다.");
				System.out.println("mon" + (i+1) + "의 방어력은 " + mons.get(i).getDef() + "입니다.");
				System.out.println();
				
		
			}
			
			//가변리스트
			
			
			
			
			
			
			
			
////////////////////////////////////////////////////////////////////////////////////////////////////			
//			
//			for(int i = 0; i < mons.length; i++) {
//				System.out.print("이름");
//				String name = sc.next();
//				
//			}
//			
			
			
			
			
//			System.out.println("mon1의 이름 : " + mon1.getName());
//			System.out.println("mon1의 타입 : " + mon1.getType());
//			System.out.println("mon1의 레벨 : " + mon1.getLv());
//			System.out.println("mon1의 공격력 : " + mon1.getAtk());
//			System.out.println("mon1의 방어력 : " + mon1.getDef());
//			System.out.println();
//			
//			System.out.println("mon2의 이름 : " + mon2.getName());
//			System.out.println("mon2의 타입 : " + mon2.getType());
//			System.out.println("mon2의 레벨 : " + mon2.getLv());
//			System.out.println("mon2의 공격력 : " + mon2.getAtk());
//			System.out.println("mon2의 방어력 : " + mon2.getDef());
//			System.out.println();
//			
//			System.out.println("mon3의 이름 : " + mon3.getName());
//			System.out.println("mon3의 타입 : " + mon3.getType());
//			System.out.println("mon3의 레벨 : " + mon3.getLv());
//			System.out.println("mon3의 공격력 : " + mon3.getAtk());
//			System.out.println("mon3의 방어력 : " + mon3.getDef());
//			System.out.println();

		}

	
}
