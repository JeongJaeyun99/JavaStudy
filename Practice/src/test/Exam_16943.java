package test;

import java.util.*;

public class Exam_16943 {
	static String[] a;
	static int b, c = -1;
	static String[] arr;
	static boolean[] visit;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		a = sc.next().split("");
		b = sc.nextInt();
		
		arr = new String[a.length];   // a의 조합을 담을 배열
		visit = new boolean[a.length];
		dfs(0);
		
		System.out.println(c);
		
	}
	
	static void dfs(int depth) {
		if (depth == a.length) {
			String s = "";
			
			if (arr[0].equals("0")) return;  // c는 0으로 시작할 수 없음, 함수 종료
			
			for (int i = 0; i < arr.length; i++) {
				s += arr[i];
			}

			if (b > Integer.parseInt(s))  // 조합된 숫자가 b보다 작다면 c값 갱신
				c = Math.max(c, Integer.parseInt(s));
			
			return;
		}
		
		for (int i = 0; i < a.length; i++) {  // 백트래킹을 활용해 a의 조합을 구함
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = a[i];
				dfs(depth + 1);
				visit[i] = false;
			}
		}
	}
}