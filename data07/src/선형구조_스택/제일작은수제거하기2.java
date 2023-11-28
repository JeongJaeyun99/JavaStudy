package 선형구조_스택;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 제일작은수제거하기2{

	public static void main(String[] args) {
		int[] n = { 4, 3, 2, 1, 5 }; //==> {4,3,2,5}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n.length; i++) {
			list.add(n[i]);
		}
		System.out.println(list);
		int min = Collections.min(list);
		System.out.println(min);
		
		list.remove(list.indexOf(min));
		
		int max = Collections.max(list);
		System.out.println(max);
		
		list.remove(list.indexOf(max));
		
		System.out.println(list);
		int[] answer = null;
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