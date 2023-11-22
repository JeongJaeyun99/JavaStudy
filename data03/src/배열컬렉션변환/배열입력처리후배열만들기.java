package 배열컬렉션변환;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열입력처리후배열만들기 {

	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 3 == 0) {
				list.add(arr[i]);
			}
		}
		int answer[] = new int[list.size()];
		System.out.println(list);
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		System.out.println(Arrays.toString(answer));
		
	}

}
