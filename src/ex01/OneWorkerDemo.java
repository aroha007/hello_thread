package ex01;

public class OneWorkerDemo {

	public static void main(String[] args) throws InterruptedException {
		// main()에서 작업해보자
		for (int j = 1; j <= 5; j++) {
			System.out.println("안녕하세요");
			Thread.sleep(3000);
		}
		// 1. NumberWorker 객체를 만듬
		// 2. 이 객체의 처리흐름을 시작
		NumberWorker worker = new NumberWorker();
		// 3. Threads는 두가지 아주 중요한 기본 함수가 있다.
		// 3-1. 쓰레드에게 실제흐름을 만들어라
		// worker.start(); : worker의 run() 실행
		// 3-2. 흐름을 만들어 일해라
		// 실제 새로운 흐름(Thread)에서 처리할 내용(명령들)
		// 이것은 실제로 단독으로 부르지 않음
		// start()를 사용
		worker.start();  // 내부적으로 worker의 run()
						 // 자동호출
		for (int j = 1; j <= 5; j++) {
			System.out.println("메인흐름 마지막");
			Thread.sleep(1000);
		}
		
	}
}

// NumberWorker 클래스 정의

// 1. 독자적 흐름을 만든다(작업 Thread를 만듬)
// 2. 숫자를 5번 독자적으로 출력
class NumberWorker extends Thread {
	public void run() {
		for (int i = 1; i <=100; i++) {
			System.out.println("숫자: " + i);
			
		}
	}
}



