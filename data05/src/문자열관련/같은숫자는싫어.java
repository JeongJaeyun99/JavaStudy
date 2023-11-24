package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class 같은숫자는싫어 {

	public static void main(String[] args) {

		Solution03 s = new Solution03();
		int[] num_list = { 1, 1, 3, 3, 0, 1, 1 };
		int[] result = s.solution(num_list);
		System.out.println(Arrays.toString(result));
	}
}

class Solution03 {
	 public int[] solution(int []arr) { //1,1,3,3,0,1,1
	        Stack<Integer> stack = new Stack<>();
	        stack.push(arr[0]); //[1]
	        for(int i = 1; i < arr.length; i++){
	            if(arr[i] != stack.peek()){
	                stack.push(arr[i]); //[1,3,0,1]
	            }
	        }
	        int[] answer = new int[stack.size()];
	        //stack get(i) --> array[i] answer
	        for(int i = 0; i< answer.length; i++){
	            answer[i] = stack.get(i);
	        }
	        return answer;
	    }
}