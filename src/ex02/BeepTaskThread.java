package ex02;

import java.awt.Toolkit;

// Runnable 인터페이스를 이용한
//  쓰레드 클래스 만들기
class ShowTask implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("탕");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("출력 작업이 중단되었어요.");
				return;
			}
		}
	}
}                 
// 삑 소리를 내는 작업 내용          
class BeepTask implements Runnable {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("소리 작업이 중단되었어요.");
				return;
			}
		}
	}
}

public class BeepTaskThread {

	public static void main(String[] args) {
		// Runnable 부모가 가진 형식으로 형식 변환
		// 부모가 가진 능력만 쓸 수 있음
		// Runnable 은 run() 메소드만 가지고 있으므로
		// run() 메소드만 호출 가능
		// 1. ShowTask 객체생성하여 부모형식으로 고침
		// 2. 관례상 run()는 직접호출 금지.
		//    그래서 start() 필요, 그런데 Runnable 은 start() 할수가 없음
		// 3. 단짝친구 Thread 의 start() 이용
		Runnable task1 = new ShowTask();
		Thread thread1 = new Thread(task1);
		thread1.start();
		
		Runnable task2 = new BeepTask();
		Thread thread2 = new Thread(task2);
		thread2.start();
	}
}
