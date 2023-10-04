package 배열응용고급;

import java.util.Arrays;

public class 참조형복사 {
	static int a = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1[] = {100,200,300};
		int n2[] = n1;
		System.out.println(Arrays.toString(n2));
		n2[0] = 999;
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		int n3[] = n1.clone();
		n3[0] = 1;
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n3));
	}

}
