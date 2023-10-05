package 생성자;

public class Mask {
	public String color;
	public int price;
	public int cnt;
	public Mask(String color, int price, int cnt) {
		super();
		this.color = color;
		this.price = price;
		this.cnt = cnt;
	}
	@Override
	public String toString() {
		return "Mask [색깔=" + color + ", 가격=" + price + ", 갯수=" + cnt + "]";
	}
	
}
