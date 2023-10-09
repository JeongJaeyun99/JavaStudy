package test;

import java.util.Scanner;

public class Exam_10813 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		int temp = 0;
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt()-1; // a부터
			int b = sc.nextInt()-1; // b번 인덱스까지
			temp = arr[b];
			arr[b] = arr[a];
			arr[a] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
