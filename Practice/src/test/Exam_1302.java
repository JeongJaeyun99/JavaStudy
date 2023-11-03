package test;

import java.util.Arrays;
import java.util.Scanner;

public class Exam_1302 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int books = sc.nextInt();
		String arr[] = new String[books];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		Arrays.sort(arr);
		String s = "";
		for (int i = 0; i < arr.length; i++) {
			int cnt = 0;
			for (int j = i; j < arr.length; j++) {
				if(arr[i].equals(arr[j])) {
					cnt++;
				}
			}
			s += cnt + " ";				
		}
		String arr2[] = s.split(" ");
		int max = Integer.MIN_VALUE;
		int idx = 0;
		for (int i = 0; i < arr2.length; i++) {
			if(max < Integer.parseInt(arr2[i])) {
				max = Integer.parseInt(arr2[i]);
				idx = i;
			}
		}
		System.out.println(arr[idx]);
	}

}
