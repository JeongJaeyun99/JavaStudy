package 배열기본;

public class 배열만들기타입별로 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int char String JButton double boolean
		int age[] = {200,100,50,10};
		for (int i = 0; i < age.length; i++) {
			System.out.print(age[i] + " ");
		}
		System.out.println("");
		for (int x : age) {
			System.out.print(x + " ");
		}
		System.out.println("");
		double weight[] = {99.9,88.8,77.7,66.6};
		for (int i = 0; i < weight.length; i++) {
			System.out.print(weight[i] + " ");
		}
		System.out.println("");
		for(double d : weight) {
			System.out.print(d + " ");
		}
		System.out.println("");
		String name[] = {"정태웅", "김정선","정재윤","정호용"};
		char gender[] = {'남','여','남','남'};
		boolean breakfast[] = {false,true,true,false};
		
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println("");
		for(String s : name) {
			System.out.print(s + " ");
		}
		System.out.println("");
		
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println("");
		for(char g : gender) {
			System.out.print(g + " ");
		}
		System.out.println("");
		
		for (int i = 0; i < breakfast.length; i++) {
			System.out.print(breakfast[i] + " ");
		}
		System.out.println("");
		for(boolean b : breakfast) {
			System.out.print(b + " ");
		}
		System.out.println("");
		
	}

}
