package bean;

public class Coffee2 {
	int price;
	String name;
	
	public static Coffee2 coffee1;
	
	public static Coffee2 getInstance() {
		if(coffee1 == null) {
			coffee1 = new Coffee2(1000,"apple");
		}
		return coffee1;
	}
	
	public Coffee2(int price, String name) {
		this.price = price;
		this.name = name;
	}

}
