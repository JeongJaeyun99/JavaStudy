package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;

public class 문자열다루기기본 {

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		String s2 = "a234";
		boolean result = s.solution(s2);
		System.out.println(result);
	}
}

class Solution5 {
	public boolean solution(String x) {
		
		char[] c = x.toCharArray();
		boolean answer = false;
		for (int i = 0; i < c.length; i++) {
			if(c[i] < '0' || c[i] > '9') {
				answer = false;
			}
		}
		return answer;
	}
}