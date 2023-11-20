package 배열응용;

import 배열기본.Print;

public class 배열최솟값찾기 {

	public static void main(String[] args) {
		int[] n = {90, 80, 20, 60 ,70};
		int min = Integer.MAX_VALUE;
		for (int x : n) {
			if(x < min) {
				min = x;
			}
		}
		System.out.println(min);
		Print.arr(n);
	}

}
