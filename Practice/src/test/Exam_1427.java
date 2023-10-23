package test;

import java.util.Arrays;
import java.util.Scanner;

public class Exam_1427 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String arr[] = sc.next().split("");
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length-1; i > -1; i--) {
			sb.append(arr[i]);
		}
		System.out.println(sb);
	}

}
