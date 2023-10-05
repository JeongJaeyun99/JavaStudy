package 생성자;

public class 내카페4 {

	public static void main(String[] args) {
		Cal4 cal = new Cal4();
		System.out.println("<<---------------------------------->>");
		System.out.println("");
		int coffee = 5;
		int milkTea = 2;
		int priceC = 2000;
		int priceM = 3000;
		
		int coffeeT = cal.sum(coffee, priceC);
		int milkTeaT = cal.sum(milkTea, priceM); 
		int total = cal.total(coffeeT, milkTeaT);
		System.out.println("커피의 가격은 : " + coffeeT + "원 입니다.");
		System.out.println("밀크티의 가격은 : " + milkTeaT + "원 입니다.");
		System.out.println("총 가격은 " + total + "원 이고,한 명당 내야할 가격은 " + cal.div(total, (coffee+milkTea)));
		System.out.println("");
		System.out.println("<<---------------------------------->>");
	}

}
