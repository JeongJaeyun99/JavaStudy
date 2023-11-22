package 배열컬렉션변환;

import java.util.Arrays;

public class 배열자르기 {

	public static void main(String[] args) {
		Solution s = new Solution();
		int numbers[] = {1,2,3,4,5};
		int num1 = 1;
		int num2 = 3;
		int[] result = s.solution(numbers,num1,num2);
		System.out.println(Arrays.toString(result));
	}

}
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = Arrays.copyOfRange(numbers,num1,num2+1);
        return answer;
    }
}