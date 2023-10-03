package test;

import java.util.Scanner;

public class Exam_9086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String word[] = new String[T];
		for (int i = 0; i < T; i++) {
			String temp[] = sc.next().split("");
			word[i] = temp[0] + temp[temp.length-1];
		}
		for (int i = 0; i < word.length; i++) {
			System.out.println(word[i]);
		}
	}
}
