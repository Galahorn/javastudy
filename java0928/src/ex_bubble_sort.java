import java.util.Arrays;

public class ex_bubble_sort {

	public static void main(String[] args) {
		// ���õ� �迭�̱����ƾ�!!! ���� �˰����̷��� >> ���ҵ��� ������ ������� �����ϴ� �˰���
				// Bubble sort > �� ������ ���Ҹ� ���ؼ� �����ϴ� ��� �ӵ��� �������� �ڵ尡 �ܼ��ϴ�.
				// ó������ ������ �ѽ���Ŭ �Ϻ��ϰ� �������� ������ �Ϸ��ϴ� ���� �������̶�� �Ѵ�. �ι�°�� ������
				// �鿩����� ctr�� + a ���� ctrl + shift + f
				// ���̴� ������ ������ �������� ��԰���. ������ �˾ƾ��Ұ� �����Ұžƴ�
		
		int [] arr = { 45, 7, 12, 82, 25, 3 };
		
		// �����ϴ� ���� �̹� ������ Ƚ���� ���� for��~
				// 1step -> [0],[1] [1],[2] [2],[3] [3],[4]
				// 2step -> [0],[1] [1],[2] [2],[3]
				// 3step -> [0],[1] [1],[2]
				// 4step -> [0],[1]
		for(int j = 0; j < arr.length-1; j++) {
			for(int i = 0; i < arr.length-1; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
				System.out.println(Arrays.toString(arr));
				
				
			}
			
		}

	}

}
