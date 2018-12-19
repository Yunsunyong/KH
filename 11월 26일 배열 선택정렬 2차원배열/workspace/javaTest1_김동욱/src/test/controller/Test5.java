package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개를 입력받아 각각 1~9까지 정수일 떄 두수의 곱이 한자리 수인지 \n두 자리 수인지 확인하는 프로그램입니다.");
		System.out.print("정수 하나 입력 : ");
		int num1 = sc.nextInt();
		if(num1<1 || num1>9) {
			System.out.println("1~9 정수만 입력하세요. 종료합니다.");
			return;
		}
		System.out.print("다른 정수 입력 : ");
		int num2 = sc.nextInt();
		if(num2<1 || num2>9) {
			System.out.println("1~9 정수만 입력하세요. 종료합니다.");
			return;
		}
		if((num1*num2)>=10)
			System.out.println("두자리 수 입니다.");
		else
			System.out.println("한자리 수 입니다.");
	}

}
