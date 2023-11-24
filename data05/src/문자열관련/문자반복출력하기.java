package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;

public class 문자반복출력하기 {

	public static void main(String[] args) {
		Solution9 s = new Solution9();
		String n = "hello";
		int k = 3;
		String result = s.solution(n, k);
		System.out.println(result);
	}
}

class Solution9 {
	public String solution(String n, int k) {
		//String --> array, list
		char[] c = n.toCharArray();
		String answer = "";
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < k; j++) {
				answer = answer + c[i];
			}
		}
		return answer;
	}
}
