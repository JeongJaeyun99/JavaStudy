package 제어문.반복문;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int victory = 0;
		int cnt = 0;
		while(true) {
			cnt++;
			int computer = r.nextInt(3);
			System.out.print("가위(0) 바위(1) 보(2) 중에서 숫자 하나를 입력하세요 : ");
			int me = sc.nextInt();
			if(me == 0) { // 가위
				if(computer == 0) {
					System.out.println("컴퓨터가 가위를 냄");
					System.out.println("비김");
				}else if(computer == 1) {
					System.out.println("컴퓨터가 바위를 냄");
					System.out.println("당신의 패배!");
				}else if(computer == 2) {
					System.out.println("컴퓨터가 보를 냄");
					System.out.println("당신의 승리!");
					victory++;
				}
			}
			if(me == 1) { // 바위
				if(computer == 0) {
					System.out.println("컴퓨터가 가위를 냄");
					System.out.println("당신의 승리!");
					victory++;
				}else if(computer == 1) {
					System.out.println("컴퓨터가 바위를 냄");
					System.out.println("비김");
				}else if(computer == 2) {
					System.out.println("컴퓨터가 보를 냄");
					System.out.println("당신의 패배!");
				}
			}
			if(me == 2) { // 보
				if(computer == 0) {
					System.out.println("컴퓨터가 가위를 냄");
					System.out.println("당신의 패배!");
				}else if(computer == 1) {
					System.out.println("컴퓨터가 바위를 냄");
					System.out.println("당신의 승리!");
					victory++;
				}else if(computer == 2) {
					System.out.println("컴퓨터가 보를 냄");
					System.out.println("비김");
				}
			}
			System.out.print("종료하시겠습니까?>> 예(y),아니오(n) ");
			String yn = sc.next();
			char yn2 = yn.charAt(0);
			if(yn2 == 'y' || yn2 == 'Y') {
				System.out.println("가위바위보를 종료합니다.");
				System.out.println("당신이 승리한 횟수 : " + victory + "번");
				System.out.println("당신이  게임을 한 횟수 : " + cnt + "번");
				break;
			}
		}
	}

}
