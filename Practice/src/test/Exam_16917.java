package test;

import java.util.Arrays;
import java.util.Scanner;

public class Exam_16917 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int y = sc.nextInt(); // 양념치킨갯수
		int f = sc.nextInt(); // 후라이드 치킨 갯수
		int temp[] = new int[3];
		temp[0] =(a * y) + (b*f); // 갯수대로 계산한 가격
		if(y > f) {
			temp[1] = c*(f*2) + (a*(y-f));
			temp[2] = c*y*2;
		}else if(y < f){
			temp[1] = c*(y*2) + (b*(f-y));
			temp[2] = c*f*2;
		}else {
			temp[1] = c*(y+f);
			temp[2] = c*(y+f);
		}
		Arrays.sort(temp);
		System.out.println(temp[0]);
	}

}
