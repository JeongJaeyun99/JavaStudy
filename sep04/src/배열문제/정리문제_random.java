package 배열문제;

import java.util.Arrays;
import java.util.Random;

public class 정리문제_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[1000];
		Random r = new Random();
		int cnt3 = 0;
		int cnt4 = 0;
		int cnt5 = 0;
		int cnt6 = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(1000);
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 600) {
				cnt6++;
			}else if (arr[i] >= 500) {
				cnt5++;
			}else if (arr[i] >= 400) {
				cnt4++;
			}else if (arr[i] >= 300) {
				cnt3++;
			} 
		}
		System.out.println(cnt6);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0] + " , " + arr[arr.length-1]);
	}

}
