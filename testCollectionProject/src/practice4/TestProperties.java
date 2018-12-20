package practice4;

import java.util.*;
import java.io.*;

public class TestProperties {

	public Student[] readFile() {
		Properties prop = new Properties();
		
		try {
			prop.load(new FileReader("score.txt"));	
		}catch(IOException e) {
			e.printStackTrace();
		}
		Set<String> keys = prop.stringPropertyNames();
		Student[] sar = new Student[keys.size()];
		Iterator<String> iter = keys.iterator();
		int i = 0;
		while(iter.hasNext()) {
			String key = iter.next();
			String value = prop.getProperty(key);
			String[] values = value.split(",");
			
			int kor = Integer.parseInt(values[2]);
			int eng = Integer.parseInt(values[3]);
			int mat = Integer.parseInt(values[4]);
			int tot = kor+eng+mat;
			int avg = tot/3; 
			sar[i] = new Student(Integer.parseInt(values[0]),values[1],kor,eng,mat,tot,avg);		
		}
		return sar;
	}
	
	public void printConsole(Student[] sr) {
		int korSum = 0, engSum = 0, matSum =0;
		for(int i = 0; i < sr.length; i++) {
			korSum += sr[i].getKor();
			engSum += sr[i].getEng();
			matSum += sr[i].getMat();
		}
		System.out.println("국어 합계 : " +korSum);
		System.out.println("영어 합계 : " +engSum);
		System.out.println("수학 합계 : " + matSum);
		System.out.println("수학 평균 : " + korSum/sr.length);
		System.out.println("영어 평균 : " + engSum/sr.length);
		System.out.println("수학 평균 : " + matSum/sr.length);
	}
	
	public static void main(String[] args) {
		// 컬렉션실습문제4
		TestProperties test = new TestProperties();
		Student[] sr = test.readFile();
		test.printConsole(sr);
		
	}
}
