package test;

import java.util.Scanner;

public class Exam_1817 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int kg = sc.nextInt();
		int box[] = new int[n];
		for (int i = 0; i < box.length; i++) {
			box[i] = sc.nextInt();
		}
		int cnt = 1;
		int temp = 0;
		int i = 0;
		while (true) {
			if(box.length == 0) {
				cnt = 0;
				break;
			}
			if(i == box.length-1) {
				break;
			}
			temp += box[i];
			if (temp + box[i+1] > kg ) {
				cnt++;
				temp = 0;
			}
			i++;
		}
		System.out.println(cnt);
	}

}
