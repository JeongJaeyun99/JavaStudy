package 제어문.반복문;

import java.util.Scanner;

public class 확인문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int iu = 0;
		int yoo = 0;
		int bangtan = 0;
		while(true) {
			System.out.print("입력 1)아이유 2)유재석 3)방탄 4)종료>> ");
			int num = sc.nextInt();
			if(num == 1) {
				iu++;
			}else if(num == 2) {
				yoo++;
			}else if(num == 3) {
				bangtan++;
			}else if(num == 4) {
				System.out.println("종료합니다.");
				break;
			}
		}
		System.out.println("아이유 득표수>> " + iu + "표");
		System.out.println("유재석 득표수>> " + yoo + "표");
		System.out.println("방탄 득표수>> " + bangtan + "표");
	}

}
