
public class ex_array1 {

	public static void main(String[] args) {
		/*
		 * �迭(array) : ���� ������ Ÿ���� ������ �����͸� �ϳ��� �����ϴ� �ڷᱸ�� 
		 * �迭 ���� & �ʱ�ȭ 
		 * �ڷ��� [] ������ = new �ڷ���[������ ������ ũ��];
		 *  ( ���� )                    ( �ʱ�ȭ )
		 */
		int[] numbers = new int[5]; // 5���� �����͸� �����Ҽ� �ִ� 5���� ������

		// ���۷��� ����(��������)�� �״�� ��� => �迭�� �ּҰ��� ����Ѵ�.
		System.out.println(numbers);

		// �ε���(��ġ)�� Ȱ���Ͽ� �迭 �� �����Ϳ� ����
		// ���ȣ ����� ���ڸ� �ε������ �θ���. �ε����� 0���� ����.

		System.out.println(numbers[0]); // �ε����� �⺻���� �ڷ������� �ٸ�. int���� �⺻���� 0��
		System.out.println(numbers[1]);

		// �迭�� ������ �ʱ�ȭ
		// : ���۷�������[�ε���] = �ʱ�ȭ �� ��;
		numbers[0] = 5;
		numbers[1] = 10;
		numbers[2] = 15;
		numbers[3] = 20;
		numbers[4] = 25;
//		numbers[5] = 30; // <- java.lang.ArrayIndexOutOfBoundsException : ������ ��� ����

		// �ʱ�ȭ �� �迭�� �����͸� ��� �����Ͻÿ�.
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
//		System.out.println(numbers[3]);
//		System.out.println(numbers[4]);

//      �ݺ����� Ȱ���Ͽ� �迭�� ������ ����
//      �迭 ���۷�������.length : �迭�� ũ��		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		// 1,2,3,4,5 �����͸� �����ϴ� numbers2 �迭������ �����Ͻÿ�.

		int[] numbers2 = { 1, 2, 3, 4, 5 };

		// numbers ������ �����͸� ��� ���� �� ����Ͻÿ�.

		for (int i = 0; i < numbers2.length; i++) {
			System.out.println(numbers2[i]);
		}

	}

}
