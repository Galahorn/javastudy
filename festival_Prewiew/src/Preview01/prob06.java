package Preview01;

public class prob06 {

	public static void main(String[] args) {
		//증감식 활용

		int a = 78;
		int b = 0;
		int sum = 0;
		
		for(int i = 1; i < 78; i++) {
			a--;
			b++;
			sum += (a*b);
						
		}
		System.out.println(sum);
		
	}

}
