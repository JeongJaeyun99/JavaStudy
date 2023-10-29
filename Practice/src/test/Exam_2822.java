package test;

import java.util.*;

public class Exam_2822 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int list[] = new int[8];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < list.length; i++) {
			list[i] = sc.nextInt();
		}
		int temp = 0;
		int idx[] = new int[5];
		int cnt = 0;
		int j = 0;
		while (true) {
			for (int i = 0; i < list.length; i++) {
				if(max < list[i]) {
					max = list[i];
					temp = i;
				}							
			}
			sum += max;
			idx[j] = temp+1;
			j++;
			list[temp] = -1;
			temp = 0;
			max = -1;
			cnt++;
			if(cnt == 5){
				break;
			}
		}
		System.out.println(sum);
		Arrays.sort(idx);
		for (int i = 0; i < idx.length; i++) {
			System.out.print(idx[i] + " ");
		}
	}
}
