package test;

import java.util.Arrays;
import java.util.Scanner;

public class Exam_1475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = sc.next().split("");
		int arr2[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(Integer.parseInt(arr[i]) == j) {
					arr2[j]++;
					break;
				}
			}
		}
		if((arr2[9] + arr2[6]) % 2 == 0) {
			if(arr2[9] > arr2[6]) {
				arr2[9] = ((arr2[9] + arr2[6]) / 2);
				arr2[6] = 0;
			}else if(arr2[9] < arr2[6]){
				arr2[6] = ((arr2[9] + arr2[6]) / 2);
				arr2[9] = 0;
			}
		}else {
			if(arr2[9] > arr2[6]) {
				arr2[9] = ((arr2[9] + arr2[6]) / 2) + 1;
				arr2[6] = 0;
			}else if(arr2[9] < arr2[6]){
				arr2[6] = ((arr2[9] + arr2[6]) / 2) + 1;
				arr2[9] = 0;
			}
		}
		Arrays.sort(arr2);
		System.out.println(arr2[arr2.length-1]);
	}

}
