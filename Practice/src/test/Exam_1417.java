package test;

import java.util.Scanner;

public class Exam_1417 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int candidates_cnt = sc.nextInt();
		int votes[] = new int[candidates_cnt];
		int max = Integer.MIN_VALUE;
		int maxIdx = 0;
		for (int i = 0; i < votes.length; i++) {
			votes[i] = sc.nextInt();
			if(max <= votes[i]) {
				max = Math.max(max, votes[i]);
				maxIdx = i;
			}
		}
		int minusCnt = 0;
		while(true) {
			for (int i = 0; i < votes.length; i++) {
				if(max <= votes[i]) {
					max = Math.max(max, votes[i]);
					maxIdx = i;
				}
			}
			if(maxIdx == 0) {
				break;
			}
			if(max < votes[0] || candidates_cnt == 1) {
				break;
			}else {
				votes[0]++;
				votes[maxIdx]--;
				minusCnt++;
				max--;
//				System.out.println(max);
//				System.out.println(maxIdx);
//				System.out.println(minusCnt);
			}
		}
		sc.close();
		System.out.println(minusCnt);
	}

}
