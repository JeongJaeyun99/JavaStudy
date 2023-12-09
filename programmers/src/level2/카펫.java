package level2;

import java.util.Arrays;

public class 카펫 {
	public static void main(String[] args) {
		int brown = 24;
		int yellow = 24;
		int[] answer = new int[2];
        int total = brown + yellow;
        int garo = 1;
        int sero = total;
        while(true){
            if(answer[0] >= answer[1] && answer[0]*answer[1] == total){
                break;
            }
            if(total % garo == 0){
                answer[0] = garo;
                answer[1] = total / garo;
                sero = total / garo;
            }
            garo++;
        }
        System.out.println(Arrays.toString(answer));
	}
}
