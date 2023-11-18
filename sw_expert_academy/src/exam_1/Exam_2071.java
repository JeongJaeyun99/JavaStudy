package exam_1;

import java.util.Scanner;

public class Exam_2071 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int test_case = 1; test_case <= T; test_case++){
			float ans = 0;
			float sum = 0;
			for (int i = 0; i < 10; i++) {
				int num = sc.nextInt();
				sum += num;
			}
			ans = sum/10;
			sb.append("#" + test_case + " " + Math.round(ans)).append("\n");
		}
		System.out.println(sb);
	}

}
