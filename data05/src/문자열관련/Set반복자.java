package 문자열관련;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Set반복자 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("휴대폰");
		set.add("휴지");
		set.add("휴지");
		System.out.println(set);
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("휴대폰");
//		list.add("휴지");
//		list.add("폰");
//		System.out.println(list);
//		Iterator<String> it2 = list.iterator();
//		System.out.println(it2.next());
//		System.out.println(it2.next());
//		System.out.println(it2.next());
	}

}
