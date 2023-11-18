package exam_2;

import java.util.Scanner;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
public class Exam_1859_X
{
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int test_case = 1; test_case <= T; test_case++) {
			int days = sc.nextInt();
			int arr[] = new int[days];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			long purchase = 0;
			long max = Integer.MIN_VALUE;
			long sold = 0;
			for (int i = 0; i < arr.length; i++) {
				purchase += arr[i];
				sold = arr[i] * (i + 1);
				if (sold - purchase > max) {
					max = sold - purchase;
				}
			}
			sb.append("#" + test_case + " " + max).append("\n");
		}
		System.out.println(sb);
	}
}