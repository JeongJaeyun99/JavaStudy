package test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int cnt = 0;
		
		int temp1 = Math.abs(a-b);
		for (int i = 0; i < arr.length; i++) {
			if(b == arr[i]) {
				temp1 = 1;
				break;
			}
			if(temp1 > Math.abs(b-arr[i])+1 ) {
				temp1 = Math.abs(b-arr[i])+1;
			}
		}
		System.out.println(temp1);
    }
}