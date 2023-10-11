package 컬렉션;

import java.util.LinkedList;

public class 링크드리스트연습 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("국어");
		list.add("수학");
		list.add("영어");
		list.add("컴퓨터");
		System.out.println(list);
		list.remove();
		System.out.println(list);
		list.remove();
		System.out.println(list);
		list.remove();
		System.out.println(list);
	}

}
