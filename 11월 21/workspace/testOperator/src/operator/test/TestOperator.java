package operator.test;

import operator.sample.OperSample;
import type.test.*;

public class TestOperator {
	/*public static void main(String[] args) {
		//연산자(operator) 테스트
		OperSample osamp = new OperSample();
		//osamp.testRank1();
		//osamp.testRank2();
		//osamp.testOneIncDec();
		//osamp.testRank34();
		//osamp.testRank67();
		//osamp.testLogical();
		//osamp.testRank13();
		TestPosition test = new TestPosition();
		test.testLogical2();
	}*/
	
	public static void main(String[] args) {
		//복합대입연산자
		//대입연산자와 이항연사자를 합친 연산자
		//연산자= 로 표현함
		//산술대입연산자
		//+=, -=,.*=, /=,%=
		//쉬프트대입연산자
		//<<= , >>= , >>>=
		//비트논리대입연산자
		//&=, ^=,|=
		//연산처리 속도가 빠르므로 사용 권장함
		//메모리 변수값에 직접 연산함
		
	/*	int num = 123;
		System.out.println("num : "+ num);
		num++; //1증가만 됨
		num--; //1감소만 됨
		num = num + 10;
		System.out.println("num + 10 : "+ num);
		num+=10; // 처리속도가 빠름
		System.out.println("num += 10 : "+ num);
		
		num-=7; //num= num-7;
		System.out.println("num -= 7  "+ num);
		num*=3;//num = num *3;
		System.out.println("num *=3 "+ num);
		num /=2; // num = num/2;
		System.out.println("num /=2 "+ num);
		num%=2;//num = num%2;
		System.out.println("num %=2 "+ num);*/
		
		/*int num = 45;
		System.out.println("num : " + num);
		num >>=2; // num = num >>2;
		System.out.println("num : " + num);
		
		num<<=2;//num = num<<2;
		System.out.println("num : " + num);
		
		num>>>=3; //num = num>>>3;
		System.out.println("num : " + num);
		
		num&=12; //num = num&12;
		System.out.println("num : " + num);
		
		num ^=5; // num = num^5;
		System.out.println("num : " + num);
		num |=23; // num = num | 23;
		System.out.println("num : " + num);*/
		
		//나열연산자(15순위)
		/*int first = 12;
		int second = 23;
		int result; */
		
		int first = 12, second = 23, result;
		System.out.println("first : " + first);
		System.out.println("second : " + second);
		result = first + second;
		System.out.println("result : " + result);
		
		int n1 = 100, n2, n3;
		System.out.println("n1 : " + n1);
		n2 = n3 = n1;
		System.out.println("n2 : " + n2);
		System.out.println("n3 : " + n3);		
		
	}
}
