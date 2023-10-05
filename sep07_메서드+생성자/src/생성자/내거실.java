package 생성자;

import 부품만들기.TV;

public class 내거실 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV();
		tv.ch = 5;
		tv.onOff = false;
		tv.vol = 100;
		System.out.println(tv);
		
//		TV2 tv2 = new TV2(6,true,100);
//		System.out.println(tv2.toString());
		
	}

}
