package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		String s = "baabaa";
		int answer = 0;
		Stack<String> stack = new Stack<String>();
		String arr[] = s.split("");
		String t = "";
		for (int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			t += arr[i];
		}
		int i = 1;
		while(!stack.isEmpty()) {
			String temp = stack.get(stack.size()-i);
			i++;
			temp += stack.get(stack.size()-i);
			if(t.contains(temp)) {
				stack.pop();
				stack.pop();
			}
		}
		System.out.println(stack);
		System.out.println(answer);
	}
}