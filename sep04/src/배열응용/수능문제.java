package 배열응용;

import java.util.Random;

public class 수능문제 {

	public static void main(String[] args) {
		Random r = new Random();
		int arr[] = new int[10000];
		int zeroCnt = 0;
		int sum = 0;
		String manjum = "";
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(451);
			if(arr[i] == 0) {
				zeroCnt++;
			}
			sum += arr[i];
		}
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >= (sum / 10000) - 50 || arr[i] <= (sum / 10000) + 50) {
				
			}
		}
	}

}
