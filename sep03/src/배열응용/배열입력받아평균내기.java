package 배열응용;

import java.util.Arrays;
import java.util.Scanner;

public class 배열입력받아평균내기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println(sum);
		System.out.println("평균은 : " + (double)sum / arr.length);
//		String list = Arrays.toString(arr);
//		System.out.println(list);
		
		System.out.println(Arrays.toString(arr));
	}

}
