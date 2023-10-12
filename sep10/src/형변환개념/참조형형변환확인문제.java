package 형변환개념;

import java.util.ArrayList;

public class 참조형형변환확인문제 {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		me.add(1000);
		me.add(189.1);
		me.add(false);
		me.add('남');
		System.out.println(me);
		int first = (int)me.get(0) + 2000;
		System.out.println(first);
		double second = (double)me.get(1) + 10;
		System.out.println(second);
		boolean third = (boolean)me.get(2);
		if (third) {
			System.out.println("배불러요");
		}else {
			System.out.println("배고파요");			
		}
		char fourth = (char)me.get(3);
		if (fourth == '남') {
			System.out.println("주민번호는 1,3이예요");
		}else {
			System.out.println("주민번호는 2,4예요 ");
		}
	}

}
