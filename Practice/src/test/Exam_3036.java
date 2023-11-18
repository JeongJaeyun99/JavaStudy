package test;

import java.util.Scanner;

public class Exam_3036 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int circle[] = new int[num];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < circle.length; i++) {
			circle[i] = sc.nextInt();
		}
		for (int i = 1; i < circle.length; i++) {
			if(circle[0] % circle[i] != 0) {
				int a = circle[0];
				int b = circle[i];
				a = a(a,b);
				sb.append(circle[0] / a + "/" + circle[i] / a).append("\n");
			}else {
				sb.append(circle[0] / circle[i] + "/" + 1).append("\n");
			}
		}
		System.out.println(sb);
	}
	public static int a(int a, int b) {
		int temp;
		while (b != 0) {
		    temp = b;
		    b = a % b;
		    a = temp;
		}
		return a;
	}

}
