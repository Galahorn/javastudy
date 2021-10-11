
public class ex_multy_for3 {

	public static void main(String[] args) {
		// 대망의 별찍기 2탄 이제 역순으로

//		for(int i = 1; i <= 5; i++) {
//			
//			for(int j = i; j <= 5; j++) {
//				System.out.print("*");
//			}
//		System.out.println();
//		}

///////////////////////////////////////////////////////////////////////		
//      
		// 이런 방법도 있다~

		for (int i = 1; i <= 5; i++) { // 라인을 돌려주는 for문

			for (int j = 5; j >= i; j--) { // 별을 그려줄 수 있는 for문
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
