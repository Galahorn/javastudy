package mp3;

import java.util.ArrayList;

public class MusicPlayer {

	// C :controller : ����ڰ� ����� ���� �ֵ��� �������ִ� ����

	// ���ʷ� �뷡�� ��� �뷡����Ʈ�� �����

	ArrayList<Music> musiclist = new ArrayList<>();

	// ���ǿ� �÷��� ������ �����Ҽ� �ִ� ���� ����.
	int index = 0;

	// �޼ҵ� �ϳ� �߰�. �뷡�� ��Ƶα� ����

	// �뷡�� �߰��Ҽ� �ִ� MusicPlayer ������ �޼ҵ�.
	public MusicPlayer() {

		musiclist.add(new Music("��ȣ��", "�̹���", 100));
		musiclist.add(new Music("Sweet Home", "ī������", 230));
		musiclist.add(new Music("�񰡿��ϱ�", "����Ÿ��", 100));
		musiclist.add(new Music("Club", "Andrew Huang", 220));

	}

	// ��� �޼ҵ� ���ϰ��� �޼ҵ� ���� ����
	public Music play() {
		// musiclist�� ����ִ� 1��° �� �����ϱ�!
		return musiclist.get(index);

	}

	// ���� �޼ҵ�
	public void stop() {
		System.out.println("��� �����մϴ�.");

	}

	// ������ ���
	public Music pre() {
		// 0 -> 3 -> 2 -> 1 -> 0
		if (index > 0) {
			index--;
		} else {
			index = musiclist.size() - 1; // -1�� ���̴� ���� �ε����� 0���� ����.

		}
		return musiclist.get(index);
	}

	// ������
	public Music next() {
		if (index < musiclist.size() - 1) {
			index++;
		} else {
			index = 0;
		}

		return musiclist.get(index);

	}

	public void print(Music m) {

		System.out.println(m.getSongName() + ", " + m.getSinger() + ", " + m.getPlayTime() / 60 + "�� "
				+ m.getPlayTime() % 60 + "��");

	}
}
