import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int money, menu, change = 0; //투입 금액, 메뉴, 거스름돈 변수 지정
		int coke = 800; // 콜라
        int water = 500; // 생수
        int vitawater = 1500; // 비타민워터
        int a, b, c = 0; // 천원, 오백원, 백원
        
        System.out.println("금액을 입력하세요 : ");
        money = sc.nextInt();
        
        System.out.println("메뉴를 고르세요");
        System.out.print("1. 콜라(800원) 2. 생수(500원) 3. 비타민워터(1500원) >> ");
		menu = sc.nextInt();
		
		if(menu == 1 && money > coke) {
			change = money-coke;
		} else if (menu == 2 && money > water) {
			change = money-water;
		} else if (menu == 2 && money > vitawater) {
			change = money-vitawater;
		} else {
			change = money;
			System.out.println("돈이 부족해요 ㅠㅠ");
		}
		System.out.println("잔돈 : " + change +"원");
		
		a = change/1000;
		b= change%1000/500;
		c = change%1000%500/100;
		
		System.out.println("천원 : " + a + "개");
		System.out.println("오백원 : " + b + "개");
		System.out.println("백원 : " + c + "개");

	}

}
