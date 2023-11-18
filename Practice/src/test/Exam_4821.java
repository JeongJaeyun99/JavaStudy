package test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exam_4821 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (true) {
			int Maxpage = sc.nextInt();
			if (Maxpage == 0) {
				break;
			}
			String s = sc.next();
			String s1[] = s.split(",");
			int cnt = 0;
			Set<Integer> set = new HashSet<>();
			for (int i = 0; i < s1.length; i++) {
				String temp[] = s1[i].split("-");
				if(Maxpage < Integer.parseInt(temp[0])){
					continue;
				}
				if(temp.length == 1 || temp[0].equals(temp[1])){
					set.add(Integer.parseInt(temp[0]));
					continue;
				}
				int start = Integer.parseInt(temp[0]);
				int end = Integer.parseInt(temp[1]);
				if(start > end) {
					continue;
				}
				for (int j = start; j <= end; j++) {
					if(j > Maxpage) {
						break;
					}
					set.add(j);
				}
			}
			cnt = set.size();
			sb.append(cnt + "\n");
		}
		System.out.println(sb);
	}

}
