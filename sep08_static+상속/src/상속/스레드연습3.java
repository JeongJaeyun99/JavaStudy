package 상속;

public class 스레드연습3 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 5000; i++) {
			System.out.println("*");
		}
	}
}
