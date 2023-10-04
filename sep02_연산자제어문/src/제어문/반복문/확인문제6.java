package 제어문.반복문;

import java.util.Scanner;

public class 확인문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int appCnt = sc.nextInt();
		int appPrice = sc.nextInt();
		int strCnt = sc.nextInt();
		int strPrice = sc.nextInt();
		int appSum = appCnt * appPrice;
		int strSum = strCnt * strPrice;
		System.out.println("사과의 가격은 " + appSum + "원 입니다.");
		System.out.println("딸기의 가격은 " + strSum + "원 입니다.");
		System.out.println("전체금액은 " + (appSum + strSum) + "원 입니다.");
	}

}
