package 배열응용;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import 배열기본.Print;

public class 배열정리문제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] jumsu = new int[10];
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = sc.nextInt();
		}
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		Arrays.sort(jumsu);
		int min = jumsu[0];
		int max = jumsu[jumsu.length-1];
		for (int i = 0; i < jumsu.length; i++) {
			if(jumsu[i] == min) {
				sb1.append(i + " ");
			}
			if(jumsu[i] == max) {
				sb2.append(i + " ");
			}
		}
		Print.arr(jumsu);
		System.out.println("최솟값 위치는 : " + sb1 + "\n최댓값 위치는 : " + sb2);
	}

}
