package 생성자복숩;

public class Bbs {
	public int no;
	public String title;
	public String content;
	public String writer;
	public Bbs(int no, String title, String content, String writer) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	@Override
	public String toString() {
		return no + "\t" + title + "\t" + content + "\t" + writer;
		 
	}
	
	
	
}
