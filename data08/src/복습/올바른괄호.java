package 복습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class 올바른괄호 {

	public static void main(String[] args) {
		Solution0 s = new Solution0();
		String s2 = "((())";
		Boolean result = s.solution(s2);
		System.out.println(result);
	}
}

class Solution0 {
    boolean solution(String s) {
        boolean answer = false;
        Stack<Character> stack = new Stack<Character>();
        try {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(') {
					stack.push('(');
				} else {
					stack.pop();
				}
			}
			answer = stack.empty();
		} catch (Exception e) {
			answer = false;
		}
		return answer;
    }
}