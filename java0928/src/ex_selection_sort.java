import java.util.Arrays;

public class ex_selection_sort {

	public static void main(String[] args) {
		// �������� �̷���~ >> ���� ���� ���� ã�Ƽ� ������ ����. �̷��� �ϳ��ϳ� ������ ������ ��Ÿ��.


		int[] arr = { 98, 13, 70, 109, 24, 36, 48, 7 };

		// ���� ������ ����ɼ� �ֵ��� ���� ū for���� ����ڳ��.
		for (int j = 0; j < arr.length - 1; j++) {

			// �迭�� ���� ū���� ��ġ���� ����� �� �ִ� ���� ����
			int max = j;

			// ���� ū ���� ã�� �� �ִ� �˰����� ����ڳ��!
			for (int i = j + 1; i < arr.length; i++) {
				if (arr[max] < arr[i]) {
					max = i;

				} // if�� ��

			} // ���� for�� ��

			// ū ���� ã���� ġȯ�ؼ� �� �������ֱ�
			int temp = arr[j];
			arr[j] = arr[max];
			arr[max] = temp;

		} // �ܺ� for�� ��

		System.out.println(Arrays.toString(arr));


		}

	
	

	}


