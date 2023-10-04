package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 랜덤평균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();		
		int arr[] = new int[1000];
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			arr[i] = r.nextInt(100);
			sum += arr[i];
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("평균은 : " + (double)sum / arr.length);
	}

}
