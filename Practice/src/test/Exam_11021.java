package test;

import java.util.Scanner;

public class Exam_11021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int arr[] = new int[T];
		for (int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = a+b;
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println("Case #" + (j+1) + ": " + arr[j]);			
		}
	}

}