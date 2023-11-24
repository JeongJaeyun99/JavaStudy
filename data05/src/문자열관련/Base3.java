package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;


public class Base3 {

	public static void main(String[] args) {
		Solution10 s = new Solution10();
		String result = s.solution("abcabcadc");
		System.out.println(result);
	}
}

class Solution10 {
	public String solution(String s) {
		String arr[] = s.split("");
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		Object temp[] = set.toArray();
		Arrays.sort(temp);
		List<String> list = Arrays.asList(arr);
		String answer = "";
		for (Object a : temp) {
			String b = (String)a;
			if(Collections.frequency(list, b)==1) {
				answer += b;
			}
		}
		return answer;
	}
}