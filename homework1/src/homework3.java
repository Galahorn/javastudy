import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		
 // 자판기 프로그램
        
        // 사용자 금액, 메뉴, 음료가격 변수
        int money = 0;
        int menu = 0;
        int change = 0;
        
        // 천원, 오백원, 백원 변수
        int a = 0;
        int b = 0;
        int c = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("금액을 입력하시오.");
        money = sc.nextInt();
        
        System.out.println("메뉴를 고르세요");
        System.out.print("[1] 콜라(800원) [2] 생수(500원) [3] 비타민워터(1500원) >> ");
        menu = sc.nextInt();
        
        switch (menu) {
        case 1:
            change = 800;
            break;
        case 2:
            change = 500;
            break;
        case 3:
            change = 1500;
            break;
        default:
            System.out.println("메뉴 없음");
            break;
        }
        
        // 입력한 금액이 음료 가격보다 작은지 판별
        if (money < change) {
            System.out.println("돈이 부족해요 ㅠ.ㅠ");
        } else {
            money -= change;
        }
        
        System.out.println("잔돈 : " + money);
        
        // 천원, 오백원, 백원 개수 구하기
        a = money/1000;
        money %= 1000;
        b = money/500;
        money %= 500;
        c = money/100;
        
        System.out.println("천원 : " + a + "개, 오백원 : " + b + "개, 백원 : " + c + "개");

	}

}
