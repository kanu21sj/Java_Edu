package ���ǹ�;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ���Ǳ׷���4 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.getContentPane().setLayout(null);//������ ��ġ�� �ƴ϶� ���� ���ϴ� ��ġ�� �迭
		
		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("����", Font.BOLD, 40));
		t1.setBounds(293, 44, 252, 58); //��ġ ���� ���ϴ� ��ġ�� ��°�
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("����", Font.BOLD, 40));
		t2.setColumns(10);
		t2.setBounds(293, 114, 252, 58);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("\uB354\uD558\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//1. �Է��� t1, t2���� ������ �;��Ѵ�.
				//�ܺο��� �Է��� �������� Ÿ���� ��� String!!
				String s1 = t1.getText(); //"200"
				String s2 = t2.getText(); //"100"
				System.out.println(s1 + s2); 
				//System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2)) -> ���޵� ���
				//�ڹٿ����� +(���ϱ�) ������ ���� �ϳ��� String�̸� ������ �ǹ�!
				//String -> int�� �ٲپ��־�� ��.
				//��ǰ �⺻�� ���� cpu�� �ϴ� ĳ������ �Ұ���!
				//�ٲپ��ִ� ��ǰ�� ����Ѵ�.(Integer)
				int n1 = Integer.parseInt(s1);//"200" -> 200 ���ڷ� ��������
				int n2 = Integer.parseInt(s2);
				System.out.println(n1 + n2);
				
				}
				//3. ����� ���
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("����", Font.BOLD, 50));
		btnNewButton.setBounds(31, 242, 514, 89);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uC22B\uC7901 : ");
		lblNewLabel.setFont(new Font("����", Font.BOLD, 40));
		lblNewLabel.setBounds(31, 44, 209, 58);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC22B\uC7902 : ");
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 40));
		lblNewLabel_1.setBounds(31, 115, 252, 58);
		f.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("\uBE7C   \uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s3 = t1.getText(); 
				String s4 = t2.getText(); 
				
				int n3 = Integer.parseInt(s3);
				int n4 = Integer.parseInt(s4);
				System.out.println(n3 - n4);
				
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("����", Font.BOLD, 50));
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(31, 343, 514, 89);
		f.getContentPane().add(btnNewButton_1);
		f.setSize(600, 600);
		f.setVisible(true);

	}
}
