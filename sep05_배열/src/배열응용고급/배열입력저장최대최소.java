package 배열응용고급;

import java.util.Arrays;
import java.util.Scanner;

public class 배열입력저장최대최소 {
	public static void main(String[] args) {
		// 입력
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자를 입력>> ");
			arr[i] = sc.nextInt();
		}
		// 처리
//		int min = Integer.MAX_VALUE;
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i] < min) {
//				min = arr[i];
//			}
//		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int min = arr[0];
		int max = arr[arr.length-1]; 
		// 출력
		System.out.println(min + " , " + max);
	}
}
