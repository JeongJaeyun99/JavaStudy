package 상속;

public class 스레드연습2 extends Thread{
	@Override
	public void run() {
		for (int i = 1000; i >= 1; i--) {
			System.out.println("감소 " + i);
		}
	}
}
