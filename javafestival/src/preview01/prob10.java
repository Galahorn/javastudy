package preview01;

import java.util.Random;

public class prob10 {

	public static void main(String[] args) {

		Random rd = new Random();

		int[] arr = new int[8];

		for (int i = 0; i < arr.length; i++) {// �迭8���� ������ 8���� ���� �����ϱ����ؼ� ������ for��
			arr[i] = rd.nextInt(20) + 1;//������ 1~20������ 

			System.out.print(arr[i] + " ");// �迭�� �ο��� 8���� �������� ����ϱ����� -> ����� ���Դ��� Ȯ���ϱ����ؼ�.
		}
//////////////////////////////////////////////////////////////////
		int max = arr[0]; //���� ū���� �����ϱ� ���� ���� 
		int min = arr[0]; //���� ���� ���� �����ϱ� ���� ����
		for (int i = 0; i < arr.length; i++) { //�츮�� ��ü �迭�� ���ƴٴϸ鼭 �񱳰� ���������� ���ƴٴϰ� ���ִ� for��
			if (arr[i] > max) { // arr[i]�� ����� ���� max�� �������� ũ�ٸ� if�� �Ʒ��ִ� ������ �����ҰԿ�. �۴ٸ� ������Ұſ���.
				max = arr[i];// ���� if���� ���ǿ� �ش��ϴٸ� ���� �ִ� max���� ����� ���ڴ� ���������� max���� �Ǵ� arr[i]�� ���⿡ �����Ұſ���.�ٵ� ���۾��� �ݺ��� �ɰſ��� ��������?

			} else if (arr[i] < min) {//���࿡ arr[i] ���� min���� ������ �Ʒ��� �ִ� ������ �����ҰԿ�. ũ�ٸ� ������ ���Ұſ���.
				min = arr[i];//���� else if���� �ش��Ѵٸ� �����ִ� min ���� ����� ���ڴ� ���������� min���� �۾Ҵ� arr[i]�� ���⿡ �����Ұſ���. ��������? for���� ����������.

			}
		}
		System.out.println();
		System.out.println("���� ū �� : " + max);
		System.out.println("���� ���� �� : " + min);

	}

}