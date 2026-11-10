package ex02;

import java.awt.Toolkit;

class Test1 implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("숫자: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("작업 중단");
				return;
			}
		}
	}
}

class Test2 implements Runnable {
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 1; i <= 10; i++) {
			toolkit.beep();
			System.out.println("삑");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("작업 중단");
				return;
			}
		}
	}
}

public class Practice {

	public static void main(String[] args) {
		Runnable t1 = new Test1();
		Thread th1 = new Thread(t1);
		th1.start();
		
		Runnable t2 = new Test2();
		Thread th2 = new Thread(t2);
		th2.start();

	}

}
