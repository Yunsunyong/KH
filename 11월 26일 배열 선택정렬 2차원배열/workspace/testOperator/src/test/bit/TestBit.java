package test.bit;

import java.util.Scanner;

public class TestBit {
	//멤버변수 : Filed
	private Scanner sc = new Scanner(System.in);
		
	//비트 출력용
	public void printBit(int num) {
		System.out.print(num + " : ");
		for(int k = 31; k>=0; k--){
			System.out.print(num >> k & 1); //
		}
		System.out.println();
		return; //자기를 실행 시키는 곳으로 되돌아감
	}
		
	//~(tield) 연산자 테스트용
	public void tieldExample() {
		System.out.print("정수 하나 입력 : ");
		int value = sc.nextInt();
				
		printBit(value); //같은 클래스 내에 메소드가 static이 아닌 경우 그냥 호출하면됨.
		printBit(~value);
		printBit(~value + 1);
	}
	
	//shift 연산자 테스트용
	public void leftShiftExample() {
		System.out.print("정수 하나 입력 : ");
		int value = sc.nextInt();
		System.out.print("이동할 칸수 입력 : ");
		int move = sc.nextInt();

		printBit(value);
		printBit(value << move);
	}
	
	//shift 연산자 테스트용
	public void rightShiftExample() {
		System.out.print("정수 하나 입력 : ");
		int value = sc.nextInt();
		System.out.print("이동할 칸수 입력 : ");
		int move = sc.nextInt();

		printBit(value);
		printBit(value >> move); // 양수면 0을 채우고 음수면 1을 채움
	}
	
	//shift 연산자 테스트용
	public void rightShiftExample2() {
		System.out.print("정수 하나 입력 : ");
		int value = sc.nextInt();
		System.out.print("이동할 칸수 입력 : ");
		int move = sc.nextInt();

		printBit(value);
		printBit(value >>> move); //양수 음수 상관없이 무조건 0을 채움
	}
	
	public void bitAndExample() {
		System.out.print("첫번째 정수 : ");
		int first = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int second = sc.nextInt();
		
		printBit(first);
		printBit(second);
		System.out.println("~~~~~~~~~~~~");
		printBit(first & second);
		
	}
	
	public void bitOrExample() {
		System.out.print("첫번째 정수 : ");
		int first = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int second = sc.nextInt();
		
		printBit(first);
		printBit(second);
		System.out.println("~~~~~~~~~~~~");
		printBit(first | second);
		
	}
	
	//비트논리연산자 테스트용
	public void bitXorExample() {
		System.out.print("첫번째 정수 : ");
		int first = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int second = sc.nextInt();
		
		printBit(first);
		printBit(second);
		System.out.println("~~~~~~~~~~~~");
		printBit(first ^ second);
		
	}
	
	public static void main(String[] args) {
		// 비트연산자 테스트
		TestBit test = new TestBit();
		//test.tieldExample();
		//test.leftShiftExample();
		//test.rightShiftExample();
		//test.rightShiftExample2();
		//test.bitAndExample();
		//test.bitOrExample();
		test.bitXorExample();
	}

}
