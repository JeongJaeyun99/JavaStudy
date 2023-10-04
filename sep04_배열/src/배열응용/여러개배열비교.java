package 배열응용;

public class 여러개배열비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] term1 = {77, 88, 99, 55, 70};
		int[] term2 = {99, 100, 88, 80, 70};
		// 2학기에 오른 학생수 카운트
		// 1,2학기에 동일한 학생수와 번호
		int sameCnt = 0;
		int upCnt = 0;
		for (int i = 0; i < term2.length; i++) {
			if(term1[i] < term2[i]) {
				upCnt++;
				System.out.println(i + "번 학생은 지난학기보다 성적이" + (term2[i] - term1[i]) +  "점 올랐습니다.");
			}else if(term1[i] == term2[i]) {
				sameCnt++;
				System.out.println(i + "번 학생은 지난학기와 성적이 동일합니다.");
			}
			
			
		}
	}

}
