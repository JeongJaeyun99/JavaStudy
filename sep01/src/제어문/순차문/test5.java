package 제어문.순차문;

public class test5 {

	public static void main(String[] args) {
		
		int coffeeCnt = 5;
		int coffeePrice = 5000;
		int sum = coffeeCnt * coffeePrice;
		System.out.println(sum);
		
		if(sum > 20000) {
			System.out.println("할인해드릴게요.");
		}else {
			System.out.println("총 커피값을 내세요");
		}
	}

}
