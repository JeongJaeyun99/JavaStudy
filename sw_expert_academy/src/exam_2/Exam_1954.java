package exam_2;

import java.util.Scanner;

public class Exam_1954 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		StringBuilder sb = new StringBuilder();
		for (int test_case = 1; test_case <= T; test_case++) {
			sb.append("#" + test_case).append("\n");
			int n = sc.nextInt();
			int arr[][] = new int[n][n];
			int value = 1;
			int minRow = 0, maxRow = n - 1, minCol = 0, maxCol = n - 1;

			while (value <= n * n) {
				for (int i = minCol; i <= maxCol; i++) {
					arr[minRow][i] = value++;
				}
				minRow++;
				

				for (int i = minRow; i <= maxRow; i++) {
					arr[i][maxCol] = value++;
				}
				maxCol--;

				for (int i = maxCol; i >= minCol; i--) {
					arr[maxRow][i] = value++;
				}
				maxRow--;

				for (int i = maxRow; i >= minRow; i--) {
					arr[i][minCol] = value++;
				}
				minCol++;
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					sb.append(arr[i][j] + " ");
				}
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}

}
