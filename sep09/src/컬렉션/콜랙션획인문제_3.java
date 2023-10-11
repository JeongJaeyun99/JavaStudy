package 컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class 콜랙션획인문제_3 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("게임");
		list.add("공부");
		list.add("잠");
		list.add("운동");
		list.add("만화보기");
		System.out.println(list);
		list.set(1, "청소");
		System.out.println(list);
	}

}
