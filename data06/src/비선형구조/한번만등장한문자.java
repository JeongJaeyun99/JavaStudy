package 비선형구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class 한번만등장한문자 {

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		String s2 = "abcabcadc";
		String result = s.solution(s2);
		System.out.println(result);
	}
}

class Solution3 {
	public String solution(String s2) {
		String answer = "";
		ArrayList<String> list = new ArrayList<String>();
		String arr[] = s2.split("");
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < list.size(); i++) {
			set.add(list.get(i));
		}
		System.out.println(set);
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String s = it.next();
			if(Collections.frequency(list, s) == 1) {
				answer += s;
			}
		}
//		Iterator<String> it = list.iterator();
//		while(it.hasNext()) {
//			String aaa = it.next();
//			if(Collections.frequency(list, aaa) == 1) {
//				answer += aaa;
//			}
//		}
		return answer;
	}
}