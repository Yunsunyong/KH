package test.properties;

import java.io.*;
import java.util.*;

public class TestProperties1 {

	public static void main(String[] args) {
		// Properties test
		Properties prop = new Properties();
		
		prop.setProperty("driver", "oracle.jdbc.dirver.OracleDriver");
		prop.setProperty("url", "jdbc:oracle:thin:@127.0.0.1:1521:xe");
		prop.setProperty("user", "user007");
		prop.setProperty("password", "pass007");
	
		prop.list(System.out);  //콘솔에 출력
		
		System.out.println("==================");
		System.out.println(prop.getProperty("driver"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("user"));
		System.out.println(prop.getProperty("password"));
		
		System.out.println("==================");
		
		//파일에 기록 저장
		
		try {
			prop.store(new FileWriter("setting.txt"), "jdbc dirver setting file");
			prop.storeToXML(new FileOutputStream("setting.xml"), "jdbc oracle setting");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
