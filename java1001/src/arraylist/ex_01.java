package arraylist;

import java.util.ArrayList;

public class ex_01 {

	public static void main(String[] args) {

		// ArrayList << ũ�Ⱑ ���������� �����. ��������Ʈ
		// Ư¡
		// �Ϲ����� �迭�� ���� �������� ����Ʈ�̴�.
		// �ε����� ����Ͽ� ������ �����͸� �����Ѵ�.
		// ũ�⸦ �������� �ʾƵ� ���ϴ� ��ŭ �����͸� ���� ���ִ�.

		// ArrayList�� ����
		// ArratList<��������Ʈ�� Ÿ�� (��ü Ÿ��)> ������ = new ArrayList<��üŸ��>();
		// <> = ���׸�

		ArrayList<String> names = new ArrayList<>();

		// 2. ������ �߰��ϱ�.
		// �Լ��� ����� ������� �ϳ��� �����Ͱ� ����ȴ�.
		// 10�������� �⺻���� �����Ĵ� �߰��� ���ִ� ����. ������ ���� ������ �ʴ´�.
		names.add("���Գ�");
		names.add("�ּ���");
		names.add("�Ӹ���");
		names.add(1, "ä����");

		// 3. ������Ȯ���ϱ� -> .get(�ε���);
		// for������
//		System.out.println(names.get(0));
//		System.out.println(names.get(1));
//		System.out.println(names.get(2));
//		System.out.println(names.get(3));
		// 4. ������ �����ϱ�. -> .remove(�ε��� ��ȣ);

		names.remove(0);
		System.out.println();

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));

		}

	}
}
