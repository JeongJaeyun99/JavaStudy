package greedy;

import java.util.Scanner;
import java.time.*;

public class Greedy2 {

	public static void main(String[] args) {
		
		Instant start = Instant.now();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int cnt = 0;
		while (true) {
			int target = ( n / k ) * k;
			cnt += (n - target);
			n = target;
			if(n < k) {
				break;
			}
			cnt += 1;
			n /= k;
		}
		System.out.println(cnt);
		Instant end = Instant.now();
		System.out.println("수행시간: " + Duration.between(start, end).toMillis() + " ms");
	}

}
