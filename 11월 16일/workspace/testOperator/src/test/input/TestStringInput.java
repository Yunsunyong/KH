package test.input;

import java.util.Scanner;

public class TestStringInput {
	//멤버변수 : Field
	private Scanner sc = new Scanner(System.in);
	//private을 붙여야 캡슐화 가능
	
	public void testNextLine1() {
		//nextLine() : 공백이 포함된 문자열 입력
		//next() : 공백 입력 못 받음
		System.out.print("문자열 입력: ");
		
//		String str = sc.next();
		String str = sc.nextLine();
		System.out.println("str : " + str);
		
	}
	
	public void testNextLine2() {
		System.out.print("공백 없는 문자열 입력 : ");
		String s1 = sc.next();
		System.out.print("공백 있는 문자열 입력 : ");
		sc.nextLine(); // 버퍼에 남아있는 값을 지움
		//sc.nextLine()없이 그냥 쓰면 엔터가 버퍼에 남아있음
		String s2 = sc.nextLine();  
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
	}
	public void testNextLine3() {
		System.out.print("문자열 입력 : ");
		String s1 = sc.nextLine();
		System.out.print("문자열 입력 : ");
		String s2 = sc.nextLine();
		
		System.out.println("s1 : " +s1);
		System.out.println("s2 : " +s2);
	}
	
	public static void main(String[] args) {
		//문자열 입력 테스트
		TestStringInput test = new TestStringInput();
		//test.testNextLine1();
		test.testNextLine2();
		//test.testNextLine3();
	}

}
