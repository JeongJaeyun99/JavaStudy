package 리팩토링;

import javax.swing.JOptionPane;

public class 회원정보UI_test {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("아이디 입력 : ");
		String pw = JOptionPane.showInputDialog("패스워드 입력 : ");
		String name = JOptionPane.showInputDialog("이름 입력 : ");
		String tel = JOptionPane.showInputDialog("전화번호 입력 : ");
		
		MemberDAO dao = new MemberDAO();
		
		MemberVO vo = new MemberVO();
		
		vo.setId(id);
		vo.setPw(pw);
		vo.setName(name);
		vo.setTel(tel);
		
		dao.insert(vo);
		
	}

}
