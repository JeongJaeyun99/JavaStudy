package 배열응용;

import java.util.Scanner;

public class 여행 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String last[] = new String[3];
		String year[] = new String[3];
		
		for (int i = 0; i < last.length; i++) {
			last[i] = sc.next();
		}
		for (int i = 0; i < year.length; i++) {
			year[i] = sc.next();
		}
		int sameCnt = 0;
		int difCnt = 0;
		for (int i = 0; i < year.length; i++) {
			if(last[i].equals(year[i])) {
				sameCnt++;
				System.out.println("작년과 올해에도 가고 싶은 장소는 " + last[i] + " 입니다.");
			}else {
				difCnt++;
			}
		}
		System.out.println("작년과 올해가 동일한 장소 : " + sameCnt + "곳");
		System.out.println("작년과 올해가 다른 장소 : " + difCnt + "곳");
	}

}
