package 문자열관련;

import java.util.Arrays;

public class A로B를만들기 {

	public static void main(String[] args) {
		String before = "olleh";
		String after = "hello";
		String [] b = before.split("");
		String [] a = after.split("");
		Arrays.sort(b);
		Arrays.sort(a);
		if(Arrays.equals(b, a)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
