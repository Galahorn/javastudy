import java.util.Random;

public class ex_array4 {

	public static void main(String[] args) {

		Random rd = new Random();
		System.out.print("array�� ����ִ� ¦���� ");

		// 1. 5���� ���ڸ� �����Ҽ� �ִ� ������ �迭 array�� �����Ͻÿ�
		int[] array = new int[5];

		// 2.array�迭 ���� ������ ���� �ʱ�ȭ �Ͻÿ�.

		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(20) + 1;
		}
		// 3. �迭 �� ¦���� ���� ����Ͻÿ�.
		for (int i = 0; i < array.length; i++) {
//			if(array[i]%2 == 0) {
//		       System.out.print(+ array[i] + " ");
//		}
			System.out.print((array[i] % 2 == 0) ? array[i] + " " : "");

		}
		System.out.println("�Դϴ�.");

	}

}
