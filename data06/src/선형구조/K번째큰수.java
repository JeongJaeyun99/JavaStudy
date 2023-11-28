package 선형구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class K번째큰수 {

	public static void main(String[] args) {
		int k = 2;
		int arr[] = {22, 33, 66, 11, 10, 15};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		Collections.sort(list);
		System.out.println(list);
		Arrays.sort(arr);
		System.out.println(arr[k-1]);
	}

}
