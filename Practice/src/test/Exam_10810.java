package test;

import java.util.Scanner;

public class Exam_10810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt(); // a부터
			int b = sc.nextInt(); // b번 인덱스까지
			int c = sc.nextInt(); // c라는 숫자로 채운다.
			for (int j = a-1; j <= b-1; j++) {
				arr[j] = c;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
