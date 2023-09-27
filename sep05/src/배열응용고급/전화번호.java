package 배열응용고급;

import java.util.Scanner;

public class 전화번호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호입력>> ");
		String num = sc.next();
		String num2 = num.trim();
		String num3[] = num2.split("-");
		if(num3[0].equals("011")) {
			System.out.println("SK");
		}else if(num3[0].equals("019")) {
			System.out.println("LG");
		}else {
			System.out.println("Apple");
		}
		
		if(num3[1].length() >= 4) {
			System.out.println("최신폰");
		}else {
			System.out.println("올드폰");
		}
		
		if(num2.length() >= 10) {
			System.out.println("유효한 전화번호");
		}else {
			System.out.println("유효하지 않은 전화번호");
		}
	}

}
