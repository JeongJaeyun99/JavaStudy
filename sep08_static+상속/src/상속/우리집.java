package 상속;

public class 우리집 {

	public static void main(String[] args) {
		딸 d1 = new 딸("홍길순","여");
		System.out.println(d1);
		System.out.println("현재 딸은 ? : " + 딸.cntD + "명");
		System.out.println("현재 아빠 지갑의 잔고는 ? : " + 딸.fatherW + "원");
		딸 d2 = new 딸("홍길진","여");
		System.out.println(d2);
		System.out.println("현재 딸은 ? : " + 딸.cntD + "명");
		System.out.println("현재 아빠 지갑의 잔고는 ? : " + 딸.fatherW + "원");
	}

}
