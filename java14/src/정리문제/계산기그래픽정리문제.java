package 정리문제;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계산기그래픽정리문제 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(192, 192, 192));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Number 2");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 287, 172, 48);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Number 1");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_1.setBounds(0, 209, 172, 48);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setFont(new Font("굴림", Font.BOLD, 25));
		t1.setColumns(10);
		t1.setBounds(154, 210, 141, 47);
		f.getContentPane().add(t1);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.out.println("더하기 버튼 클릭");
			String s1 = t1.getText(); //t1에 입력된 값을 String타입 s1으로 저장
			String s2 = t2.getText(); //t2에 입력된 값을 String타입 s2으로 저장
			//int i1 = Integer.parseInt(t1.getText()); -> 더 간략한 방법
			int i1 = Integer.parseInt(s1); //String s1 값을 int로 변환하여 i1 변수에 저장
			int i2 = Integer.parseInt(s2); //String s2 값을 int로 변환하여 i2 변수에 저장
			계산기 cal = new 계산기(); //new 함수 사용하여 계산기 클래스 불러옴
			int result = cal.add(i1, i2); //계산기 클래스안의 add메서드를 사용, 결과값을 int로 변환하여 result에 저장
			t3.setText("더한 값은 " + result); //결과값을 t3에 출력
			//계산기 클래스의 public int add 중 (void) -> int로 해주어야 함(값을 불러오기 때문에 void가 아님)
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBounds(324, 210, 66, 58);
		f.getContentPane().add(btnNewButton);
		
		t2 = new JTextField();
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setFont(new Font("굴림", Font.BOLD, 25));
		t2.setColumns(10);
		t2.setBounds(154, 292, 141, 47);
		f.getContentPane().add(t2);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("빼기 버튼 클릭");
				String s1 = t1.getText(); //t1에 입력된 값을 String타입 s1으로 저장
				String s2 = t2.getText(); //t2에 입력된 값을 String타입 s2으로 저장
				
				int i1 = Integer.parseInt(s1); //String s1 값을 int로 변환하여 i1 변수에 저장
				int i2 = Integer.parseInt(s2); //String s2 값을 int로 변환하여 i2 변수에 저장
				계산기 cal = new 계산기(); //new 함수 사용하여 계산기 클래스 불러옴
				int result = cal.minus(i1, i2); //계산기 클래스안의 minus 메서드를 사용, 결과값을 int로 변환하여 result에 저장
				t3.setText("뺀 값은 " + result); //결과값을 t3에 출력
				//계산기 클래스의 public int minus 중 (void) -> int로 해주어야 함(값을 불러오기 때문에 void가 아님)
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1.setBounds(402, 209, 66, 58);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("곱하기 버튼 클릭");
				String s1 = t1.getText(); //t1에 입력된 값을 String타입 s1으로 저장
				String s2 = t2.getText(); //t2에 입력된 값을 String타입 s2으로 저장
				
				int i1 = Integer.parseInt(s1); //String s1 값을 int로 변환하여 i1 변수에 저장
				int i2 = Integer.parseInt(s2); //String s2 값을 int로 변환하여 i2 변수에 저장
				계산기 cal = new 계산기(); //new 함수 사용하여 계산기 클래스 불러옴
				int result = cal.mul(i1, i2); //계산기 클래스안의 mul 메서드를 사용, 결과값을 int로 변환하여 result에 저장
				t3.setText("곱한 값은 " + result); //결과값을 t3에 출력
				//계산기 클래스의 public int mul 중 (void) -> int로 해주어야 함(값을 불러오기 때문에 void가 아님)
			}
		});
		btnX.setFont(new Font("굴림", Font.BOLD, 20));
		btnX.setBounds(324, 281, 66, 58);
		f.getContentPane().add(btnX);
		
		JButton btnNewButton_1_1 = new JButton("/");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("나누기 버튼 클릭");
				String s1 = t1.getText(); //t1에 입력된 값을 String타입 s1으로 저장
				String s2 = t2.getText(); //t2에 입력된 값을 String타입 s2으로 저장
				
				int i1 = Integer.parseInt(s1); //String s1 값을 int로 변환하여 i1 변수에 저장
				int i2 = Integer.parseInt(s2); //String s2 값을 int로 변환하여 i2 변수에 저장
				계산기 cal = new 계산기(); //new 함수 사용하여 계산기 클래스 불러옴
				int result = cal.div(i1, i2); //계산기 클래스안의 div 메서드를 사용, 결과값을 int로 변환하여 result에 저장
				t3.setText("나눈 값은 " + result);//결과값을 t3에 출력
				//계산기 클래스의 public int div 중 (void) -> int로 해주어야 함(값을 불러오기 때문에 void가 아님)
			}
		});
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(402, 280, 66, 58);
		f.getContentPane().add(btnNewButton_1_1);
		
		t3 = new JTextField();
		t3.setForeground(new Color(0, 0, 0));
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setFont(new Font("굴림", Font.BOLD, 30));
		t3.setColumns(10);
		t3.setBounds(25, 113, 443, 58);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel_1_1 = new JLabel("RESULT");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(154, 46, 172, 48);
		f.getContentPane().add(lblNewLabel_1_1);
		f.setVisible(true);

	}

}
