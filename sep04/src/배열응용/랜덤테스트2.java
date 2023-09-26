package 배열응용;

import java.util.Random;

public class 랜덤테스트2 {

	public static void main(String[] args) {
		
		Random r = new Random();
		for (int i = 0; i < 1000; i++) {
			int data = r.nextInt(100);
			System.out.println(data);
		}
	}

}
