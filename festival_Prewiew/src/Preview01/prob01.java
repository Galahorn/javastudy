package Preview01;

import java.util.Scanner;

public class prob01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int week = 0; //몇주인지 저장하는 변수값 
		
		System.out.print("현재몸무게 : "); //현재 몸무게 입력
		int now = sc.nextInt();
		
		System.out.print("목표몸무게 : "); // 목표 몸무게 입력
		int goal = sc.nextInt();
		
		do {
			week++; //실행 될때마다 1주씩 흘러가는 것을 계산
			System.out.print(week + "주차 감량 몸무게 : "); //1주차에 감량한 몸무게 값 입력
			int diet = sc.nextInt(); 
			
			now = now - diet; //현재 몸무게에서 감량한 몸무게 값을 현재 몸무게에 다시 저장하는 변수
		} while(now > goal); //목표몸무게보다 현재 몸무게가 작을때 출력문 출력.
			System.out.println(now + "kg 달성!! 축하합니다.");
			

	}

	
}