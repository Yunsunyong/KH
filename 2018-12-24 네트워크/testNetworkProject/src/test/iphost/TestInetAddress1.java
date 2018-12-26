package test.iphost;

import java.net.*;

public class TestInetAddress1 {

	public static void main(String[] args) {
		// java.net.InetAddress class test
		
		try {
		//host name : domain name
		InetAddress neverIP = InetAddress.getByName("www.naver.com");
		System.out.println("네이버 웹서버의 ip주소 : " + neverIP);
		System.out.println("네이버 웹서버의 ip주소 : " + neverIP.getHostAddress()); //IP주소만 확인
		InetAddress[] googles = InetAddress.getAllByName("www.google.com");
		System.out.println("google 웹서버 갯수 : " + googles.length);
		for(InetAddress inet : googles) {
			System.out.println(inet.getHostAddress());//6개도 나올수 있고 안나올수도 있다.
		}
		
		InetAddress[] navers = InetAddress.getAllByName("www.naver.com");
		System.out.println("naver 웹서버 갯수 : " + navers.length);
		for(InetAddress inet1 : navers) {
			System.out.println(inet1.getHostAddress());
		}
		InetAddress[] daums = InetAddress.getAllByName("www.daum.net");
		System.out.println("daum 웹서버 갯수 : " + daums.length);
		for(InetAddress inet2 : daums) {
			System.out.println(inet2.getHostAddress());
		}
		
		InetAddress myIp = InetAddress.getLocalHost(); //내컴퓨터의 내 ip주소 조회메소드
		System.out.println("내 컴퓨터 ip 주소 : " + myIp.getHostAddress());
		
		}catch(UnknownHostException e) {
			System.out.println("도메인명이 틀렸습니다.");
			System.out.println("학인하고 다시 실행하세요.");
		}
	}

}
