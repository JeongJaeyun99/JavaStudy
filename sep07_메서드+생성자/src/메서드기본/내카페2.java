package 메서드기본;

import java.util.Random;

public class 내카페2 {

	public static void main(String[] args) {
		계산기2 cal = new 계산기2();
		System.out.println(cal.add(100, 200));
		System.out.println(cal.add(100.0, 200));
		System.out.println(cal.add(100.0, 200.0));
		System.out.println(cal.add("100", 200));
//		System.out.println(cal.minus(100, 200));
//		System.out.println(cal.pro(100, 200));
//		System.out.println(cal.div(100, 200));
		Random r = new Random();
		int x = r.nextInt(100);
		
	}

}
