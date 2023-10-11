package 상속응용;

public class 배열스레드 extends Thread {
	@Override
	public void run() {
		String img[] = {"30days.png","boston.png","creater.png","girl.png","spider.png"};
		for (int i = 0; i < img.length; i++) {
			System.out.println("이미지>> " + img[i]);
			try {
				Thread.sleep(5000); // ms
			} catch (InterruptedException e) { // 중단
				e.printStackTrace(); // 어떤 에러인지 프린트
			}
			if (i == 4) {
				i = 0;
			}
		}
	}
}
