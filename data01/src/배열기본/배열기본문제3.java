package 배열기본;

import java.util.Random;
import java.util.Scanner;

public class 배열기본문제3 {
	public static void main(String[] args) {
		String s1 = "참좋다";
		String s2 = "진짜좋다";
		if(s1.equals(s2)) {
			System.out.println("두 단어는 동일합니다.");			
		}
		if(s1.length() > s2.length()) {
			System.out.println("첫번째 단어가 더 깁니다.");
		}else {
			System.out.println("두번째 단어가 더 깁니다.");			
		}
	}
}
