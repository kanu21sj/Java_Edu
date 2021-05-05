package 조건문;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽5 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(600, 600);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uBA39\uACE0 \uC2F6\uC740 \uC74C\uC2DD");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(27, 30, 259, 43);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBounds(256, 27, 259, 43);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("\uC5B4\uB514\uB85C \uAC08\uAE4C\uC694?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//t1 먹고 싶은 음식
				String s1 = t1.getText(); //입력한 값 t1 가져와서 string s1으로 변환(모든 입력값은 스트링이므로)
				
				if (s1.equals("짬뽕")) {
					JOptionPane.showMessageDialog(f, "중국집으로 가세요!"); //짬뽕, 라면에 따라 모니터로 출력
				} else if (s1.equals("라면")) {
					JOptionPane.showMessageDialog(f, "분식집으로 가세요!");				
				} else {
					JOptionPane.showMessageDialog(f, "아무거나 드세요!");
				}
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton.setBounds(37, 85, 478, 43);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("\uB2F9\uC2E0\uC758 \uB098\uC774\uB294");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setBounds(27, 159, 259, 43);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBounds(256, 156, 259, 43);
		f.getContentPane().add(t2);
		
		JButton btnNewButton_1 = new JButton("\uB2F9\uC2E0\uC758 \uB0B4\uB144 \uB098\uC774\uB294");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//t2 당신의 내년 나이는
				String s2 = t2.getText(); // 입력값 t2 가져와서 String s2로 변환(모든 입력값은 스트링이므로)
				int age = Integer.parseInt(s2);
				JOptionPane.showMessageDialog(f, "내년 나이는 " + (age + 1) +" 살 입니다."); 
				//계산을 하기 위해서 String s2를 Integer.parseInt 값으로 전환 -> 모니터로 출력
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_1.setBounds(37, 214, 478, 43);
		f.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uAD6D\uC5B4\uC810\uC218");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(27, 284, 259, 43);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.BOLD, 30));
		t3.setColumns(10);
		t3.setBounds(256, 281, 259, 43);
		f.getContentPane().add(t3);
		
		JButton btnNewButton_1_1 = new JButton("\uB450\uACFC\uBAA9\uC758 \uD3C9\uADE0 \uC810\uC218\uB294");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// s4, s4 평균값 구하기
				String s3 = t3.getText();
				String s4 = t4.getText(); //t3, t4 입력값 String s3, s4로 전환하여 가져오기(모든 입력값은 스트링이므로)
				int sum = Integer.parseInt(s3) + Integer.parseInt(s4); //s3, s4 합계값 숫자로 가져오기
				double avg = (double)sum / 2; 
				//평균 값은 소수점 두자리까지 나오도록 double 적어주기, 하나라도 double 일 경우 다른한쪽도 double 해주기
				JOptionPane.showMessageDialog(f, "두 과목의 평균값은" + avg +" 입니다.");	
			}
		});
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_1_1.setBounds(37, 404, 478, 43);
		f.getContentPane().add(btnNewButton_1_1);
		
		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.BOLD, 30));
		t4.setColumns(10);
		t4.setBounds(256, 346, 259, 43);
		f.getContentPane().add(t4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\uC218\uD559\uC810\uC218");
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1_1_1.setBounds(27, 349, 259, 43);
		f.getContentPane().add(lblNewLabel_1_1_1);
		f.setVisible(true);

	}
}
