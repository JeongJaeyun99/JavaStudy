package 상속;

public class 스레드연습1 extends Thread{
	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println("증가 " + i);
		}
	}
}
