package test;

import java.util.Scanner;

public class Exam_11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int arr[] = new int[T];
		String arrA[] = new String[T];
		String arrB[] = new String[T];
		for (int i = 0; i < T; i++) {
			arrA[i] = sc.next();
			arrB[i] = sc.next();
			arr[i] = Integer.parseInt(arrA[i]) + Integer.parseInt(arrB[i]);
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println("Case #" + (j+1) + ": " + arrA[j] + " + " + arrB[j] + " = " + arr[j]);			
		}
	}

}
