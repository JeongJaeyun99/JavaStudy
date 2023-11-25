package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;

public class Base2 {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		String t = "3141592";
		String p = "271";
		int result = s.solution(t,p);
		System.out.println(result);
	}
}

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String arr[] = t.split("");
        long p2 = Integer.parseInt(p);
        for(int i = 0;i <= t.length()-p.length();i++){
            if(t.length() == p.length()){
                answer = 1;
                break;
            }
            String temp = arr[i];
            for(int j = i+1;j < p.length() + i;j++){
                temp += arr[j];
            }
            System.out.println(temp);
            if(Long.parseLong(temp) <= p2){
                answer++;
            }
            temp = "";
        }
        return answer;
    }
}