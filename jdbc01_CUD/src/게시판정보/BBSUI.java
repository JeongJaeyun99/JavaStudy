package 게시판정보;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BBSUI extends JFrame{
	
	FlowLayout flow;
	Font font;
	JLabel j1,j3,j4,j5;
	JTextField t3,t4,t5;
	JButton yes,no,upd;
	ImageIcon icon;
	public BBSUI() {
		setSize(500,900);
		flow = new FlowLayout();
		setLayout(flow);
		setTitle("나의 회원정보 UI");
		getContentPane().setBackground(Color.green);		
		
		
		font = new Font("맑은 고딕",Font.BOLD,30);
		j1 = new JLabel();
		j3 = new JLabel("게시판 제목 ");
		t3 = new JTextField(10);
		j4 = new JLabel("게시판 내용");
		t4 = new JTextField(10);
		j5 = new JLabel("게시판 작성자 ");
		t5 = new JTextField(10);
		
		icon = new ImageIcon("naver.png");
		j1.setIcon(icon);
		
		yes = new JButton("게시물 작성 요청");
		no = new JButton("게시물 삭제 요청");
		upd = new JButton("게시물 수정 요청");
		
		j1.setFont(font);
		j3.setFont(font);
		t3.setFont(font);
		j4.setFont(font);
		t4.setFont(font);
		j5.setFont(font);
		t5.setFont(font);
		yes.setFont(font);
		no.setFont(font);
		upd.setFont(font);
		
		t3.setBackground(Color.pink);
		t3.setForeground(Color.red);
		t4.setBackground(Color.pink);
		t4.setForeground(Color.red);
		t5.setBackground(Color.pink);
		t5.setForeground(Color.red);
		yes.setForeground(Color.blue);
		no.setForeground(Color.blue);
		upd.setForeground(Color.blue);
		
		add(j1); // 이미지
		add(j3); // 비밀번호
		add(t3);
		add(j4); // 이름
		add(t4);
		add(j5); // 전화번호
		add(t5);
		add(yes); // 가입 요청
		add(no); // 탈퇴 요청
		add(upd); // 수정 요청
		
		yes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String title = t3.getText();
				String content = t4.getText();
				String writer = t5.getText();
				
				BbsDAO dao = new BbsDAO();
				
				dao.insert(title,content,writer);
				
				JOptionPane.showMessageDialog(null, "게시물 작성이 완료 되었습니다!");
				t3.setText("");
				t4.setText("");
				t5.setText("");
			}
		});
		
		no.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String noS = JOptionPane.showInputDialog("삭제할 게시물의 no를 입력해주세요");
				int no = Integer.parseInt(noS);
				
				BbsDAO dao = new BbsDAO();
				
				dao.delete(no);
				
				JOptionPane.showMessageDialog(null, "게시물 삭제가 완료 되었습니다!");
			}
		});
		
		upd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String title = JOptionPane.showInputDialog("수정할 게시물의 제목을 입력해주세요");
				String content = JOptionPane.showInputDialog("수정할 게시물의 내용을 입력해주세요");
				String noS = JOptionPane.showInputDialog("수정할 게시물의 no를 입력해주세요");
				int no = Integer.parseInt(noS);
				
				BbsDAO dao = new BbsDAO();
				
				dao.update(title,content,no);
				
				JOptionPane.showMessageDialog(null, "게시물 수정이 완료 되었습니다!");
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		BBSUI ui = new BBSUI();
	}

}
