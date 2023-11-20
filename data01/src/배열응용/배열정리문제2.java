package 배열응용;

import java.util.Arrays;
import java.util.Scanner;

public class 배열정리문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] jumsu = new int[10];
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = sc.nextInt();
		}
		Arrays.sort(jumsu);
		int min = jumsu[0];
		int max = jumsu[jumsu.length-1];
		System.out.println("최솟값 : " + min + "\n최댓값 : " + max);
	}

}
