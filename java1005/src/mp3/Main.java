package mp3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// MusicPlayer ��ü����
		MusicPlayer mp3 = new MusicPlayer();

		// V : View : ����ڿ��� �������� ���� ����� ������ �ִ�.
		Music music = new Music();

		while (true) {
			System.out.print("[1]��� [2]���� [3]������ [4]������ [5]���� : ");
			int num = sc.nextInt();

			if (num == 5) {
				System.out.println("�÷��̾ �����մϴ�.");
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

		// MusicPlayer ��ü����
		MusicPlayer mp3 = new MusicPlayer();

		// V : View : ����ڿ��� �������� ���� ����� ������ �ִ�.
		Music music = new Music();

		while (true) {
			System.out.print("[1]��� [2]���� [3]������ [4]������ [5]���� : ");
			int num = sc.nextInt();

			if (num == 5) {
				System.out.println("�÷��̾ �����մϴ�.");
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
