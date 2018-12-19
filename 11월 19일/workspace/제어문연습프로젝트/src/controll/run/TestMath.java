package controll.run;

import java.util.Random;

public class TestMath {

	public static void main(String[] args) {
		// Math 클래스 멤버 테스트
		/*System.out.println("Math.E : "+ Math.E);
		System.out.println("Math.PI : "+ Math.PI);
		System.out.println("random : " + Math.random());*/
		
		//1~10사이의 임의의 정수
		//(int)(난수 * 10) + 1
		//원하는 범위 사이의 임의의 정수
		//(int)(난수 * (끝값 - 시작값 + 1)) + 시작값
		double random = Math.random();
		System.out.println("random : " + random);
		int num1 = (int)(random * 10) + 1;
		System.out.println("1 ~ 10 : " + num1);
		
		int num2 = (int)(random * 100) + 1;
		System.out.println("1 ~ 100 : " + num2);
		
		int lottoNumber = (int)(random * 45) + 1;
		System.out.println("1 ~ 45 : " + lottoNumber);
		
		//51 ~ 80 사이의 난수
		int num3 = (int)(random * 30) + 51;
		System.out.println("51 ~ 80 : " + num3);
		
		//java.util.Random 클래스 사용시
		Random ref = new Random();
		System.out.println("1 ~  100 : " + (ref.nextInt(100) + 1));
		//ref.nextInt(100) //0~99까지의 정수 랜덤

	}

}
