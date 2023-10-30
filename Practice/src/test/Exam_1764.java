package test;

import java.util.Scanner;

public class Exam_1764 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int start = 0;
		while(true){
			int sum = 0;
			for (int i = start; i < arr.length; i++) {
				sum += arr[i];
				if(sum == m) {
					cnt++;
					break;
				}else if(sum > m) {
					break;
				}
				
			}
			start++;
			if(start == arr.length) {
				break;
			}
		}
		System.out.println(cnt);
	}

}
