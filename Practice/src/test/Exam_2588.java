package test;

import java.util.Scanner;

public class Exam_2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		String num2[] = sc.next().split("");
		int ans[] = new int[3];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = num1 * Integer.parseInt(num2[2-i]);
		}
		int sum = 0;
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
			if(i == 1) {
				ans[1] *= 10;
			}else if(i == 2) {
				ans[2] *= 100;
			}
			sum += ans[i];
		}
		System.out.println(sum);
		
		
	}

}
