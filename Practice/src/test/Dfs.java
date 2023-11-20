package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Dfs {
	
	public static boolean visited[];
	public static int list[][]; // 2차원 arraylist
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();
		visited = new boolean[n];
		list = new int[n][m];
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < m; j++) {
				list[i][j] = str.charAt(j) - '0';
			}
		}
	}
	public static void dfs(int x) {
		visited[x] = true;
		for (int i = 0; i < list[x].length; i++) {
			int y = list[x][i];
			if(!visited[y]) {
				dfs(y);
			}
		}
	}
}
