package ���ǹ�;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ���Ǳ׷���2 {
	private static JTextField t1;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(600, 800);
		
		t1 = new JTextField();
		t1.setBackground(Color.WHITE);
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("����", Font.BOLD, 40));
		f.getContentPane().add(t1, BorderLayout.NORTH);
		t1.setColumns(10);
		
		JButton b1 = new JButton("\uB098\uB97C \uB20C\uB7EC\uC694");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();//ȫ�浿 ��������
				JOptionPane.showMessageDialog(f, "����� �Է°��� " + s1);
			}
		});
		b1.setBackground(Color.YELLOW);
		b1.setForeground(Color.BLACK);
		b1.setFont(new Font("����", Font.BOLD, 80));
		f.getContentPane().add(b1, BorderLayout.CENTER);
		f.setVisible(true);
	}

}
