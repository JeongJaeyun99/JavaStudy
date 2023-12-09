package greedy;

public class Greedy1 {

	public static void main(String[] args) {
		int arr[] = {500,100,50,10};
		int N = 1350;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			cnt += N / arr[i];
			N %= arr[i];
		}
		System.out.println(cnt);
	}

}
