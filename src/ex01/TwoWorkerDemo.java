package ex01;

public class TwoWorkerDemo {

	public static void main(String[] args) {
		
		// 첫번째 작업흐름 객체 생성
		NumberWorker2 numberWork2 = new NumberWorker2();
		// 두번째 작업흐름 객체 생성
		TextWorker2   textWork2   = new TextWorker2();
		// 두 작업흐름이 실행되었나요 ? 
		// 객체가 생성될때 자동호출되는 생성자만 유일 자동실행,
		// 내가 run()을 불러야한다. 이것은 권장하지 않습니다.
		// 그래서 위임 start()
		
		
		numberWork2.start(); // start => run을 대신 실행
		textWork2.start();
		
		// 작업흐름은 현재 3개 = 메인 + numwork + textwork
	}
}
class NumberWorker2 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("숫자: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("숫자 작업 중단");
				return;
			}
		}
	}
}
class TextWorker2 extends Thread {
	public void run() {
		for (int j = 1; j <= 5; j++) {
			System.out.println("문자: 안녕하세요");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("작업 일시 중단");
				return;
			}
		}
	}
}
