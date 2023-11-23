package 배열고급;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 배열뒤집기2 {

	public static void main(String[] args) {
		Solution08 s = new Solution08();
		int[] num_list = { 1, 2, 3, 4, 5, 33, 22, 55, 11 };
		int[] result = s.solution(num_list);
		System.out.println(Arrays.toString(result));
	}
}

class Solution08 {
	public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length];
		Arrays.sort(num_list);
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num_list[num_list.length-1-i];
		}
		return answer;
	}
	
}