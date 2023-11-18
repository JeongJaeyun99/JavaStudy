package test;

import java.util.Scanner;

public class Exam_3135 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int cnt =  Math.abs(a-b);
		for (int i = 0; i < arr.length; i++) {
			if(b == arr[i]) {
				cnt = 1;
				break;
			}
			if(cnt > Math.abs(b-arr[i])+1 ) {
				cnt = Math.abs(b-arr[i])+1;
			}
		}
		System.out.println(cnt);
    }
}
