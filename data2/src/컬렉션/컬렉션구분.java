package 컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import 배열기본.Print;

public class 컬렉션구분 {

	public static void main(String[] args) {
		HashSet bag = new HashSet();
		bag.add("휴지");
		bag.add(1000);
		System.out.println(bag);
		
		ArrayList list = new ArrayList();
		list.add("코딩수업");
		list.add(2);
		System.out.println(list);
		
		String s = (String)list.get(0);
		int time = (int)list.get(1);
		System.out.println(s);
		System.out.println(time + 1);
		System.out.println(list.contains("코딩수업"));
		System.out.println(list.indexOf(2));
		
		Object arr[] = list.toArray();
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		HashMap<Integer, String> tel = new HashMap<Integer, String>();
		tel.put(1, "재윤");
		tel.put(2, "친구");
		System.out.println(tel);
		
		
	}

}
