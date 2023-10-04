package 배열응용고급;

import java.util.Arrays;
import java.util.Scanner;

public class String베열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "감자, 고구마, 양파";
		String s2[] = s.split(",");
		System.out.println(Arrays.toString(s2));
		String s3 = "                  홍길동";
		System.out.println(s3);
		System.out.println(s3.trim());
		System.out.println(s3.replace("                  ", "")); // 비파괴함수
		String s5 = "홍길동";
		char c6 = s5.charAt(0);
		if(c6 == '홍') {
			System.out.println("당신은 홍씨 가문이시군요!");
		}else {
			System.out.println("당신은 홍씨 가문이 아니군요!");
		}
		char c7[] = s5.toCharArray();
		System.out.println(c7[2]);
		Scanner sc = new Scanner(System.in);
		String weather = sc.next(); 
//		String weather2 = weather.trim();
		String s10[] = weather.split(",");
		
		int cloud = 0;
		int sunny = 0;
		for (int i = 0; i < s10.length; i++) {
			if(s10[i].equals("흐림")) {
				cloud++;
			}else if(s10[i].equals("맑음")){
				sunny++;
			}
		}
		
		System.out.println("흐린날 : " + cloud + "일//// 맑은날 : " + sunny + "일");
	}

}
