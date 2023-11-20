package 배열응용;

import 배열기본.Print;

public class 배열정리문제4 {

	public static void main(String[] args) {
		String s = " '휴지', '블루볼펜', '지우개' +=- ";
		String s2[] = s.split(", ");
		System.out.println(s);
		Print.arr(s2);
		String s3[] = s2[1].split("");
		if((s3[1] + s3[2]).equals("블루")) {
			System.out.println("파란볼펜이군요!");
		}else {
			System.out.println("빨간볼펜이군요!");
		}
		int leng[] = new int[s2.length];
		int lengMin = s2[0].length()-1;
		for (int i = 0; i < s2.length; i++) {
			leng[i] = s2[i].length();
			if(s2[i].length() < lengMin) {
				lengMin = s2[i].length();
			}
		}
		int sum = 0;
		for (int i = 0; i < leng.length; i++) {
			sum += leng[i];
		}
		System.out.println(lengMin-2);
		System.out.println(sum);
	}

}
