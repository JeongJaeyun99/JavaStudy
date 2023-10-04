package 배열문제;

import java.util.Arrays;

public class 배열기초확인문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[200];
		arr[0] = 1000;
		arr[1] = 2000;
		arr[2] = 3000;
		arr[arr.length-1] = 5000;
		System.out.println(Arrays.toString(arr));
	}

}
