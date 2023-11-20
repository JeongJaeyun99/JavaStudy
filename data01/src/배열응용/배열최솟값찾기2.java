package 배열응용;

import java.util.Random;

import 배열기본.Print;

public class 배열최솟값찾기2 {

	public static void main(String[] args) {
		int[] n = new int[1000];
		int max = n[0];
		Random r = new Random();
		for (int i = 0; i < n.length; i++) {
			n[i] = r.nextInt(1000);
			if(n[i] > max) {
				max = n[i];
			}
		}
		System.out.println(max);
		Print.arr(n);
	}

}
