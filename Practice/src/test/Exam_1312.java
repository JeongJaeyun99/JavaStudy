package test;

import java.util.Scanner;

public class Exam_1312 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = a % b;
		int temp = 1;
		while (true) {
			d *= 10;
			if(temp == c) {
				d /= b;
				break;
			}else {
				temp++;
				d %=b;
			}
		}
		System.out.println(d);
		
	}

}
