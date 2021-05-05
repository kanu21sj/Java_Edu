package 크롤링;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 크롤링해서저장 {

	public static void open(String[] args) {
		
		//1. 사이트에 연결
		Connection con = Jsoup.connect("https://movie.naver.com/movie/running/current.nhn");
		
		//2.외부 데이터 가져오기 위한 try문 실행
		try {
			//3. 연결한 사이트에 html 문서로 받아오기
			Document doc = con.get();
			//4. html 문서에서 특정 요소만 가져오기
			Elements anav = doc.select("dt.tit a");
			//5. 가져온 html문서 저장하기 위한 FileWriter호출 및 스트림(경로)지정
			FileWriter f = new FileWriter("c:/data/naver_title.txt");
			//6. for문으로 각각의 데이터들 가져옴
			for (int i = 0; i < anav.size(); i++) {
				f.write((i+1) + ": " + anav.get(i).text() + "\n");
			}
			//7. 자원해제(close)
			f.close();
		} catch (IOException e) {
			
		}
		
		try {
			//3. 연결한 사이트에 html 문서로 받아오기
			Document doc = con.get();
			//4. html 문서에서 특정 요소만 가져오기
			Elements anav = doc.select("dl.info_star span.num");
			//5. 가져온 html문서 저장하기 위한 FileWriter호출 및 스트림(경로)지정
			FileWriter f = new FileWriter("c:/data/naver_rank.txt");
			//6. for문으로 각각의 데이터들 가져옴
			for (int i = 0; i < anav.size(); i++) {
				f.write((i+1) + ": " + anav.get(i).text() + "\n");
			}
			//7. 자원해제(close)
			f.close();
		} catch (IOException e) {
			
		}
	}
}