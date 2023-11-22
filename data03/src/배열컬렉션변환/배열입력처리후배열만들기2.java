package 배열컬렉션변환;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열입력처리후배열만들기2 {

	public static void main(String[] args) {
		int[] arr = { 110, 22, 330, 440, 55, 660, 77, 880, 99 };
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 10 == 0) {
				list.add(arr[i]);
			}
		}
		System.out.println(list.size());
		int answer[] = null;
		if(list.size() == 0) {
			answer = new int[1];
			answer[0] = -1;
		}else {
			answer = new int[list.size()];
			for (int i = 0; i < answer.length; i++) {
				answer[i] = list.get(i);
			}				
		}
		System.out.println(Arrays.toString(answer));
	}

}
