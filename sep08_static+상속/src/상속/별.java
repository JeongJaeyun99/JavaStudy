package 상속;

public class 별 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("*");
		}
	}
}
