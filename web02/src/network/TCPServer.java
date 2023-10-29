package network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		// 전화기 역할을 하는 객체(socket)
		// 승인용 socket(ServerSocket)
		// 데이터 교환용 socket
		// 서버가 승인하면 socket이 생성됨
		ServerSocket server = new ServerSocket(9100);
		System.out.println("포트 9100 TCP서버 시작...");
		System.out.println("클라이언트의 요청을 기다리는중입니다...");
		int cnt = 0;
		while (true) {
			Socket socket = server.accept();// 클라이언트 연결 요청을 승인해주는 것
			System.out.println("서버가 승인하였습니다...");
			cnt++;
			System.out.println("현재 연결된 클라이언트 수 " + cnt + "개");
		}
	}

}
