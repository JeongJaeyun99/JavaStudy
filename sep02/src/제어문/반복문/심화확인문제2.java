package 제어문.반복문;

import java.util.Scanner;

public class 심화확인문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int jump = sc.nextInt();
		int sum = 0;
		int preSum = 0;
		for (int i = start; i <= end; i += jump) {
			sum += i;
			if(sum > 100) {
				preSum = sum;
				break;
			}
		}
		System.out.println("100을 넘긴값" + sum);
		System.out.println("100을 넘기기 전값" + preSum);
	}

}
