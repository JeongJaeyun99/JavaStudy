package test;

import java.util.Scanner;

public class Exam_1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int arr[] = {111,123,135,147,
				159,210,222,234,246,258,321,333,
				345,357,369,420,432,444,456,468,
				531,543,555,567,579,630,642,654,
				666,678,741,753,765,777,789,840,
				852,864,876,888,951,963,975,987,
				999};
		if(n <= 99) {
			ans = n;
		}else if(n > 99 && n <= 110) {
			ans = 99;
		}else if(n >= 111) {
			ans = 99;
			for (int i = 0; i < arr.length; i++) {
				if(n >= arr[i]) {
					ans++;
				}else{
					break;
				}
				
			}
		}
		System.out.println(ans);
	}

}
