package test;

import java.util.*;

public class Exam_17088 {
	static int n;
	static int min = Integer.MAX_VALUE;
	static int[] arr;
	static int[] combi;  // 수열을 담을 배열
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		if (n == 1) {  // n이 1인 경우는 무조건 0, 해당 코드가 없을 경우 런타임 에러 발생
			System.out.println(0);
			System.exit(0);
		}

		combi = new int[n];
		for (int i = -1; i <= 1; i++) {
			for (int j = - 1; j <= 1; j++) {
				int count = 0;
				if (i != 0) count++;  // 0이 아닌경우 연산 횟수 증가
				if (j != 0) count++;
				
				combi[0] = arr[0] + i;  // arr[0]에 -1, 0, 1순으로 더해줌
				combi[1] = arr[1] + j;
				dfs(count, combi[0] - combi[1], 2);  // 연산 횟수, 등차, depth를 넣어서 재귀 호출
			}
		}

		System.out.println(min != Integer.MAX_VALUE ? min : -1);
		
		sc.close();
	}
	
	static void dfs(int count, int gap, int depth) {  // 연산 횟수, 등차, depth
		if (depth == n) {
			min = Math.min(min, count);  // 최소 연산 횟수 갱신
			
			return;
		}

		for (int i = -1; i <= 1; i++) {
			combi[depth] = arr[depth] + i;  // combi[depth]는 arr[depth]에 -1, 0, 1을 더한 값이 됨
			if (combi[depth - 1] - combi[depth] == gap) {  // 바로 앞 수와의 차이가 등차와 같다면
				dfs(i != 0 ? count + 1 : count, gap, depth + 1);  // 다시 재귀함수 호출
			}
		}
	}
}
