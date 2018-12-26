package test.iphost;

import java.util.*;
import java.net.*;

public class TestInetAddress4 {

	public static void searchIP() {
		//키보드로 호스트명을 입력받아
		//해당 호스트가 가진 IP 주소
		//모두 출력 처리 반복실행함
		//"none" 입력시 종료되게 함
		Scanner sc = new Scanner(System.in);
		String domains = "";
		do {	
			try {
				System.out.print("호스트명 : ");
				domains = sc.next();
				InetAddress[] inet = InetAddress.getAllByName(domains);
				for(InetAddress i : inet) {
					System.out.println(i.getHostAddress());
				}
			} catch (UnknownHostException e) {
				System.out.println("호스트명을 잘못 입력하셨습니다.");
			}
		}while(!domains.equals("none"));
	}
	
	public static void main(String[] args) {
		searchIP();

	}

}
