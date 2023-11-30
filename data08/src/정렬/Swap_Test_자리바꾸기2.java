package 정렬;

import java.util.Arrays;

public class Swap_Test_자리바꾸기2 {

	public static void main(String[] args) {
		int num[] = {6,1,2,3,5,9};
		System.out.println(Arrays.toString(num));
		swap(num);
	}
	public static void swap(int num[]) {
		for (int i = 0; i < num.length/2; i++) {
			int temp = num[i];
			num[i] = num[num.length-1-i];
			num[num.length-1-i] = temp;
		}
		print(num);
	}
	public static void print(int num[]) {
		System.out.println(Arrays.toString(num));		
	}
}
