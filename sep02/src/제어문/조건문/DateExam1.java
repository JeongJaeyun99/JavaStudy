package 제어문.조건문;

import java.util.Date;

public class DateExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt = new Date();
		int year = dt.getYear()+1900;
		if(year >= 2000) {
			System.out.println("밀레니엄 세대시군요");
		}else {
			System.out.println("밀레니엄 세대가 아니군요");
		}	
		int today = dt.getDay();
		switch (today) {
		case 0:
		case 6:
			System.out.println("주말이다!!!!!!!!!");
			break;
		default:
			System.out.println("열심히 공부하자...");
			break;
		}
		System.out.println("---------------------");
		int month = dt.getMonth();
		switch (month) {
		case 2:
			System.out.println("28알꺼지");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지");
			break;
		default:
			System.out.println("31까지");
			break;
		}
	}	

}
