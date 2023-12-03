package 정렬;

import java.util.ArrayList;
import java.util.Arrays;

public class 이진검색 {

	public static void main(String[] args) {
		int num[] = { 1, 4, 5, 2, 7, 8, 9, 6 };
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
//		System.out.println(Arrays.binarySearch(num, 5)); // 5를 찾아라!
//		System.out.println(Arrays.binarySearch(num, 8)); // 8을 찾아라!
//		System.out.println(Arrays.binarySearch(num, 10));
//		System.out.println(Arrays.binarySearch(num, 0,5,1)); // 인덱스 0부터 5까지에서 1을 찾아라
		int search[] = {1,7,6};
		StringBuilder sb = new StringBuilder();
		for (int find : search) {
			sb.append(Arrays.binarySearch(num,find) + "번째 인덱스에 " + find + "가 있습니다.\n");
		}
		System.out.println(sb);
	}

}
