package 제어문.반복문;

import java.util.Date;

public class 심화확인문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int hour = date.getHours();
		if(hour < 11) {
			System.out.println("굿 모닝");
		}else if(hour < 15 && hour >= 11) {
			System.out.println("굿 애프터눈");
		}else if(hour < 19 && hour >= 15){
			System.out.println("굿 이브닝");
		}else {
			System.out.println("굿 나잇");
		}
	}

}
