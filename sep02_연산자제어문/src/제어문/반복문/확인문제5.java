package 제어문.반복문;

import java.util.Scanner;

public class 확인문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		String pw = sc.next();
		if(id.equals("root") && pw.equals("1234")) {
			System.out.println("로그인성공!");
		}else {
			System.out.println("로그인실패!");
		}
	}

}
