package 제어문.순차문;

public class test7 {

	public static void main(String[] args) {
		
		int waterPrice = 1000;
		int waterCnt = 2;
		
		int maskPrice = 2000;
		int maskCnt = 3;
		
		int waterSum = waterPrice * waterCnt;
		int maskSum = maskPrice * maskCnt;
		int total = waterSum + maskSum;
		System.out.println(total);
	}

}
