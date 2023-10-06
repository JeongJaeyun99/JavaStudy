package 상속;

public class 딸 {
	String name;
	String sex;
	static int fatherW = 10000;
	static int cntD;
	public void tv보다() {
		System.out.println("tv보는중...");
	}
	public 딸(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
		fatherW -= 1000;
		cntD++;
	}
	@Override
	public String toString() {
		return "딸 [name=" + name + ", sex=" + sex + "]";
	}
	
}
