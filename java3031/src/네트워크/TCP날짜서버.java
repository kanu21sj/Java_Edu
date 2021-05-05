package 네트워크;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TCP날짜서버 {

	public static void main(String[] args) throws Exception {
		//TCP서버 소캣 클래스 생성
		ServerSocket server = new ServerSocket(9000);
		System.out.println("서버 소캣 시작, 클라이언트 요청 기다리는 중...");
		
		//while문 사용하여 서버가 끊키기 않고 계속 유지될 수 있도록 설정
		while (true) {
			//클라이언트와 통신하기 위한 socket클래스 생성 및 accpet메서드 사용, 클라이언트 연결 승인
			Socket socket = server.accept();
			System.out.println("서버가 클라이언트 요청을 승인함");
			//PrintWriter: 기본 데이터형이나 객체를 쓰기위한 클래스
			//getOutputStream: 소켓을 통해서 클라이언트로 데이터를 보내줌
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			//스레드 사용하여 0.1초당 한번씩 연결 허용토록 승인
			Thread.sleep(100);
			//Date 메서드를 String 형태로 형변환
			out.print(new Date().toString());
			//클라이언트로 데이터 보내주는 것 중단
			out.close();
			////클라이언트와 연결된 소켓 중단
			socket.close();
		}
	}

}
