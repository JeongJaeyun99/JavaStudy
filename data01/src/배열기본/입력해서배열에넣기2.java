package 배열기본;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 입력해서배열에넣기2 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] num = new int[3];
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100);
		}
		System.out.println(Arrays.toString(num));
	}

}
