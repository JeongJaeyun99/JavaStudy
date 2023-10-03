package test;

import java.util.Scanner;

public class Exam_27866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word[] = sc.next().split("");
		int num = sc.nextInt();
		System.out.println(word[num-1]);
	}

}
