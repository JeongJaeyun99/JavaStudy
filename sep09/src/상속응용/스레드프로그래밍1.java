package 상속응용;

public class 스레드프로그래밍1 {

	public static void main(String[] args) {
		카운터스레드 c = new 카운터스레드();
		시각스레드 t = new 시각스레드();
		배열스레드 a = new 배열스레드();
		c.start();
		t.start();
		a.start();
	}

}
