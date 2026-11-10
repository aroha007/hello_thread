package ex01;

public class PauseHello {

	public static void main(String[] args) throws InterruptedException   {
			System.out.println("안녕하세요");
		// 잠시동안 0.5초 쉬어감
			Thread.sleep(10000);
			// 다시 만났어요
			String hi = "다시 만났어요";
			System.out.println(hi);
	}

}
