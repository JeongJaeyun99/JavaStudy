package 배열응용고급;

public class String응용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I am a good person";
		String s2 = "Ralro";
		System.out.println(s + s2);
		System.out.println(s.concat(s2));
		System.out.println(s.charAt(2));
		System.out.println(s.endsWith("n"));
		System.out.println(s.substring(2,11));
		System.out.println(s.contains(s2));
		System.out.println(s.lastIndexOf("e"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		System.out.println(s2.replace("R", "H"));
	}

}
