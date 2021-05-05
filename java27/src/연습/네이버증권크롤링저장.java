package 연습;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버증권크롤링저장 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JButton t1 = new JButton("모나리자");
		t1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connection con = Jsoup.connect("https://finanace.naver.com/item/main.nhn?code=");
				
				//외부 데이터 가져오기 위한 try문 실행
				try {
					Document doc = con.get(); //연결한 사이트에 html 문서로 받아오기
					Elements anav = doc.select("div.today p.no_today"); //html 문서에서 특정 요소만 가져오기
					FileWriter f1 = new FileWriter("c:/data/naver_증권.txt"); //html문서 저장하기 위한 FileWriter호출 및 스트림(경로)지정
					for (int i = 0; i < anav.size(); i++) { //for문으로 각각의 데이터들 가져옴
						f1.write((i+1) + ": " + anav.get(i).text() + "\n");
					}
					f1.close(); //자원해제(close)
					JOptionPane.showMessageDialog(f, "저장성공");
				} catch (IOException e1) {
					
				}
				
			}
		});
		t1.setFont(new Font("굴림", Font.BOLD, 20));
		t1.setBounds(50, 37, 150, 45);
		f.getContentPane().add(t1);
		
		JButton t2 = new JButton("삼성전자");
		t2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connection con = Jsoup.connect("https://finanace.naver.com/item/main.nhn?code=");
				
				//외부 데이터 가져오기 위한 try문 실행
				try {
					Document doc = con.get(); //연결한 사이트에 html 문서로 받아오기
					Elements anav = doc.select("div.today p.no_today"); //html 문서에서 특정 요소만 가져오기
					FileWriter f1 = new FileWriter("c:/data/naver_증권.txt"); //html문서 저장하기 위한 FileWriter호출 및 스트림(경로)지정
					for (int i = 0; i < anav.size(); i++) { //for문으로 각각의 데이터들 가져옴
						f1.write((i+1) + ": " + anav.get(i).text() + "\n");
					}
					f1.close(); //자원해제(close)
					JOptionPane.showMessageDialog(f, "저장성공");
				} catch (IOException e1) {
					
				}
			}
		});
		t2.setFont(new Font("굴림", Font.BOLD, 20));
		t2.setBounds(290, 37, 150, 45);
		f.getContentPane().add(t2);
		
		JButton t3 = new JButton("현대자동차");
		t3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connection con = Jsoup.connect("https://finanace.naver.com/item/main.nhn?code=");
				
				//외부 데이터 가져오기 위한 try문 실행
				try {
					Document doc = con.get(); //연결한 사이트에 html 문서로 받아오기
					Elements anav = doc.select("div.today p.no_today"); //html 문서에서 특정 요소만 가져오기
					FileWriter f1 = new FileWriter("c:/data/naver_증권.txt"); //html문서 저장하기 위한 FileWriter호출 및 스트림(경로)지정
					for (int i = 0; i < anav.size(); i++) { //for문으로 각각의 데이터들 가져옴
						f1.write((i+1) + ": " + anav.get(i).text() + "\n");
					}
					f1.close(); //자원해제(close)
					JOptionPane.showMessageDialog(f, "저장성공");
				} catch (IOException e1) {
					
				}
			}
		});
		t3.setFont(new Font("굴림", Font.BOLD, 20));
		t3.setBounds(50, 110, 150, 45);
		f.getContentPane().add(t3);
		
		JButton t4 = new JButton("SK하이닉스");
		t4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connection con = Jsoup.connect("https://finanace.naver.com/item/main.nhn?code=");
				
				//외부 데이터 가져오기 위한 try문 실행
				try {
					Document doc = con.get(); //연결한 사이트에 html 문서로 받아오기
					Elements anav = doc.select("div.today p.no_today"); //html 문서에서 특정 요소만 가져오기
					FileWriter f1 = new FileWriter("c:/data/naver_증권.txt"); //html문서 저장하기 위한 FileWriter호출 및 스트림(경로)지정
					for (int i = 0; i < anav.size(); i++) { //for문으로 각각의 데이터들 가져옴
						f1.write((i+1) + ": " + anav.get(i).text() + "\n");
					}
					f1.close(); //자원해제(close)
					JOptionPane.showMessageDialog(f, "저장성공");
				} catch (IOException e1) {
					
				}
			}
		});
		t4.setFont(new Font("굴림", Font.BOLD, 20));
		t4.setBounds(290, 110, 150, 45);
		f.getContentPane().add(t4);
		
		JButton t5 = new JButton("셀트리온");
		t5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connection con = Jsoup.connect("https://finanace.naver.com/item/main.nhn?code=");
				
				//외부 데이터 가져오기 위한 try문 실행
				try {
					Document doc = con.get(); //연결한 사이트에 html 문서로 받아오기
					Elements anav = doc.select("div.today p.no_today"); //html 문서에서 특정 요소만 가져오기
					FileWriter f1 = new FileWriter("c:/data/naver_증권.txt"); //html문서 저장하기 위한 FileWriter호출 및 스트림(경로)지정
					for (int i = 0; i < anav.size(); i++) { //for문으로 각각의 데이터들 가져옴
						f1.write((i+1) + ": " + anav.get(i).text() + "\n");
					}
					f1.close(); //자원해제(close)
					JOptionPane.showMessageDialog(f, "저장성공");
				} catch (IOException e1) {
					
				}
			}
		});
		t5.setFont(new Font("굴림", Font.BOLD, 20));
		t5.setBounds(50, 186, 150, 45);
		f.getContentPane().add(t5);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(50, 260, 390, 163);
		f.getContentPane().add(textArea);
		f.setVisible(true);

	}
}
