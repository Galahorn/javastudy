import java.util.Random;

public class ex_array3 {

	public static void main(String[] args) {
		Random rd = new Random();
		// 1. ������ �����͸� ������ �ִ� �迭 array�� ����.
		int[] array;

		// 2. array������ 10���� ������ �����͸� ������ �ִ� �迭 array�� ����.
		array = new int[10];

		// 3. �迭�� 1~20������ �������� �ʱ�ȭ.

//		array[0] = rd.nextInt(20)+1;
//		array[1] = rd.nextInt(20)+1;
//		array[2] = rd.nextInt(20)+1;
//		array[3] = rd.nextInt(20)+1;
//		array[4] = rd.nextInt(20)+1;
//		array[5] = rd.nextInt(20)+1;
//		array[6] = rd.nextInt(20)+1;
//		array[7] = rd.nextInt(20)+1;
//		array[8] = rd.nextInt(20)+1;
//		array[9] = rd.nextInt(20)+1;
//      �갡 �� �ݺ��Ǵµ�... ���̷���.... 

		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(20) + 1;
		}

		// 4. array������ ��� �����͸� �ݺ����� Ȱ���Ͽ� ����Ͻÿ�.

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		// 5. 4��° �ε����� ���� 9��°�� �ε��� ���� ������ ���

		System.out.println();
		int a = array[4];
		int b = array[9];
		System.out.println("4��°�� 9��°�� �� : " + (a + b));

		// 6. �迭�� ��� �ε��� ���� ������ ���
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i]; // sum = sum + array[i];
		}
		System.out.println("��� ���� �� : " + sum);

	}

}
