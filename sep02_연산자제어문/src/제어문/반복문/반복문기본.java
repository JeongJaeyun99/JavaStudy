package 제어문.반복문;

import java.util.Date;

public class 반복문기본 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("*");
		}
		int start = 0;
		while (start < 10) {
			start++;
		}
		while(true) {
			System.out.println("내가 계속 돌아간다.");
			Date dt = new Date();
			if(dt.getMinutes() == 26) {
				break;
			}
		}
	}

}
