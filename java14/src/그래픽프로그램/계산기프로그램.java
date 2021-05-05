package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;

import 클래스연습.계산기;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계산기프로그램 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(66, 24, 187, 42);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setForeground(Color.RED);
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBounds(267, 25, 174, 42);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setBounds(66, 96, 187, 42);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setForeground(Color.RED);
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBounds(267, 96, 174, 42);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("더하기 버튼 클릭됨.");
				//t1, t2에 입력한 값을 가지고 와야함.
				String s1 = t1.getText(); //입력한 값을 s1 변수에 저장
				String s2 = t2.getText(); //입력한 값을 s2 변수에 저장
				System.out.println(s1); //프린트하여 입력값을 출력
				System.out.println(s2); //프린트하여 입력값을 출력
				
				//String을 int로 변환해주어야 함.
				//반환값이 있어야지만 변수에 결과값을 넣을 수 있음.
				int i1 = Integer.parseInt(s1); //String으로 저장한 s1 값을 int로 변환하여 i1에 저장
				int i2 = Integer.parseInt(s2); //String으로 저장한 s2 값을 int로 변환하여 i2에 저장
				//int result = cal.add(i1, i2);
				계산기 cal = new 계산기(); //계산기 클래스 주소 불러옴
				int result = cal.add(i1, i2); //계산기 클래스 안의 add메서드 사용하여 i1 + i2 값 계산
				//반환값이 있어야 프린트도 가능하고
				//변수에 결과값을 넣을 수 있다.
				t3.setText("더한 값은 " + result);
			}
		});
		btnNewButton.setBounds(53, 228, 84, 165);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("빼기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("빼기 버튼 클릭됨.");
				//t1, t2에 입력한 값을 가지고 와야함.
				String s1 = t1.getText(); //입력한 값을 가져와서 String 타입으로 변수 s1에 저장
				String s2 = t2.getText(); //입력한 값을 가져와서 String 타입으로 변수 s2에 저장
				System.out.println(s1); //입력값 s1 출력
				System.out.println(s2); //입력값 s1 출력
				
				//String을 int로 변환해주어야 함.
				//반환값이 있어야지만 변수에 결과값을 넣을 수 있음.
				int i1 = Integer.parseInt(s1); //String 타입 s1 값을 int 타입으로 변환하여 i1에 저장
				int i2 = Integer.parseInt(s2); //String 타입 s2 값을 int 타입으로 변환하여 i2에 저장
				계산기 cal = new 계산기(); //계산기 클래스 불러옴
				int result = cal.minus(i1, i2); //계산기 클래스 안의 minus메서드 사용하여 i1 - i2 값 계산
				t3.setText("뺀 값은 " + result);
			}
		});
		btnNewButton_1.setBounds(156, 228, 84, 165);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("나누기");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("나누기 버튼 클릭됨.");
				//t1, t2에 입력한 값을 가지고 와야함.
				String s1 = t1.getText(); //"200"
				String s2 = t2.getText(); //"100"
				System.out.println(s1);
				System.out.println(s2);
				
				//String을 int로 변환해주어야 함.
				//반환값이 있어야지만 변수에 결과값을 넣을 수 있음.
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				계산기 cal = new 계산기();
				int result = cal.div(i1, i2);
				t3.setText("나눈 값은 " + result);
			}
		});
		btnNewButton_1_1.setBounds(357, 228, 84, 165);
		f.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("곱하기");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("곱하기 버튼 클릭됨.");
				//t1, t2에 입력한 값을 가지고 와야함.
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println(s1);
				System.out.println(s2);
				
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				계산기 cal = new 계산기();
				int result = cal.mul(i1, i2); 
				//f.setTitle("곱한 값은 " + result);
				t3.setText("곱한 값은 " + result);
			}
		});
		btnNewButton_2.setBounds(254, 228, 84, 165);
		f.getContentPane().add(btnNewButton_2);
		
		t3 = new JTextField();
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setBackground(new Color(221, 160, 221));
		t3.setForeground(Color.YELLOW);
		t3.setFont(new Font("굴림", Font.BOLD, 30));
		t3.setColumns(10);
		t3.setBounds(76, 161, 328, 42);
		f.getContentPane().add(t3);
		f.setVisible(true);
	}
}
