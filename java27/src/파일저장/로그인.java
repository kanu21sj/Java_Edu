package 파일저장;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		//static 변수: 객체생성하지 않아도 언제든 클래스 이름으로 접근해서
		//			    바로 그 변수의 값을 가져다 쓸 수 있는 변수
		//			    그래픽 프로그램에서는 Font의 속성, Color의 값 등을
		//			    자주 씀으로 static 변수로 만들어 두어서 편하게 언제든 쓸 수 있음.
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(350, 500);
		f.getContentPane().setLayout(null);
		
		JLabel top = new JLabel("");
		top.setBounds(79, 38, 169, 116);
		f.getContentPane().add(top);
		
		ImageIcon icon = new ImageIcon("top.png");
		top.setIcon(icon);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(41, 210, 74, 37);
		f.getContentPane().add(lblNewLabel_1);
		
		
		JLabel lblNewLabel_1_1 = new JLabel("패스워드");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setBounds(41, 277, 103, 42);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setBackground(Color.YELLOW);
		t1.setFont(new Font("굴림", Font.BOLD, 20));
		t1.setBounds(142, 212, 141, 37);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("굴림", Font.BOLD, 20));
		t2.setColumns(10);
		t2.setBackground(Color.YELLOW);
		t2.setBounds(142, 277, 141, 37);
		f.getContentPane().add(t2);
		
		JButton login = new JButton("");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//로그인 처리
				String s1 = t1.getText(); //id입력
				String s2 = t2.getText(); //pw입력
				//root, 1234 동일하면 "로그인 성공"
				if (s1.equals("root") && s2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
					Diary diary = new Diary();
					diary.open();
				}
				else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}
			}
		});
		login.setBounds(27, 357, 132, 71);
		f.getContentPane().add(login);
		
//		ImageIcon icon2 = new ImageIcon("login.png");
		login.setIcon(new ImageIcon("login.png"));
		
		JButton reset = new JButton("");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//버튼을 클릭했을 때 처리내용
				//t1, t2 입력한 내용 지워라
				t1.setText("");
				t2.setText("");
			}
		});
		reset.setBounds(173, 357, 132, 71);
		f.getContentPane().add(reset);
		
		ImageIcon icon3 = new ImageIcon("reset.png");
		reset.setIcon(icon3);
		
		//항상 마지막 줄.!!
		f.setVisible(true);
	}
}
