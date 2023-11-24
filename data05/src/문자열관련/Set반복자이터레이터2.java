package 문자열관련;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Set반복자이터레이터2 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1000);
		set.add(2000);
		set.add(3000);
		set.add(2000);
		set.add(4000);
		set.add(2000);
		set.add(3000);
		System.out.println(set);
		Iterator<Integer> it = set.iterator();
		int [] arr = new int[set.size()];
		int index = 0;
		while (it.hasNext()) {
			arr[index] = it.next();
			index++;
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
