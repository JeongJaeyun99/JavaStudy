package test;

import java.util.Scanner;

public class Exam_25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int type = sc.nextInt();
		int money[] = new int[type];
		int cnt[] = new int[type];
		int sum = 0;
		for (int i = 0; i < type; i++) {
			money[i] = sc.nextInt();
			cnt[i] = sc.nextInt();
			sum += money[i] * cnt[i];
		}
		if (total == sum) {
			System.out.println("Yes");			
		}else {
			System.out.println("No");		
		}
	}

}
