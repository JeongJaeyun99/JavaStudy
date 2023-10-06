package 생성자복숩;

public class Bbs사용 {

	public static void main(String[] args) {
		Bbs b1 = new Bbs(1,"My first","Ralro1","Jaeyoon");
		Bbs b2 = new Bbs(2,"My second","Ralro2","Jaeyoon");
		Bbs b3 = new Bbs(3,"My third","Ralro3","Jaeyoon");
		Bbs b4 = new Bbs(4,"My fourth","Ralro4","Jaeyoon");
		System.out.println("no\ttitle\t\tcontent\twriter");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}

}
