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

public class 나의그래픽4 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.getContentPane().setLayout(null);//정해진 위치가 아니라 내가 원하는 위치에 배열
		
		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("굴림", Font.BOLD, 40));
		t1.setBounds(293, 44, 252, 58); //위치 내가 원하는 위치로 잡는것
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("굴림", Font.BOLD, 40));
		t2.setColumns(10);
		t2.setBounds(293, 114, 252, 58);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("\uB354\uD558\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//1. 입력한 t1, t2값을 가지고 와야한다.
				//외부에서 입력한 데이터의 타입은 모두 String!!
				String s1 = t1.getText(); //"200"
				String s2 = t2.getText(); //"100"
				System.out.println(s1 + s2); 
				//System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2)) -> 숙달된 방법
				//자바에서는 +(더하기) 연산자 사용시 하나라도 String이면 결합의 의미!
				//String -> int로 바꾸어주어야 함.
				//부품 기본형 간에 cpu가 하는 캐스팅은 불가능!
				//바꾸어주는 부품을 써야한다.(Integer)
				int n1 = Integer.parseInt(s1);//"200" -> 200 숫자로 변경해줌
				int n2 = Integer.parseInt(s2);
				System.out.println(n1 + n2);
				
				}
				//3. 결과를 출력
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 50));
		btnNewButton.setBounds(31, 242, 514, 89);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uC22B\uC7901 : ");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 40));
		lblNewLabel.setBounds(31, 44, 209, 58);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC22B\uC7902 : ");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 40));
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
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 50));
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(31, 343, 514, 89);
		f.getContentPane().add(btnNewButton_1);
		f.setSize(600, 600);
		f.setVisible(true);

	}
}
