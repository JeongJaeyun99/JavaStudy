package 배열응용;

import 배열기본.Print;

public class String확인문제2 {

	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";
		String s[] = all.split(", ");
		System.out.println("과목수는 " + s.length + "과목");
		int cnt = 0;
		for (int i = 0; i < s.length; i++) {
			if(s[i].equals("컴퓨터")) {
				System.out.println("컴퓨터의 위치는 인덱스>> " + i);
			}
			if(s[i].length() < 3) {
				cnt++;
			}
		}
		System.out.println("3글자 미만 과목수는>> " + cnt);
		
	}

}
