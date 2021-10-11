import java.util.Random;
import java.util.Scanner;

public class ex_method01 {

	public static void main(String[] args) {//<< 우리는 메소드를 쓰고있었어.
		// (같은공간이 아니라 오류가 난다네 static 영역이 아닌거지. 같은 영역이 아니면 실행이 안되는거야. 메인에 static 없으면 작동안함. 아무튼 그럼.)
		
		/* 이건 꼭 기억해야함. 객체지향에 메소드가 필요함. 안하면 개 피똥쌈. 
		 *  public     int    addNumber   (int num1, int num2) {  
		 * (접근제한자) (반환타입)  (   이름   ) (매개변수 (parameter))
		 * >> public 이건 어디에서도 다 쓸수 있다는 거야. 반대는 private
		 *  int result = num1 + num2;
		 *  return result; => 반환값(리턴값)
		 * 
		 * 두가지가 더있는데 이건 상속을 배워야 하는 개념이야
		 * 
		 * 반환타입(리턴타입) 메소드의 반환타입을 어떻게 할거냐! 정하는 건데 void는 아무것도 반환하지 않겠다!  
		 * public static void main(String[] args)
		 * 우리가 자주쓰는 이 메소드는 매개변수를 보면 입력은 가능하지만 void가 있으므로 리턴값을 반환하지 않겠다. 라고 하는거지. 
		 * 반환타입이 지정되면 그에 맞는 리턴값을 지정해줘야 해. 안그러면 에러터져서 피똥쌀거야.
		 * 뒤에 소괄호달고 있는 애들 대부분은 메소드임. 그 작동하는 기능 같은거?
		 * 
		 * 1. 입력과 출력이 모두 없는 메소드
		 * 2. 입력은 없고 출력만 있는 메소드
		 * 3. 입력은 있고 출력은 있는 메소드
		 * 4. 입력과 출력이 모두 있는 메소드
		 * 메소드를 만들어두면 클래스를 벗어나도 실행이 된다. 하지만 이글을 적고있는 지금 네녀석의 실력으로는 할수없는 일이지
		 * 강해져서 돌아와라
		 */
		// 메소드 호출 = 실행한다.
		hello();
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하세양 >> ");
		String msg = sc.nextLine();
		System.out.println(msg);
		 // (허허 네녀석도 메소드 였구나.) 너는 3번이구나~
		 // 네 녀석은 매개변수는 없는데 리턴값는 있는거네.
		
		
		Random rd = new Random();
		int lotto = rd.nextInt(45)+1;

	}
	//메소드 구조 - 매개변수도 없과 리턴값도 없는 구조
		//접근제한자 리턴타입 메소드이름(매개변수, 갯수제한 없음.) {
	    //}
		
		//가장 기본적인 구조.
		public static void hello() {
			System.out.println("Hello Method!");
	                 //(님도 메소드임? ㅇㅇ 메소드임) 위에나온 4가지중 2번이니?
		
		}
		//기능하나 만들었네? 오! 찌밤 내가 해냄!

}
