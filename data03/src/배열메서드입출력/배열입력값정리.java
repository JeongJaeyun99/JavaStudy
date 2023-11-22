package 배열메서드입출력;

import java.util.Arrays;

import 배열기본.Print;

public class 배열입력값정리 {

	public static void main(String[] args) {
		int[] n = {11, 33, 55, 22, 66, 77, 88, 99};
		int sum = 0;
		for (int i = 0; i < n.length; i++) {
			sum += n[i];
		}
		double ans1 = (double)sum / n.length;
		Arrays.sort(n);
		int ans2 = n[0] + n[1] + n[2];
		int ans3 = 0;
		if(n.length % 2 == 0) {
			ans3 = n[n.length / 2] * n[n.length / 2 -1];
		}else {
			ans3 = n[n.length / 2] * 10;
		}
		System.out.println(ans1 + " " + ans2 + " " + ans3);
		Print.arr(n);
	}

}
