package 상속복습;

public class GisaFirst2 {
	public static void main(String[] args) {
		B2 b = new B2(); // 형변환
		b.paint();
		b.draw();
	}
}
class A2 {
	public void paint() {
		System.out.print("A");
		draw();
	}
	public void draw() {
		System.out.print("B");
		draw();
	}
}
class B2 extends A2 {
	@Override
	public void paint() {
		super.draw(); // B
		System.out.print("C"); 
 		this.draw();
	}
	@Override
	public void draw() {
		System.out.print("D");
	}
}
