package Preview01;

public class prob03 {

	public static void main(String[] args) {
		// 1~100������ �� ¦���� ���� Ȧ���� ����� ����� ��ü �ձ��ϱ� 
		
		int result1 = 0; //�ؿ��� ���� ������ ��� ���� ���� ���� �����ϴ� ����
		int result2 = 0; //�ؿ��� ���� ����� ��� ���� ���� ���� �����ϴ� ����
		int sum = 0; //���� �� ���� ���� ���� ������ ���� ����
	
		
		for(int i = 1; i <= 100; i++) { //1���� 100������ �ݺ��� ����
			
			if(i%2 == 0) { //���� i���� ¦���϶�
				result1 += (i*(-1)); //�ݺ����� ���������� ���� ������ ��� ���� ���ϴ� ��
				System.out.print(i*(-1) + " ");//������ ���� ���
				
			}else if(i%2 == 1) { //i���� Ȧ���϶�
				result2 += (i); //�ݺ����� ���������� ���� ����� ��� ���� ���ϴ� ��
				System.out.print(i + " ");//��� �״�� ���
				
			}
		}
		sum = result2 + result1;
		System.out.println();
		System.out.println("��� >> " + sum);
	
	 

	}

}
