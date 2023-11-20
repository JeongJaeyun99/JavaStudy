package 배열응용;

import 배열기본.Print;

public class String확인문제 {

	public static void main(String[] args) {
		String s10 = "정길동";
		String s11 = "정길동";
		StringBuilder sb = new StringBuilder();
		sb.append(s10 + " " + s11);
		sb.insert(0, "홍길동 ");
		System.out.println(sb);
		String s30 = "푸하하굿바이";
		char[] c2 = s30.toCharArray(); 
		Print.arr(c2);
	}

}
