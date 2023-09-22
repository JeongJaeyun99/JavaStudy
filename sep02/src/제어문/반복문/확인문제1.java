package 제어문.반복문;

import java.util.Scanner;

public class 확인문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int cnt1 = 0;
		int cnt2 = 0;
		while(true) {
			System.out.print("숫자입력1>> ");
			int num1 = sc.nextInt();
			System.out.print("숫자입력2>> ");
			int num2 = sc.nextInt();
			if(num1 > num2) {
				System.out.println("앞 숫자가 더 큽니다.");
				cnt1++;
			}else {
				System.out.println("뒷 숫자가 더 큽니다.");
				cnt2++;
			}
			System.out.print("더 하시겠습니다? 종료(x,X), 계속(o)>> ");
			String cont = sc.next();
			char exit = cont.charAt(0);
			if(exit == 'x' || exit == 'X') {
				System.out.println("게임을 종료합니다.!!");
				System.out.println("앞이 큰 경우는 " + cnt1 + "회");
				System.out.println("뒤가 큰 경우는 " + cnt2 + "회");
				System.exit(0);
			}
		}
	}

}
