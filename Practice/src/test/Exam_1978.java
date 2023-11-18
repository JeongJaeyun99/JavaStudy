package test;

import java.util.Scanner;

public class Exam_1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int[n];
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int cnt = 0;
			num[i] = sc.nextInt();
			for (int j = 1; j <= num[i]; j++) {
				if(num[i] % j == 0) {
					cnt++;
				}
				if(cnt > 2) {
					break;
				}
			}
			if(cnt == 2) {
				ans++;
			}
		}
		System.out.println(ans);
	}

}
