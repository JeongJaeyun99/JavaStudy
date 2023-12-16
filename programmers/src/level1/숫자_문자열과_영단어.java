package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class 숫자_문자열과_영단어 {

	public static void main(String[] args) {
		int n = 5;
		int arr1[] = {9,20,28,18,11};
		int arr2[] = {30,1,21,17,28};
		Solution s = new Solution();
		String answer[] = s.solution(n, arr1, arr2);
		System.out.println(Arrays.toString(answer));
	}
	
}
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {

            int combinedMap = arr1[i] | arr2[i];
            
            String binaryString = String.format("%s", Long.toBinaryString(combinedMap));
            
            System.out.println(binaryString);

            answer[i] = binaryString.replaceAll("1", "#").replaceAll("0", " ");
        }

        return answer;
    }
}