package 정리문제;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계산기그래픽혼자연습 {
	private static JTextField t2;
	private static JTextField t1;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 222, 173));
		f.setSize(600, 400);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Number1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(14, 93, 144, 33);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNumber = new JLabel("Number2");
		lblNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumber.setFont(new Font("굴림", Font.BOLD, 20));
		lblNumber.setBounds(14, 153, 144, 33);
		f.getContentPane().add(lblNumber);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 25));
		t2.setForeground(new Color(255, 99, 71));
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setColumns(10);
		t2.setBounds(166, 150, 127, 36);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("PLUS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int s1 = Integer.parseInt(t1.getText());
				int s2 = Integer.parseInt(t2.getText());
				계산기 cal = new 계산기();
				int result = cal.add(s1, s2);
				t3.setText("Result is " + result);
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBounds(32, 217, 126, 40);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MINUS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int s1 = Integer.parseInt(t1.getText());
				int s2 = Integer.parseInt(t2.getText());
				계산기 cal = new 계산기();
				int result = cal.minus(s1, s2);
				t3.setText("Result is " + result);
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1.setBounds(167, 217, 126, 40);
		f.getContentPane().add(btnNewButton_1);
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setForeground(new Color(255, 99, 71));
		t1.setFont(new Font("굴림", Font.BOLD, 25));
		t1.setColumns(10);
		t1.setBounds(166, 93, 127, 36);
		f.getContentPane().add(t1);
		
		JButton btnMultiply = new JButton("MULTI");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int s1 = Integer.parseInt(t1.getText());
				int s2 = Integer.parseInt(t2.getText());
				계산기 cal = new 계산기();
				int result = cal.mul(s1, s2);
				t3.setText("Result is " + result);
			}
		});
		btnMultiply.setFont(new Font("굴림", Font.BOLD, 20));
		btnMultiply.setBounds(32, 269, 126, 40);
		f.getContentPane().add(btnMultiply);
		
		JButton btnNewButton_1_1 = new JButton("DIVIDE");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int s1 = Integer.parseInt(t1.getText());
				int s2 = Integer.parseInt(t2.getText());
				계산기 cal = new 계산기();
				int result = cal.div(s1, s2);
				t3.setText("Result is " + result);
			}
		});
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(167, 269, 126, 40);
		f.getContentPane().add(btnNewButton_1_1);
		
		t3 = new JTextField();
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setForeground(new Color(255, 0, 0));
		t3.setFont(new Font("굴림", Font.BOLD, 20));
		t3.setBounds(334, 99, 215, 210);
		f.getContentPane().add(t3);
		t3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CALCULATION");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setBounds(32, 26, 261, 40);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("RESULT");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(307, 26, 261, 40);
		f.getContentPane().add(lblNewLabel_1_1);
		
		f.setVisible(true);
	}
}
