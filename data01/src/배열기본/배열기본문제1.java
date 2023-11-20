package 배열기본;

import java.util.Scanner;

public class 배열기본문제1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}
