package 선형구조_스택;

import java.util.Arrays;
import java.util.Stack;

public class 같은숫자는싫어_stack {
	public static void main(String[] args) {
		int[] n = { 1, 1, 3, 3, 0, 1, 1 };
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(n[0]);
		
		for (int i = 1; i < n.length; i++) {
			if(stack.peek() != n[i]) {
				stack.push(n[i]);
			}
		}
		int answer[] = new int[stack.size()];
		for (int i = answer.length-1; i >-1 ; i--) {
			answer[i] = stack.pop();
		}
		System.out.println(Arrays.toString(answer));
	}
}