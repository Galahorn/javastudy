package mp3;

import java.util.ArrayList;

public class MusicPlayer {

	// C :controller : 사용자가 기능을 쓸수 있도록 연결해주는 역할

	// 최초로 노래가 담길 노래리스트를 만들기

	ArrayList<Music> musiclist = new ArrayList<>();

	// 음악에 플레이 순서를 변경할수 있는 변수 생성.
	int index = 0;

	// 메소드 하나 추가. 노래를 담아두기 위한

	// 노래를 추가할수 있는 MusicPlayer 생성자 메소드.
	public MusicPlayer() {

		musiclist.add(new Music("신호등", "이무진", 100));
		musiclist.add(new Music("Sweet Home", "카더가든", 230));
		musiclist.add(new Music("비가오니까", "원슈타인", 100));
		musiclist.add(new Music("Club", "Andrew Huang", 220));

	}

	// 재생 메소드 리턴값과 메소드 내용 수정
	public Music play() {
		// musiclist에 들어있는 1번째 곡 실행하기!
		return musiclist.get(index);

	}

	// 정지 메소드
	public void stop() {
		System.out.println("장비를 정지합니다.");

	}

	// 이전곡 재생
	public Music pre() {
		// 0 -> 3 -> 2 -> 1 -> 0
		if (index > 0) {
			index--;
		} else {
			index = musiclist.size() - 1; // -1을 붙이는 경우는 인덱스는 0부터 시작.

		}
		return musiclist.get(index);
	}

	// 다음곡
	public Music next() {
		if (index < musiclist.size() - 1) {
			index++;
		} else {
			index = 0;
		}

		return musiclist.get(index);

	}

	public void print(Music m) {

		System.out.println(m.getSongName() + ", " + m.getSinger() + ", " + m.getPlayTime() / 60 + "분 "
				+ m.getPlayTime() % 60 + "초");

	}
}
