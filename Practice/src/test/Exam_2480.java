package test;

import java.util.Arrays;
import java.util.Scanner;

public class Exam_2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numArr[] = new int[3];
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = sc.nextInt();
		}
		int sum = 0;
		if(numArr[0] == numArr[1]) {
			if(numArr[0] == numArr[2]) {
				sum+= 10000+(1000*numArr[0]);
			}else{
				sum+= 1000+(100*numArr[0]);
			}
		}else if(numArr[0] == numArr[2]) {
			if(numArr[1] == numArr[2]) {
				sum+= 10000+(1000*numArr[0]);
			}else {
				sum+= 1000+(100*numArr[0]);	
			}
		}else if(numArr[1] == numArr[2]){
			if(numArr[1] == numArr[0]) {
				sum+= 10000+(1000*numArr[1]);
			}else {
				sum+= 1000+(100*numArr[1]);
			}
		}else {
			Arrays.sort(numArr);
			sum+= (100*numArr[2]);
		}
		System.out.println(sum);
	}

}
