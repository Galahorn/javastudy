package preview02;

public class prob01 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		boolean result = isDivide(num1, num2);
		System.out.print("결과 확인 : " + result);
	}

	private static boolean isDivide(int num1, int num2) {
		 
		int result1 = num1%num2;
		//삼항가능 boolean result = (num1%num2 == 0)? true : false;
		if(result1 == 0) {
			boolean result = true;
			return result;
		}else {
			boolean result = false;
			return result;
		}
		
		
		}
	}


