package 비선형구조;

import java.util.ArrayList;
import java.util.Collections;

public class Collections주요함수 {

	public static void main(String[] args) {
		int[]s  = {3,5,4,7,8,9,12,45,78,6,9,64};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < s.length; i++) {
			list.add(s[i]);
		}
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));
		System.out.println(Collections.frequency(list, 9));
		System.out.println(list.contains(6));
		System.out.println(list.indexOf(6));
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);;
	}

}
