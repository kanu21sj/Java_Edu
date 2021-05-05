package 스태틱;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버크롤링2 {

	public static void main(String[] args) throws Exception {
		//1. 사이트에 연결하세요.
		//체인식 코드
//		Jsoup.connect("http://www.naver.com").get();
		Connection con = Jsoup.connect("https://movie.naver.com/movie/running/current.nhn");
		
		//2. 연결한 사이트에 html문서를 받아오세요.
		Document doc = con.get();
//		System.out.println(doc);
		Elements anav = doc.select("dt.tit a"); //Elements = ArrayList
//		System.out.println(anav.size());
//		for (Element e : anav) {
//			System.out.println(e.text());
//		}
		for (int i = 0; i < anav.size(); i++) {
			System.out.println((i+1) + " : " + anav.get(i).text());
		}
		
		Elements imgs = doc.getElementsByTag("img");
		if (imgs.size() > 0) {
			String src = imgs.get(0).attr("src");
			System.out.println(src);
		}
		
	}

}
