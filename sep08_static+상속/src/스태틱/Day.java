package 스태틱;

public class Day {
	public String doing;
	public int time;
	public String location;
	public static int count; // 호출될때마다 초기화 안됨
	// 변수 공유 목적
	public static int sum;
	public Day(String doing, int time, String location) {
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
		sum+=time;
	}
	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
}
