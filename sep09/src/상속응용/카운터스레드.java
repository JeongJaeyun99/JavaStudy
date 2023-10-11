package 상속응용;

public class 카운터스레드 extends Thread {
	@Override
	public void run() {
		for (int i = 500; i >= 0; i--) {
			System.out.println("카운터>> " + i);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) { // 중단
				e.printStackTrace(); // 어떤 에러인지 프린트
			}

		}
	}
}
