package Preview01;

import java.util.Scanner;

public class prob02 {

	public static void main(String[] args) {
		//8�ð� �ñ޹���  8�ð� �ʰ��� �ʰ����� 1.5��
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ð��� �Է��Ͻÿ�. >> ");
		int time = sc.nextInt();
		int result = 0;
		
		if(time > 8) {
			result = (8*5000) + (time-8)*7500;
		}else {
			result = time*5000;
		}
		System.out.print("�� �ӱ��� " + result + "�Դϴ�.");

	}

}
