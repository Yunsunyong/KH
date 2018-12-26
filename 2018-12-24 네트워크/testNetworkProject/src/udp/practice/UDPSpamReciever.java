package udp.practice;

import java.net.*;
import java.io.*;

public class UDPSpamReciever {
	// 무작위로 전송된 스팸메세지 받아서 출력하는 프로그램
	// 무한루프로 전송온 패킷 정보를
	// 계속 받아 출력하는 프로그램임.
	public static void reciever() {
		try {
			DatagramSocket uclient = new DatagramSocket(4502);
			DatagramPacket packet = null;
			
			byte[] recieveMsg = new byte[1024];
			
			while(true) {
				packet = new DatagramPacket(recieveMsg, 1024);
				uclient.receive(packet);
				String message = new String(recieveMsg);
				System.out.println("받은 메세지 : " + message);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		reciever();
	}
}
