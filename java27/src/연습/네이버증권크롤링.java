package 연습;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 네이버증권크롤링 {

	public static void main(String[] args) throws IOException {
		
		String site = "https://finanace.naver.com/item/main.nhn?code=";
		String [] name = {"모나리자", "삼성전자", "현대자동차", "SK하이닉스", "셀트리온"};
		String [] company = {"012690", "005930", "005380", "000660", "068270"};
		
		//배열반복
		for (int i = 0; i < company.length; i++) {
			Connection con = Jsoup.connect(site + company[i]);
			Document doc = con.get();
			String date = doc.select("em.date").text();
			
			//장마감을 짤라보자
			String date2 = date.substring(0, 10);
			System.out.println(date2);
			System.out.println("회사명: " + name[i]);
			
			String today = doc.select("span.blind").get(12).text();
			System.out.println("오늘가: " + today);
			String yesterday = doc.select("span.blind").get(15).text();
			System.out.println("어제가: " + yesterday);
			String high = doc.select("span.blind").get(16).text();
			System.out.println("고   가: " + high);
			
			System.out.println("------------------------------------");
			
			FileWriter f = new FileWriter("c:/data/" + date2 + "-" + name[i] + ".txt");
			f.write("날짜: " + date2 + "\n");
			f.write("이름: " + name[i] + "\n");
			f.write("오늘: " + today + "\n");
			f.write("어제: " + yesterday + "\n");
			f.write("고가: " + high + "\n");
			f.close();
		}
	}
}
