package test;

import java.util.Scanner;

public class Exam_16968 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String arr[] = s.split("");
		int ans = 1;
		int d = 10;
		int c = 26;
		if(arr[0].equals("d")) {
			ans*=d;
		}else if(arr[0].equals("c")){
			ans*=c;
		}
		for (int i = 1; i < arr.length; i++) {
			if(arr[i].equals("d")){
				if(arr[i].equals(arr[i-1])) {
					ans*=9;
				}else {
					ans*=d;
				}
			}
			if(arr[i].equals("c")){
				if(arr[i].equals(arr[i-1])) {
					ans*=25;
				}else {
					ans*=c;
				}
			}
		}
		System.out.println(ans);
	}

}
