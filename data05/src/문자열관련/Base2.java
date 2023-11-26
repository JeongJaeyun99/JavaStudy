package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;

public class Base2 {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		int a = 78;
		int result = s.solution(a);
		System.out.println(result);
	}
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp = n+1;
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        while(true){
            if(n == 1){
            	String s1 = list1.toString();
            	String s2 = list2.toString();
                if(s1.equals(s2)){
                	answer = temp;
                    break; 
                }else{
                    temp++;
                    list1.clear();
                    list2.clear();
                }
            }else{
                int num1 = n % 2;
                if(num1 == 1){
                    list1.add(1);
                }
                int num2 = temp % 2;    
                if(num2 == 1){
                    list2.add(1);
                }
            }
        }
        return answer;
    }
}