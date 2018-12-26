package test.slisub1;

import java.net.*;
import java.io.*;
import java.util.*;

public class TCPServer1 {

	public static void serverStart() {
		// 1. port 번호 정하기
		int port = 7789;
		BufferedReader br = null;
		PrintWriter pw = null;
		ServerSocket server = null;

		try {
			// 2. 서버용 소켓 객체 만들기
			server = new ServerSocket(port);

			while (true) {
				System.out.println("클라이언트 요청을 기다리고 있습니다.");

				Socket client = server.accept();
				System.out.println(client.getInetAddress().getHostAddress());

				InputStream is = client.getInputStream();
				OutputStream os = client.getOutputStream();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		serverStart();
	}
}
