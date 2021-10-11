package preview01;

public class prob06 {

	public static void main(String[] args) {

	      int n1 = 78;
	      int n2 = 0;
	      int sum = 0;
	      for (int i = 1; i < 78; i++) {
	         n1--;
	         n2++;
	         sum += (n1 * n2);
	      }
	      System.out.println(sum);

	   }
	}


