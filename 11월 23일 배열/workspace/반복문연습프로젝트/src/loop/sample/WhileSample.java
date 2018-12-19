package loop.sample;

import java.util.Random;
import java.util.Scanner;

public class WhileSample {
	//문자열을 입력받아 글자갯수를 출력
	//반복수행됨.
	//"exit"가 입력되면 반복종료됨.
	
	public void testWhile1() {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print("문자열 입력 : ");
		str = sc.nextLine();
		while(!str.equals("exit")) {
			System.out.println("글자갯수 : " +str.length());
			System.out.print("문자열 입력 : ");
			str = sc.nextLine();
		}
		System.out.println("입력종료");
		
	}
	
	//반복할 내용 : 
	//정수를 하나 입력받아, 누적합계 구함
	//종료 조건 : 0이 입력되면 끝남
	public void testWhile2() {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		/*int no = sc.nextInt();
		while(no!=0) {*/
		int no;
		while((no=sc.nextInt()) !=0) {
			sum+=no;
			System.out.print("정수 입력 : ");
			//no = sc.nextInt();
			
		}
		System.out.println("입력된 수의 총합 : "+sum);
	}
	
	//1~100사이의 임의의 정수 발생
	//java.util.Random 사용
	//반복할 내용 : 
	//정수를 입력받아서 난수와 같지 않으면 
	//다시 수를 입력받아서 비교
	//난수와 입력값이 일치하면 반복 종료
	public void testWhile3() {
		int rnum = new Random().nextInt(100) +1;
		System.out.println("숫자를 알아맞춰보시오. ");
		System.out.print("숫자 입력 : ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		while(no!=rnum) {
			System.out.println("틀렸습니다. 다시!");
			if(rnum>no)
				System.out.println(no + "보다 큽니다.");
			else if(rnum<no)
				System.out.println(no + "보다 작습니다.");
			System.out.print("숫자는? : ");
			no = sc.nextInt();
		}
		System.out.println("빙고! 맞췄습니다");
		
		
	}
	
	public void testWhile11() {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print("문자열 입력 : ");
		/*str = sc.nextLine();
		while(!str.equals("exit")) {*/
		while(!(str = sc.nextLine()).equals("exit")) { 
			//!sc.nextLine().equals("exit") exit가 맞는지 확인
			//str.length() 를 사용하기 위해(str = sc.nextLine()).equals("exit")
			System.out.println("글자갯수 : " +str.length());
			System.out.print("문자열 입력 : ");
			//str = sc.nextLine();
		}
		System.out.println("입력종료");
		
	}
}
