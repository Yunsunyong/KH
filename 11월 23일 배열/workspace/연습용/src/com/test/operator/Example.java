package com.test.operator;
import java.util.*;


public class Example {
	public void sample1() {
		
		Scanner sc = new Scanner(System.in);
		
		int kor = sc.nextInt();
		
		int eng = sc.nextInt();
		int math = sc.nextInt();
		int sum = kor+eng+math;
		double avg = sum/3;
		
		if(kor>=40 && eng >=40 && math >=40 || avg>=60)
			System.out.println("합격");
		else
			System.out.println("불합격");
				
	}
	public void sample2() {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int year = sc.nextInt();
		int cla = sc.nextInt();
		int num = sc.nextInt();
		char gender = sc.next().charAt(0);
		double grade = sc.nextDouble();
		
		if(gender == 'M')
			System.out.println(year+"학년"+cla+"반"+num+"번 남학생 "+name+"은 "+"성적이 "+grade+"이다.");
		else
			System.out.println(year+"학년"+cla+"반"+num+"번 여학생 "+name+"은 "+"성적이 "+grade+"이다.");
	}
	
	public void sample3() {
		int a = new Scanner(System.in).nextInt();
		if(a>0)
			System.out.println("양수다");
		else
			System.out.println("양수가 아니다");
	}
	
	public void sample4() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b;
		
		if(a%2 == 0)
			b="짝수다";
			
		else 
			b="홀수다";
		
		System.out.println(b);
	
		
	}
}
