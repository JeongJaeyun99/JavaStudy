package 정리문제;

public class Car {
	public String color;
	int price;
	private String developer;
	protected int count;
	@Override
	public String toString() {
		return "Car [color=" + color + ", price=" + price + ", developer=" + developer + ", count=" + count + "]";
	}
}
