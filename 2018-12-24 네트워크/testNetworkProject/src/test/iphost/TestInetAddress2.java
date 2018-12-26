package test.iphost;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress2 {
	
	public static void main(String[] args) throws UnknownHostException {
		// ip 주소로 호스트명 알아내기
		byte[] naverIP = {125, (byte)209, (byte)222, (byte)142}; // byte는 127까지니까 강제형변환 해야함 오버플로우됨
		//ip주소는 바이트배열로 함
		InetAddress naverInet = InetAddress.getByAddress(naverIP);
		System.out.println("알아낸 호스트명 : " + naverInet.getHostName());
		System.out.println("host name : " + naverInet.getCanonicalHostName());
		System.out.println("toString() : " + naverInet.toString());
		//ip주소가 바로 나옴
	}
}
