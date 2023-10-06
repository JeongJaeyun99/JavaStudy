package 상속;

public class 스레드프로그래밍3 {

	public static void main(String[] args) {
		스레드연습3 t3 = new 스레드연습3();
		스레드연습4 t4 = new 스레드연습4();
		
		t3.start();
		t4.start();
	}

}
