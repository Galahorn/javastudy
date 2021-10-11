import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		//switch문으로 월입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		
		case 12:
		case 1:
		case 2:
			System.out.println(month + "월은 겨울입니다.");
		     break;
		case 3:
		case 4:
		case 5:
			System.out.println(month + "월은 봄입니다.");
			 break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "월은 여름입니다.");
			 break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "월은 가을입니다.");
			 break;
		}
				


	}

}
