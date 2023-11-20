package test;

import java.util.*;

public class Exam_1758 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt();
		Integer tip[] = new Integer[people];
		long sum = 0;
		for (int i = 0; i < tip.length; i++) {
			tip[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(tip,Collections.reverseOrder());
		for (int i = 0; i < tip.length; i++) {
			if(tip[i] - i > 0) {
				sum += tip[i] - i;
			}
		}
		System.out.println(sum);
	}

}
