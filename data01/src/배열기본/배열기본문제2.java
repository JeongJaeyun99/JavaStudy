package 배열기본;

import java.util.Random;
import java.util.Scanner;

public class 배열기본문제2 {
	public static void main(String[] args) {
		int arr[] = new int[20];
		int max = Integer.MIN_VALUE;
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(900);
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
