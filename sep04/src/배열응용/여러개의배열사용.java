package 배열응용;

public class 여러개의배열사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String family[] = {"아버지","어머니","나","동생","누나"};
		int age[] = {100,99,88,77,66};
		double height[] = {199.9, 189.9, 179.9, 169.9, 159.9};
		System.out.println("우리집 식구 정보");
		System.out.println("----------------------");
		System.out.println("이름\t나이\t키");
		for (int i = 0; i < height.length; i++) {
			System.out.println(family[i] + "\t" + age[i] + "\t" + height[i]);
		}
		// height[height.length-1] += 5;
		for (int i = 0; i < family.length; i++) {
			if(family[i] == "동생") {
				height[i] += 5;
			}
		}
		for (int i = 0; i < age.length; i++) {
			age[i]+=1;
		}
		System.out.println("");
		System.out.println("우리집 식구 정보");
		System.out.println("----------------------");
		System.out.println("이름\t나이\t키");
		for (int i = 0; i < height.length; i++) {
			System.out.println(family[i] + "\t" + age[i] + "\t" + height[i]);
		}
	}

}
