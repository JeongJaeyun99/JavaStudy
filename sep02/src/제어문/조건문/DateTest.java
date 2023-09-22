package 제어문.조건문;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt = new Date();
		int hour = dt.getHours();
		int min = dt.getMinutes();
		int sec = dt.getSeconds();
		System.out.println(hour + "시" + min + "분" + sec + "초");
		
		int year = dt.getYear() + 1900; // 1900 + 123
		int month = dt.getMonth() + 1;
		int today = dt.getDate();
		System.out.println(year + "년 " + month + "월 " + today + "일");
		int day = dt.getDay();
		System.out.println(day);
	}

}
