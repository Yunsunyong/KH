package test.iphost;

import java.net.*;
import java.util.*;

public class TestInetAddress3 {

	public static void searchIP() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("도메인명 : ");
		String domains = sc.next();
		
		try {
		InetAddress[] inet = InetAddress.getAllByName(domains);
		System.out.println("조회한 호스트의 서버 갯수 : " + inet.length);
		for(InetAddress i : inet) {
			System.out.println(i.toString());
		}
		
		
		}catch(UnknownHostException e) {
			System.out.println("도메인주소가 잘못됬습니다.");
		}
	} 
	
	
	public static void main(String[] args) {
		// 키보드로 도메인명을 입력받아서
		// 해당 호스트 서버의 모든 ip 주소 조회
		// 조회된 아이디 주소와 호스트명 출력 처리
		searchIP();
		
		
	}

}
