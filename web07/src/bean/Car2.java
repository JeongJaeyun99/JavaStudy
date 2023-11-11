package bean;

public class Car2 {
	String color;
	int speed;
	int price;
	public static Car2 car2;
	
	public static Car2 getInstance() {
		if (car2 == null) {
			car2 = new Car2("red",200,2000); 
		}
		return car2;
	}
	private Car2(String color, int speed,int price ) {
		this.color = color;
		this.speed = speed;
		this.price = price;
	}
	
}
