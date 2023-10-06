package 상속;

public class 직원 {
	public String name;
	String address;
	protected int salray;
	private int rrn;
	@Override
	public String toString() {
		return "직원 [name=" + name + ", address=" + address + ", salray=" + salray + ", rrn=" + rrn + "]";
	}
	
}
