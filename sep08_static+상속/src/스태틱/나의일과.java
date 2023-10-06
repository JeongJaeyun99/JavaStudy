package 스태틱;

public class 나의일과 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부",10,"강남");
		System.out.println(day1);
		System.out.println(Day.count);
		System.out.println(Day.sum);
		Day day2 = new Day("여행",15,"강원도");
		System.out.println(day2);
		System.out.println(Day.count);
		System.out.println(Day.sum);
		Day day3 = new Day("운동",11,"피트니스");
		System.out.println(day3);
		System.out.println(Day.count);
		System.out.println(Day.sum);
		
		System.out.println(Day.sum / Day.count);
		// 앞에다가 클래스 이름을 써주는 것이 낫다
		// 계속 변수명을 다르게 적어주면 헷갈리므로
	}
}
