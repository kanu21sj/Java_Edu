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

public class ���Ǳ׷���5 {
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
		lblNewLabel.setFont(new Font("����", Font.BOLD, 30));
		lblNewLabel.setBounds(27, 30, 259, 43);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("����", Font.BOLD, 30));
		t1.setBounds(256, 27, 259, 43);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("\uC5B4\uB514\uB85C \uAC08\uAE4C\uC694?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//t1 �԰� ���� ����
				String s1 = t1.getText(); //�Է��� �� t1 �����ͼ� string s1���� ��ȯ(��� �Է°��� ��Ʈ���̹Ƿ�)
				
				if (s1.equals("«��")) {
					JOptionPane.showMessageDialog(f, "�߱������� ������!"); //«��, ��鿡 ���� ����ͷ� ���
				} else if (s1.equals("���")) {
					JOptionPane.showMessageDialog(f, "�н������� ������!");				
				} else {
					JOptionPane.showMessageDialog(f, "�ƹ��ų� �弼��!");
				}
			}
		});
		btnNewButton.setFont(new Font("����", Font.BOLD, 30));
		btnNewButton.setBounds(37, 85, 478, 43);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("\uB2F9\uC2E0\uC758 \uB098\uC774\uB294");
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 30));
		lblNewLabel_1.setBounds(27, 159, 259, 43);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setFont(new Font("����", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBounds(256, 156, 259, 43);
		f.getContentPane().add(t2);
		
		JButton btnNewButton_1 = new JButton("\uB2F9\uC2E0\uC758 \uB0B4\uB144 \uB098\uC774\uB294");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//t2 ����� ���� ���̴�
				String s2 = t2.getText(); // �Է°� t2 �����ͼ� String s2�� ��ȯ(��� �Է°��� ��Ʈ���̹Ƿ�)
				int age = Integer.parseInt(s2);
				JOptionPane.showMessageDialog(f, "���� ���̴� " + (age + 1) +" �� �Դϴ�."); 
				//����� �ϱ� ���ؼ� String s2�� Integer.parseInt ������ ��ȯ -> ����ͷ� ���
			}
		});
		btnNewButton_1.setFont(new Font("����", Font.BOLD, 30));
		btnNewButton_1.setBounds(37, 214, 478, 43);
		f.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uAD6D\uC5B4\uC810\uC218");
		lblNewLabel_1_1.setFont(new Font("����", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(27, 284, 259, 43);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t3 = new JTextField();
		t3.setFont(new Font("����", Font.BOLD, 30));
		t3.setColumns(10);
		t3.setBounds(256, 281, 259, 43);
		f.getContentPane().add(t3);
		
		JButton btnNewButton_1_1 = new JButton("\uB450\uACFC\uBAA9\uC758 \uD3C9\uADE0 \uC810\uC218\uB294");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// s4, s4 ��հ� ���ϱ�
				String s3 = t3.getText();
				String s4 = t4.getText(); //t3, t4 �Է°� String s3, s4�� ��ȯ�Ͽ� ��������(��� �Է°��� ��Ʈ���̹Ƿ�)
				int sum = Integer.parseInt(s3) + Integer.parseInt(s4); //s3, s4 �հ谪 ���ڷ� ��������
				double avg = (double)sum / 2; 
				//��� ���� �Ҽ��� ���ڸ����� �������� double �����ֱ�, �ϳ��� double �� ��� �ٸ����ʵ� double ���ֱ�
				JOptionPane.showMessageDialog(f, "�� ������ ��հ���" + avg +" �Դϴ�.");	
			}
		});
		btnNewButton_1_1.setFont(new Font("����", Font.BOLD, 30));
		btnNewButton_1_1.setBounds(37, 404, 478, 43);
		f.getContentPane().add(btnNewButton_1_1);
		
		t4 = new JTextField();
		t4.setFont(new Font("����", Font.BOLD, 30));
		t4.setColumns(10);
		t4.setBounds(256, 346, 259, 43);
		f.getContentPane().add(t4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\uC218\uD559\uC810\uC218");
		lblNewLabel_1_1_1.setFont(new Font("����", Font.BOLD, 30));
		lblNewLabel_1_1_1.setBounds(27, 349, 259, 43);
		f.getContentPane().add(lblNewLabel_1_1_1);
		f.setVisible(true);

	}
}
