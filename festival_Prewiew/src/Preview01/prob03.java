package Preview01;

public class prob03 {

	public static void main(String[] args) {
		// 1~100까지의 수 짝수는 음수 홀수는 양수로 출력후 전체 합구하기 
		
		int result1 = 0; //밑에서 나온 음수의 모든 수를 더한 값을 저장하는 변수
		int result2 = 0; //밑에서 나온 양수의 모든 수를 더한 값을 저장하는 변수
		int sum = 0; //위의 두 수를 더한 수를 저장할 변수 지정
	
		
		for(int i = 1; i <= 100; i++) { //1부터 100까지의 반복문 지정
			
			if(i%2 == 0) { //만약 i값이 짝수일때
				result1 += (i*(-1)); //반복문이 끝날때까지 나온 음수의 모든 수를 더하는 것
				System.out.print(i*(-1) + " ");//음수로 만들어서 출력
				
			}else if(i%2 == 1) { //i값이 홀수일때
				result2 += (i); //반복문이 끝날때까지 나온 양수의 모든 수를 더하는 것
				System.out.print(i + " ");//양수 그대로 출력
				
			}
		}
		sum = result2 + result1;
		System.out.println();
		System.out.println("결과 >> " + sum);
	
	 

	}

}
