package bean;

public class MainCar {
	public static void main(String[] args) {
		Car car1 = new Car("red",200,2000);
		Car car2 = new Car("blue",150,1500);
		Car car3 = new Car("red",100,2000);
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
	}
}
