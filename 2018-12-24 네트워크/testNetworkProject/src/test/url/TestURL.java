package test.url;

import java.net.*;

public class TestURL {

	public static void main(String[] args) {
		// java.net.URL class test
		// URL 객체는 url 정보를 가지고 있음
		String urlStr = "https://www.oracle.com/technetwork/java/javase/downloads/index.html";
															///technetwork/java/javase/ << 폴더명
		try {
			URL url = new URL(urlStr);
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("호스트명 : " + url.getHost());
			System.out.println("경로정보 : " + url.getPath());
			System.out.println("연결된 파일 : " + url.getFile());
			System.out.println("포트번호 : " + url.getPort());  //대부분 사이트의 포트번호는 조회 불가능
			System.out.println("쿼리스트링 : " + url.getQuery()); 
			System.out.println("참조이름 : " + url.getRef()); //#뒤로 붙은 정보
			
			String host = url.getHost();
			
			InetAddress[] ipes = InetAddress.getAllByName(host);
			for(InetAddress inet : ipes) {
				System.out.println(inet.toString());
			}
			
		} catch (MalformedURLException | UnknownHostException e) { // | 형제이면 비트연산자 써서 같이 쓰는게 가능
			System.out.println("잘못된 url 입니다.");
		}

	}

}
