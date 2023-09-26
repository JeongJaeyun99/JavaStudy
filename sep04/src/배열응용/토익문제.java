package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 토익문제 {

	public static void main(String[] args) {

		int toeicAns[] = new int[999];
		int toeicMy[] = new int[999];
		Random r = new Random();
		
		for (int i = 0; i < toeicAns.length; i++) {
			toeicAns[i] = r.nextInt(4);
			toeicMy[i] = r.nextInt(4);
		}
		System.out.println(Arrays.toString(toeicAns));
		System.out.println(Arrays.toString(toeicMy));
		int jumsu = 0;
		for (int i = 0; i < toeicMy.length; i++) {
			if(toeicAns[i] == toeicMy[i]) {
				jumsu++;
			}
		}
		System.out.println("당신의 점수는 : " + jumsu + "입니다.");
	}

}
