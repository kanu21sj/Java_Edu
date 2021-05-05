package 크롤링;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import javax.swing.JTextArea;

public class 크롤링해서저장2 {
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JButton title = new JButton("영화 제목");
		title.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connection con = Jsoup.connect("https://movie.naver.com/movie/running/current.nhn");
				
				//2.외부 데이터 가져오기 위한 try문 실행
				try {
					//3. 연결한 사이트에 html 문서로 받아오기
					Document doc = con.get();
					//4. html 문서에서 특정 요소만 가져오기
					Elements anav = doc.select("dt.tit a");
					//5. 가져온 html문서 저장하기 위한 FileWriter호출 및 스트림(경로)지정
					FileWriter f1 = new FileWriter("c:/data/naver_title.txt");
					//6. for문으로 각각의 데이터들 가져옴
					for (int i = 0; i < anav.size(); i++) {
						f1.write((i+1) + ": " + anav.get(i).text() + "\n");
					}
					//7. 자원해제(close)
					f1.close();
					JOptionPane.showMessageDialog(f, "영화 제목 저장성공");
				} catch (IOException e1) {
					
				}
			}
		});
		title.setFont(new Font("굴림", Font.BOLD, 30));
		title.setBounds(129, 59, 207, 86);
		f.getContentPane().add(title);
		
		JButton point = new JButton("영화 평점");
		point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con = Jsoup.connect("https://movie.naver.com/movie/running/current.nhn");

				
				try {
					//3. 연결한 사이트에 html 문서로 받아오기
					Document doc = con.get();
					//4. html 문서에서 특정 요소만 가져오기
					Elements anav = doc.select("dl.info_star span.num");
					//5. 가져온 html문서 저장하기 위한 FileWriter호출 및 스트림(경로)지정
					FileWriter f1 = new FileWriter("c:/data/naver_rank.txt");
					//6. for문으로 각각의 데이터들 가져옴
					for (int i = 0; i < anav.size(); i++) {
						f1.write((i+1) + ": " + anav.get(i).text() + "\n");
					}
					//7. 자원해제(close)
					f1.close();
					JOptionPane.showMessageDialog(f, "영화 평점 저장성공");
				} catch (IOException e1) {
					
				}
			}
		});
		point.setFont(new Font("굴림", Font.BOLD, 30));
		point.setBounds(129, 170, 207, 86);
		f.getContentPane().add(point);
		f.setVisible(true);
	}
}
