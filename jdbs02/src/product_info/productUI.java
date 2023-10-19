package product_info;

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

public class productUI extends JFrame{
	
	FlowLayout flow;
	Font font;
	JLabel j1,j2,j3,j4,j5,j6,j7;
	JTextField t2,t3,t4,t5,t6,t7;
	JButton yes,no,upd,search;
	ImageIcon icon;
	public productUI() {
		setSize(500,800);
		flow = new FlowLayout();
		setLayout(flow);
		setTitle("나의 회원정보 UI");
		getContentPane().setBackground(Color.green);		
		
		
		font = new Font("맑은 고딕",Font.BOLD,20);
		j1 = new JLabel();
		j2 = new JLabel("아이디 ");
		t2 = new JTextField(10);
		j3 = new JLabel("이름 ");
		t3 = new JTextField(10);
		j4 = new JLabel("내용 ");
		t4 = new JTextField(10);
		j5 = new JLabel("가격 ");
		t5 = new JTextField(10);
		j6 = new JLabel("제조사 ");
		t6 = new JTextField(10);
		j7 = new JLabel("이미지 ");
		t7 = new JTextField(10);
		
		icon = new ImageIcon("naver.png");
		j1.setIcon(icon);
		
		yes = new JButton("상품정보 추가");
		no = new JButton("상품정보 삭제");
		upd = new JButton("상품정보 수정");
		search = new JButton("상품정보 검색");
		
		
		j1.setFont(font);
		j2.setFont(font);
		t2.setFont(font);
		j3.setFont(font);
		t3.setFont(font);
		j4.setFont(font);
		t4.setFont(font);
		j5.setFont(font);
		t5.setFont(font);
		j6.setFont(font);
		t6.setFont(font);
		j7.setFont(font);
		t7.setFont(font);
		yes.setFont(font);
		no.setFont(font);
		upd.setFont(font);
		search.setFont(font);
		
		t2.setBackground(Color.pink);
		t2.setForeground(Color.red);
		t3.setBackground(Color.pink);
		t3.setForeground(Color.red);
		t4.setBackground(Color.pink);
		t4.setForeground(Color.red);
		t5.setBackground(Color.pink);
		t5.setForeground(Color.red);
		t6.setBackground(Color.pink);
		t6.setForeground(Color.red);
		t7.setBackground(Color.pink);
		t7.setForeground(Color.red);
		yes.setForeground(Color.blue);
		no.setForeground(Color.blue);
		upd.setForeground(Color.blue);
		search.setForeground(Color.blue);
		
		add(j1); // 이미지
		add(j2); 
		add(t2);  
		add(j3); 
		add(t3);
		add(j4); 
		add(t4);
		add(j5); 
		add(t5);
		add(j6); 
		add(t6);
		add(j7); 
		add(t7);
		add(yes); 
		add(no); 
		add(upd); 
		add(search); 
		
		yes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = t2.getText();
				String name = t3.getText();
				String content = t4.getText();
				String price = t5.getText();
				String company = t6.getText();
				String img = t7.getText();
				
				
				productDAO dao = new productDAO();
				
				productVO vo = new productVO();
				
				vo.setId(id);
				vo.setName(name);
				vo.setContent(content);
				vo.setPrice(Integer.parseInt(price));
				vo.setCompany(company);
				vo.setImg(img);
				
				dao.insert(vo);
				
				JOptionPane.showMessageDialog(null, "상품정보 입력이 완료 되었습니다!");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");
				t7.setText("");
			}
		});
		
		no.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("삭제할 상품정보의 id를 입력해주세요");
				productDAO dao = new productDAO();				
				
				int result = dao.delete(id);
				if(result == 1) {
					JOptionPane.showMessageDialog(null, "상품정보 삭제가 완료 되었습니다!");					
				}
			}
		});
		
		upd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String img = JOptionPane.showInputDialog("수정할 상품의 이미지를 입력해주세요");
				String id = JOptionPane.showInputDialog("수정할 상품의 id를 입력해주세요");
				productDAO dao = new productDAO();
				
				int result = dao.update(img,id);
				if(result == 1) {
					JOptionPane.showMessageDialog(null, "상품의 이미지 수정이 완료 되었습니다!");
				}
			}
		});
		
		search.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("상품의 아이디를 입력해주세요 : ");
				
				productDAO dao = new productDAO();
				
				productVO vo = dao.one(id);
				JOptionPane.showMessageDialog(null, vo);
			}
		});
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		productUI ui = new productUI();
	}

}
