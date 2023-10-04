package 배열응용고급;

import java.util.Arrays;

public class 깊은복사성적문제 {

	public static void main(String[] args) {
		String[] 과목명 = {"국어", "영어", "수학", "컴퓨터", "회화"};
		int[] term1 = {44, 66, 22, 99, 100};
		int[] term2 = term1.clone();
		term2[0] = 22;
		term2[2] = 88;
		System.out.println(Arrays.toString(term1));
		System.out.println(Arrays.toString(term2));
		//국어점수가 1학기와 2학기가 똑같은지 비교 
		System.out.println(term1[0] == term2[0]);
		//국어점수가 1학기보다 2학기가  더 올랐는지 비교 
		System.out.println(term1[0] < term2[0]);
		
		int same = 0, big2 = 0;
		for (int i = 0; i < term2.length; i++) {
			if(term1[i] == term2[i]) {
				same++;
			}else if (term1[i] < term2[i]) {
				System.out.println("2학기 성적이 오른 인덱스 : " + i);
				System.out.println("2학기 성적이 오른 과 목 : " + 과목명[i]);
				big2++;
			}//else if
		}//for
		System.out.println(same + " " + big2);
	}//main

}//class