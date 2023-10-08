package test;

import java.util.Scanner;

public class Exam_10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int arr[] = new int[t];
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int num = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				cnt++;
			}
		}
		
		
		System.out.println(cnt);
	}

}
