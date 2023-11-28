package 비선형구조;

import java.util.TreeSet;

public class K번째큰수 {

	public static void main(String[] args) {
		int k = 3;
		int arr[] = {22, 22, 44, 11, 11, 33, 55, 66, 20, 10, 30, 55};
		TreeSet<Integer> tree = new TreeSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			tree.add(arr[i]);
		}
		System.out.println(tree);
		Object[] arr2 = tree.toArray();
		System.out.println(arr2[arr2.length-k]);
	}

}
