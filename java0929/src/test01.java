
public class test01 {

	public static void main(String[] args) {
		//클래스명 객체명 =new 클래스명();
		MyMath math = new MyMath(); 
		
		//클래스 내 정의된 메소드를 접근할때에는 마침표(.)로 접근.
		//객체명.메소드명
		int result = math.cal(9, 9, '-');
		System.out.println(result);

	}

}
