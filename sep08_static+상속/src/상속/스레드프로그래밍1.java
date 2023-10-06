package 상속;

public class 스레드프로그래밍1 {

	public static void main(String[] args) {

		별 t1 = new 별();
		골뱅이스레드 t2 = new 골뱅이스레드();
		
		t1.start();
		t2.start();
	}

}
