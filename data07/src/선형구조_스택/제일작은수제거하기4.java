package 선형구조_스택;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class 제일작은수제거하기4{

	public static void main(String[] args) {
		int[] n = {500,400,200,300,900}; //==> {4,3,2,5}
		int[] n2 = n.clone();
		Arrays.sort(n);
		Arrays.sort(n2);
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < n.length; i++) {
			stack.push(n[i]);
		}
		int answer[] = new int[stack.size()-1];
	}

}