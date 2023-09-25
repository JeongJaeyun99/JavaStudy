package 배열문제;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자입력>> ");
			arr[i] = sc.nextInt();
		}
		System.out.println(arr[0] + arr[2]);
		
		String arr2[] = new String[3];
		for (int j = 0; j < arr2.length; j++) {
			System.out.print("언어입력>> ");
			arr2[j] = sc.next();
		}
		
		System.out.println(arr2[0] + " 보다는 " + arr2[1]);
		
	}

}
