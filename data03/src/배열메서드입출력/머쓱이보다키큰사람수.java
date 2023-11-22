package 배열메서드입출력;

import java.util.ArrayList;
import java.util.Arrays;

public class 머쓱이보다키큰사람수 {

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		//180, 120, 140
		int[] numbers = {149, 180, 192, 170};
		int height = 167;
		int result = s.solution(numbers, height);
		System.out.println(result);
	}
}

class Solution5 {
	public int solution(int[] numbers, int height) {
		 int answer = 0;
	        for(int i = 0; i < numbers.length;i++){
	            if(numbers[i] > height){
	                answer++;
	            }
	        }
	        return answer;
	}
}
