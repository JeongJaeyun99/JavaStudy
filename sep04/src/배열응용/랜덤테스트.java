package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 랜덤테스트 {

	public static void main(String[] args) {
		int data[] = new int[1000];
		Random r = new Random();
		for (int i = 0; i < 1000; i++) {
			data[i] = r.nextInt(100);
		}
		System.out.println(Arrays.toString(data));
	}

}
