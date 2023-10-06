package 상속;

public class 스레드프로그래밍2 {

	public static void main(String[] args) {
		스레드연습1 t1 = new 스레드연습1();
		스레드연습2 t2 = new 스레드연습2();
		
		t1.start();
		t2.start();
	}

}
