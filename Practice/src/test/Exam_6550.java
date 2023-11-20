package test;

import java.util.Scanner;

public class Exam_6550 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String s = sc.next();
			String sArr[] = s.split("");
			String t = sc.next();
			String tArr[] = t.split("");
			
			if(s.length() > t.length()) {
				System.out.println("NO");
				break;
			}
			int sIndex = 0;
			int tIndex = 0;	
			int check = 0;
			while (true) {
				if(sIndex > sArr.length-1 || tIndex > tArr.length-1) {
					System.out.println("No");
					break;
				}
				if(tArr[tIndex].equals(sArr[sIndex])) {
					sIndex++;
					tIndex++;
					check++;
				}else {
					tIndex++;
				}
				if(check == sArr.length) {
					System.out.println("Yes");
					break;
				}
			}
		}
		sc.close();
	}

}
