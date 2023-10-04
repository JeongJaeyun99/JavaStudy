package 제어문.순차문;

import java.util.Scanner;

public class 입출력연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("나의 이름은? ");
		String hong = sc.next();
		System.out.print("나의 키는? ");
		double height = sc.nextDouble();
		System.out.print("나의 몸무게는? ");
		double weight = sc.nextDouble();
		System.out.print("나는 저녁을 먹었나요? ");
		boolean dinner = sc.nextBoolean();
		System.out.print("나의 좌우명은? ");
		sc.nextLine();
		String line = sc.nextLine();
		
		System.out.println("내 이름은 " + hong + "입니다.");
		System.out.println("내 내년 키는 " + height + "입니다.");
		System.out.println("내 내년 몸무게는 " + weight + "입니다.");
		System.out.println("나는 저녁을 " + dinner + "했습니다.");
		System.out.println("나의 좌우명은  " + line + "입니다.");
	}

}
