package preview03;

public class prob01�̿� {

	public static void main(String[] args) {
		// �� ���� ���� ���� ���� �迭�� ���϶�
		int[] a = { 92, 52, 32, 9, 81, 2, 68 }; //���� ������ �迭
		int[] index = new int[2];
		
		int min = Math.abs(a[0] - a[1]); //Math.abs = ���밪�� �������ִ� ��ɹ�
		for(int i = 0; i < a.length; i++) {//
			for(int j = i + 1; j < a.length; j++) { // +1�� ������ �״��� �迭�� ���� ������ϱ� ����  
				int b = Math.abs(a[i] - a[j]);
				if(min > b) {
					min = b;
					index[0]=i;
					index[1]=j;
					
				}//��������
			}//�������� ��
		}//�ܺ����� ��
		System.out.println("�� ���� ���� ���� ���� �ε����� ������ : " + "["+index[0]+", "+index[1]+"]");

	}

}
// ���� �������� �𸣰ڳ� ����....