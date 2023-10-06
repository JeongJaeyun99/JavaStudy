package 상속;

public class 골뱅이스레드 extends Thread{
	// run()은 동시에 처리하고 싶은 코드 넣어주면됨
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("@");
		}
	}
}
