package 메서드기본;

public class 내카페3 {

	public static void main(String[] args) {
		계산기3 cal = new 계산기3();
		int price = 7000;
		int cnt1 = 5;
		int cnt2 = 4;
		int cnt_total = cnt1+cnt2;
		cal.clients_add(cnt1, cnt2);
		cal.clients_minus(cnt1, cnt2);
	}

}
