package test;

import java.util.Scanner;

public class Exam_2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int sec = sc.nextInt();
		int cook = sc.nextInt();
		
		sec += cook;
		if(sec >= 60) {
			while(sec >= 60) {
				sec -= 60;
				min++;
			}
		}
		if(min >= 24) {
			min -= 24;
		}
		System.out.println(min + " " + sec);
	}

}
