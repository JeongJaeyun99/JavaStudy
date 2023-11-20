package 배열기본;

import java.util.Arrays;
import java.util.Scanner;

public class 입력해서배열에넣기3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] num = new double[3];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextDouble();
		}
		sc.close();
		System.out.println(Arrays.toString(num));
		System.out.println();
	}

}
