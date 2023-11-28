package 선형구조_스택;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class 제일작은수제거하기3{

	public static void main(String[] args) {
		int[] n = { 4, 3, 2, 1, 5 }; //==> {4,3,2,5}
		Arrays.sort(n);
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < n.length; i++) {
			s.push(n[i]);
		}
		System.out.println(s);
		int answer[] = new int[s.size()-1];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = s.pop();
		}
		System.out.println(Arrays.toString(answer));
		System.out.println(s.peek());
	}

}