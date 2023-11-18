package test;

import java.util.Scanner;

public class Exam_2057 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long arr[] = new long[21];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = fact(i);
		}
		if(n == 0) {
			System.out.println("NO");
			System.exit(0);
		}
		for (int i = 20; i >= 0; i--) {
			if(n >= arr[i]) {
				n -= arr[i];
			}
		}
		if(n == 0) {
			System.out.println("YES");
			System.exit(0);
		}else {
			System.out.println("NO");
			System.exit(0);
		}
	}
	public static long fact(long i) {
		if(i > 1) {
			return i*fact(i-1);			
		}
		return 1;
	}

}
