package preview03;

public class prob01미완 {

	public static void main(String[] args) {
		// 두 수의 차가 가장 작은 배열을 구하라
		int[] a = { 92, 52, 32, 9, 81, 2, 68 }; //숫자 지정용 배열
		int[] index = new int[2];
		
		int min = Math.abs(a[0] - a[1]); //Math.abs = 절대값을 리턴해주는 명령문
		for(int i = 0; i < a.length; i++) {//
			for(int j = i + 1; j < a.length; j++) { // +1의 이유는 그다음 배열의 값과 빼줘야하기 때문  
				int b = Math.abs(a[i] - a[j]);
				if(min > b) {
					min = b;
					index[0]=i;
					index[1]=j;
					
				}//이프문끝
			}//내부포문 끝
		}//외부포문 끝
		System.out.println("두 수의 차가 가장 작은 인덱스의 조합은 : " + "["+index[0]+", "+index[1]+"]");

	}

}
// 무슨 문제인지 모르겠네 슈밤....