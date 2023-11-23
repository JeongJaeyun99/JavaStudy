package 배열고급;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열입력배열반환_가변길이3 {

	public static void main(String[] args) {
		int[] n = { 44, 3, 22, 66, 88 };
		int find = 3;
		Solution6 s = new Solution6();
		int[] result = s.solution(n,find);
		System.out.println(Arrays.toString(result));
	}
}

class Solution6 {
	public int[] solution(int[] n, int find) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n.length; i++) {
			if(n[i] / find > 20) {
				list.add(n[i]);
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
		
	}
}