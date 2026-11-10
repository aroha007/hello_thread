package ex01;

import java.awt.Toolkit;

public class BeepTaskTest {

	public static void main(String[] args) throws InterruptedException {
		// 첫번째 작업 : '탕'을 5번 출력합니다.

		for (int i = 1; i <= 5; i++) {

			System.out.println("탕");
			Thread.sleep(500);
		}
		// 두번째 작업 : 삑 소리를 5번 냅니다.
		// 자바 확장라이브러리를 이용하여 삑소리 출력
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		for (int i = 1; i <= 5; i++) {

			toolkit.beep();
			System.out.println("삑");
			Thread.sleep(500);

		}
	}

}
