package 메서드연습;

public class 내가게 {

	public static void main(String[] args) {
		int coffeePrice = 5000;
		int coffeeCount = 15;
		계산기 cal = new 계산기();
		int result = cal.mul(coffeePrice, coffeeCount);
		if (result >= 50000) {
			System.out.println("최종 계산금액은 " + (result - 5000));
		}else {
			System.out.println("최종 계산금액은 " + result);
		}
		// 1.
		int[] arr = cal.array();
		arr[0] +=100;
		System.out.println(arr[0]);
		
		// 2.
		회원정보VO bag = cal.get2("win2", "1234", "win2", "010");
		bag.setPw("1111");
		System.out.println(bag);
		
		// 3.
		String ans = cal.get4("홍길동", 100);
		ans += "입니다. 환영해주세요";
		System.out.println(ans);
	}

}
