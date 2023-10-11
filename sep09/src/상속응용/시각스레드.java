package 상속응용;

import java.util.Date;

public class 시각스레드 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			Date d = new Date();
			System.out.println("현재 : " + d);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) { // 중단
				e.printStackTrace(); // 어떤 에러인지 프린트
			}
		}
	}
}
