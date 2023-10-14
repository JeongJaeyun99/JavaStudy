package test;

public class Test {
	public static void main(String[] args) {
		int max = 0;
		int min = 999;
		int score[] = {90,85,78,100,98};
		for(int i = 0;i < score.length;i++){
			if(max < score[i]){
			max = score[i];
		}
		}
		for(int i = 0;i < score.length;i++){
			if(min > score[i]){
			min = score[i];
			}
			} 
		System.out.println(max + " " + min);
	}
}