package test;

import java.util.Scanner;

public class Exam_25314 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		num /= 4;
		String ans = "";
		for (int i = 0; i < num; i++) {
			ans += "long ";
		}
		System.out.println(ans + "int");
	}

}
