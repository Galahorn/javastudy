package preview01;

import java.util.Scanner;

public class prob14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է¹��� ���� : ");
		
		int num = sc.nextInt();//�Է¿� ����
		String result = "";//����� ���� ���ڿ���
		
		for(int i = num; i > 0; i/=2) { //�츮�� �Է¹��� ���ڰ� i�� ���� i�� 0���� Ŭ�� �����ִ� i���� i������ 2�� �ɰž� �ٵ� �̰� �ݺ��Ұž� i�� 0�� �ɶ�����.
			result = String.valueOf(i%2) + result;
		}
		System.out.println(result + " ");
		
		
		
		

	}

}
 