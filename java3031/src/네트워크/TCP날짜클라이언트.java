package 네트워크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP날짜클라이언트 {

	public static void main(String[] args) throws Exception {
		//for문 사용하여 500개 클라이언트 접속할 수 있도록 허용
		for (int i = 0; i < 500; i++) {
			//TCP날짜서버에서 생성한 소켓에 접속
			Socket socket = new Socket("localhost", 9000);
			System.out.println(i + "번: 클라이언트가 9000포트 서버에 연결을 요청함.");
			
			//getInputStream: 서버에서 보낸 문자 인식이 되지 않은 데이터를 byte 단위로 가져옴
			//InputStreamReader: byte 단위로 읽어 들이는 InputStream을 통해 데이터를 읽어 들여 문자 단위로 읽어 들이는 방식으로 변형시키는 클래스
			//BufferedReader: 문자들을 줄 단위로 가지고 와서 처리
			BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			//buffer내 변수에 저장된 데이터를 읽어온 후 String형의 data에 저장
			String data = buffer.readLine();
			System.out.println("서버로 부터 받은 데이터 >> " + data);
		}

	}

}
