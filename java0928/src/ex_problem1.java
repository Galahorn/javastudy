import java.util.Arrays;
import java.util.Random;

public class ex_problem1 {

	public static void main(String[] args) {
		Random rd = new Random(); // ������ �۾�

		int[] arr = new int[10];

		// �迭 ����
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100) + 1;

		}
		System.out.println("���� : " + Arrays.toString(arr));

//		// �������� �����ϱ�.
//		for (int i = 0; i < arr.length - 1; i++) {
//
//			int max = i; // ���� ����
//
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[max] < arr[j]) {
//					max = j;
//				}
//
//			}
//			int temp = arr[i];
//			arr[i] = arr[max];
//			arr[max] = temp;
//		}
//		System.out.println("��� : " + Arrays.toString(arr));

		
		//���� ����
		for(int i = 0; i < arr.length -1; i++) {
			
			for(int j = 0; j < arr.length -1; j++) {
				//���� ����
				if (arr[j] < arr[j+1]) {
					
					//ġȯ��
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("��� : " + Arrays.toString(arr));
	}



//for (int k = 0; k < arr.length; k++) { // ������ ����
//	= rd.nextInt(100) + 1;
//	
//	// 2.
//	for (int j = 0; j < arr.length - 1; j++) {
//		
//		int max = j;
//		
//		for (int i = j + 1; i < arr.length; i++) {
//			if (arr[max] < arr[i]) {
//				max = i;
//			}
//		}
//		int temp = arr[k];
//		arr[k] = arr[max];
//		arr[max] = temp;
//	}
//	
//}
//
//System.out.println(Arrays.toString(arr));

	}


