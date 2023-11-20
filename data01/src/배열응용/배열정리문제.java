package 배열응용;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num[] = sc.next().split("-");
		if(num[0].equals("011")) {
			System.out.println("통신사 : SKT");
		}else if(num[0].equals("019")) {
			System.out.println("통신사 : LG");
		}else {
			System.out.println("통신사 : APPLE");
		}
		if(num[1].length() >= 4) {
			System.out.println("최신폰");
		}else {
			System.out.println("올드폰");			
		}
		if(num[0].length() + num[1].length() + num[2].length() >= 10) {
			System.out.println("유효한 전화번호입니다.");
		}else {
			System.out.println("유효하지 않은 전화번호입니다.");
		}
	}

}
