package test;

import java.util.Scanner;

public class Exam_1010 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		int n = 1;
		int m = 0;
		int col = 1;
		int count = 0;
			while (index > count) {
				if(col%2 != 0) {
					n--;
					m++;
					count++;
					if(n <= 0) {
						n++;
						col++;
					}
				}else if(col%2 == 0) {
					n++;
					m--;
					count++;
					if(m <= 0) {
						m++;
						col++;
					}
				}
			}
		System.out.println(m+"/"+n);
	}
}
