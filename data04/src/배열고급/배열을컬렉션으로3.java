package 배열고급;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class 배열을컬렉션으로3 {

	public static void main(String[] args) {
		String s1[] = {"박명수", "유재석", "김종국","송지효","하하"};
		Arrays.sort(s1);
		System.out.println(Arrays.toString(s1));
		String s2[] = new String[s1.length];
		for (int i = 0; i < s2.length; i++) {
			s2[i] = s1[s1.length-1-i];
		}
		System.out.println(Arrays.toString(s2));
		ArrayList<String> list0 = new ArrayList<String>();
		ArrayList<String> list1 = new ArrayList<String>();
		for (int i = 0; i < s1.length; i++) {
			list0.add(s1[i]);
			if(s1[i].length() >= 3) {
				list1.add(s1[i]);
			}
		}
		String s3[] = list1.toArray(new String[0]);
		System.out.println(Arrays.toString(s3));
		
		for (int i = 0; i < list0.size(); i++) {
			if(list0.get(i).equals("유재석")) {
				list0.set(i, "유재돌");
			}
		}
		String s4[] = list0.toArray(new String[0]);
		System.out.println(Arrays.toString(s4));
		list0.add(3,"김종민");
		System.out.println(list0);
	}

}
