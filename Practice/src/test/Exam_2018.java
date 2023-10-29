package test;

import java.util.Scanner;

public class Exam_2018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 1;
		for (int i = 1; i < n; i++) {
			int temp = 0;
			for (int j = i; j < n; j++) {
				temp += j;
				if(temp == n) {
					cnt++;
					break;
				}else if(temp > n) {
					break;
				}
			} 
		}
		System.out.println(cnt);
	}

}
