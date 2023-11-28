package 비선형구조;

import java.util.*;

public class K번째수 {

	public static void main(String[] args) {
		Solution10 s = new Solution10();
		int array[] = {1, 5, 2, 6, 3, 7, 4};
		int commands[][] = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int [] temp = s.solution(array, commands);
		System.out.println(Arrays.toString(temp));
	}
	
}
class Solution10 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			int start = commands[i][0];
			int end = commands[i][1];
			int select = commands[i][2];
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int j = start - 1; j <= end - 1; j++) {
				list.add(array[j]);
			}
			int arr[] = new int[list.size()];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = list.get(j);
			}
			Arrays.sort(arr);
			answer[i] = arr[select-1];
		}
		return answer;
	}
}
