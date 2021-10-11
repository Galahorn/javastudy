
public class ex_369 {

	public static void main(String[] args) {

//		for(int i = 1; i <= 50; i++) {
//			switch(i % 10) {
//			
//			case 3, 6, 9:
//				System.out.println("夢熱");
//			    break;
//			
//			case 5:
//				System.out.println("戲學");
//				break;
//				
//			default:	
//				System.out.println(i);
//				break;
//				
//			}
//		}
		for (int i = 1; i <= 50; i++) {
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				System.out.println("夢熱");

			} else if (i % 10 == 5) {
				System.out.println("戲學");

			} else {
				System.out.println(i);
			}
		}

	}

}
