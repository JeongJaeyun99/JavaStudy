package 배열기본;

import java.util.Arrays;

public class 배열확인 {

	public static void main(String[] args) {
		int age[] = {60,50,30,20,10};
		double weight[] = new double[5];
		weight[0] = 88.8;
		weight[1] = 88.7;
		weight[2] = 88.6;
		weight[3] = 88.5;
		weight[4] = 88.4;
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}
		System.out.println(Arrays.toString(age));
	}

}
