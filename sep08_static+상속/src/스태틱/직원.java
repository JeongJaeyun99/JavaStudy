package 스태틱;

public class 직원 {
	public String name;
	public int age;
	public String sex;
	public static int people;
	public static int ageSum;
	public 직원(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		people++;
		ageSum+=age;
	}
	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	public static int getAvg() {
//		System.out.println(age); static 메소드 안에서는 static 변수만 써야한다.(이유 : )
		return ageSum / people;
	}
	
}
