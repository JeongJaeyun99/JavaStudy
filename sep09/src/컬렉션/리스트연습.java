package 컬렉션;

import java.util.ArrayList;
import java.util.Iterator;

public class 리스트연습 {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(100);
		arr.add("hong");
		arr.add(11.1);
		arr.add(true);
		arr.add('a');
		arr.add("hong");
		System.out.println(arr);
		System.out.println(arr.isEmpty());
		System.out.println(arr.get(1) + "gildong");
		for (int i = 0; i < arr.size(); i++) {
			System.out.println("값>> " + arr.get(i));
		}
		for (Object x : arr) {
			System.out.println("값>> " + x);			
		}
		System.out.println(arr.contains("hong"));
		System.out.println(arr.indexOf("hong"));
		arr.remove(0); // 파괴형함수
		arr.remove(11.1); 
		System.out.println(arr);
	}

}
