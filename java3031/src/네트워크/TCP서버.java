package 네트워크;

//import java.lang.*; //System, int 등 관련된 것들 import해줌
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP서버 {

	public static void main(String[] args) throws Exception {
		int count = 0;
		//클라이언트의 요청을 승인해주기 위한 소켓
		ServerSocket server = new ServerSocket(9000);
		System.out.println("서버 소켓 시작됨.");
		System.out.println("클라이언트의 요청을 기다리는 중...");
		while (true) {
			Socket socket = server.accept();
			count++; //count = count + 1; => 증감연산자
			System.out.println("서버가 "+ count + "개의 클라이언트의 요청을 승인함.");
			//전송되는 양이 작아도 보낼 수 있도록 옵션값을 주어 승인해야 함(true)
			//getOutputStream: 소켓을 통해서 클라이언트로 데이터를 보내줌
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			String data = "I am a java programmer!!";
			out.print(data);
			out.close();
			socket.close();
		}
	}

}
