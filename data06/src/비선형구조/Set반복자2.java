package 비선형구조;

import java.util.HashSet;
import java.util.Iterator;

public class Set반복자2 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		String s = "abcabdc";
		System.out.println(set);
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
