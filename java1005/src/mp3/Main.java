package mp3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// MusicPlayer 객체생성
		MusicPlayer mp3 = new MusicPlayer();

		// V : View : 사용자에게 보여지기 위한 기능을 가지고 있다.
		Music music = new Music();

		while (true) {
			System.out.print("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 : ");
			int num = sc.nextInt();

			if (num == 5) {
				System.out.println("플레이어를 종료합니다.");
				break;

			}

			else if (num == 1) {
				Music m = mp3.play();
				mp3.print(m);

			}

			else if (num == 2) {
				mp3.stop();
			}

			else if (num == 3) {
				Music m = mp3.pre();
				mp3.print(m);

			}

			else if (num == 4) {
				Music m = mp3.next();
				mp3.print(m);

			}

		}

	}

}
=======
package mp3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// MusicPlayer 객체생성
		MusicPlayer mp3 = new MusicPlayer();

		// V : View : 사용자에게 보여지기 위한 기능을 가지고 있다.
		Music music = new Music();

		while (true) {
			System.out.print("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 : ");
			int num = sc.nextInt();

			if (num == 5) {
				System.out.println("플레이어를 종료합니다.");
				break;

			}

			else if (num == 1) {
				Music m = mp3.play();
				mp3.print(m);

			}

			else if (num == 2) {
				mp3.stop();
			}

			else if (num == 3) {
				Music m = mp3.pre();
				mp3.print(m);

			}

			else if (num == 4) {
				Music m = mp3.next();
				mp3.print(m);

			}

		}

	}

}
