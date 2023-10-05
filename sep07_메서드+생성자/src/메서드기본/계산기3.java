package 메서드기본;

public class 계산기3 {
	public void clients_add(int x, int y) {
		System.out.println("오늘온 손님의 수의 총 합은 " + (x + y) + "명 입니다.");
	}
	public void clients_minus(int x, int y) {
		System.out.println("손님 수의 차이는 " + (x - y) + "명 입니다.");
	}
	public void clients_morning(int price, int client) {
		System.out.println("오전 결제금액은 " + (price * client) + "원 입니다.");
	}
	public void clients_afternoon(int price, int client) {
		System.out.println("오후 결제금액은 " + (price * client) + "원 입니다.");
	}
	public void clients_total(int price, int clients) {
		System.out.println("오늘 하루 총 결제금액은 " + (price * clients) + "원 입니다.");
	}
	public void clients_indiv(int price, int clients) {
		System.out.println("1인당 결제금액은 " + (price * clients) / clients + "원 입니다.");
	}
}
