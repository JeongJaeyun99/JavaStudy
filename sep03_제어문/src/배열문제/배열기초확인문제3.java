package 배열문제;

import java.util.Arrays;

public class 배열기초확인문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double arr[] = new double[300];
		arr[0] = 10.1;
		arr[1] = 20.2;
		arr[2] = 30.3;
		arr[arr.length-1] = 50.5;
		System.out.println(Arrays.toString(arr));
	}

}
