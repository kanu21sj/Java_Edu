package 파일저장;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Diary {
	private static JTextField t1;
	private static JTextField t2;

	public void open() {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.getContentPane().setForeground(Color.BLACK);
		f.setSize(350, 500);
		f.getContentPane().setLayout(null);
		
		JLabel date = new JLabel("오늘의 날짜");
		date.setBounds(14, 65, 120, 29);
		date.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(date);
		
		JLabel title = new JLabel("오늘의 제목");
		title.setBounds(14, 115, 120, 29);
		title.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(title);
		
		JLabel content = new JLabel("오늘의 내용");
		content.setBounds(14, 225, 120, 29);
		content.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(content);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("굴림", Font.BOLD, 20));
		t1.setBounds(145, 61, 170, 34);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 20));
		t2.setForeground(Color.BLUE);
		t2.setBounds(145, 112, 170, 34);
		t2.setColumns(10);
		f.getContentPane().add(t2);
		
		JTextArea textArea = new JTextArea();
		
		JButton bottom = new JButton("파일에 일기 저장");
		bottom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e2) {
				
				String s1 = t1.getText(); //날짜
				String s2 = t2.getText(); //제목
				String s3 = textArea.getText(); //내용
				
				try {
					//스트림의 특징은 한 방향!!
					FileWriter file = new FileWriter("c:/data/" + s1 + ".txt");
					file.write(s1 + "\n");
					file.write(s2 + "\n");
					file.write(s3 + "\n");
					file.close(); //스트림을 다 쓰고 나서는 반드시 자원해제!(close)
					JOptionPane.showMessageDialog(f, "파일에 저장 성공");
				} catch (IOException e) {
					System.out.println("파일로 저장 중 에러발생");
					System.out.println("에러 정보는 " + e.getMessage());
				}
			}
		});
		bottom.setForeground(Color.BLUE);
		bottom.setBackground(Color.MAGENTA);
		bottom.setFont(new Font("굴림", Font.BOLD, 25));
		bottom.setBounds(33, 365, 270, 54);
		f.getContentPane().add(bottom);
		
		textArea.setLineWrap(true);
		textArea.setFont(new Font("굴림", Font.BOLD, 20));
		textArea.setForeground(Color.BLUE);
		textArea.setColumns(10);
		textArea.setRows(5);
		textArea.setBounds(145, 192, 170, 139);
		f.getContentPane().add(textArea);
		f.setVisible(true);

	}
}
