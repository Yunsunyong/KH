package udp.practice;

import java.net.*;
import java.io.*;

public class UDPSpamSender {
	// 192.168.30.*
	// 무작위로 10개의 ip 에
	// 스팸 메세지를 전송하는 프로그램 작성
	public static void sender() {
		int port = 4502;
		try {
			DatagramSocket dso = new DatagramSocket(port);
			DatagramPacket packet = null;
			
			String[] str = new String[10];
			for(int i = 0; i < str.length; i++) {
				//str[i] = "192.168.30." + ((int)(Math.random()*256) + 1);
				str[i] = "192.168.30.72";
			}
			String message = "스팸메세지 전송~~";
			byte[] sendMsg = message.getBytes();
			
			for(int i = 0; i < str.length; i++) {
				packet = new DatagramPacket(sendMsg, 0, sendMsg.length, InetAddress.getByName(str[i]), port);
				dso.receive(packet);
				System.out.println(str[i] + "로 보냄...");
			}
			dso.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		sender();
	}

}
