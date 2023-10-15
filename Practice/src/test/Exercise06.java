package test;

public class Exercise06 {

	public static void main(String[] args) {
		Armor suit1 = new Armor();
		Armor suit2 = new Armor("mark6",180);
	}
	class Armor{
		private String name;
		private int height;
		
		
		public Armor(String name, int height) {
			this.name = name;
			this.height = height;
		}
		public String getName(){
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getHight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
	}
}
