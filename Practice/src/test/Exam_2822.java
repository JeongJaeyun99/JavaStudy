package test;


import java.util.*;

public class Exam_2822 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[8];
		int clone[] = new int[8];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			clone[i] = arr[i];
		}
		int sum = 0;
		Arrays.sort(arr); 
		for (int i = 7; i >= 3; i--) {
			sum += arr[i];
		}
		System.out.println(sum);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = arr.length-1; i > 2; i--) {
			for (int j = 0; j < clone.length; j++) {
				if(list.size() == 5) {
					break;
				}
				if(arr[i] == clone[j]) {
					list.add(j);
				}
			}
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.remove(i) + " ");
		}
	}

}
