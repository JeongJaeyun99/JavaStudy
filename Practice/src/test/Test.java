package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		String s = "110010101001";
		int[] answer = new int[2];
        int cnt = 0; // 이진변환횟수
        int zeroCnt = 0; // 제거된 0의 갯수
        while(!s.equals("1")){
            String arr[] = s.split("");
            ArrayList<String> list = new ArrayList<String>();
            for(int i = 0;i < arr.length;i++){
                if(arr[i].equals("0")){
                	zeroCnt++;
                }else{
                	list.add(arr[i]);
                    
                }
            }
            cnt++;
            s = "";
            String a = "";
            int b = list.size();
            while(true){
                if(b == 1){
                	 a += "1";
                    break;
                }else{
                    int temp = b % 2;
                    b /= 2;
                    a += temp + "";
                }
            }
            String temp2[] = a.split("");
            for (int i = temp2.length-1; i >= 0; i--) {
				s += temp2[i];
			}
        }
        answer[0] = cnt;
        answer[1] = zeroCnt;
        System.out.println(answer[0] + " " + answer[1]);
    }
}