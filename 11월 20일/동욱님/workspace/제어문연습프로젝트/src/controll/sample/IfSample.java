package controll.sample;

import java.util.*;

public class IfSample {
	//if만 사용하는 경우
	private Scanner sc = new Scanner(System.in);
	
	public void unicodeToChar() {
		//정수를 입력받아서 
		//정수를 유니코드로 하는 문자 출력
		//유니코드 : 0 ~ 65535
		System.out.print("유니코드 입력 : ");
		int code = sc.nextInt();
		
		if(code>=0 && code<=65535) {
			System.out.println(code + " -> " + (char)code);
		} // if close
						
	}
	public void unicodeToChar2() {
		//정수를 입력받아서 
		//정수를 유니코드로 하는 문자 출력
		//유니코드 : 0 ~ 65535
		System.out.print("유니코드 입력 : ");
		int code = sc.nextInt();
		
		if(code>=0 && code<=65535) {
			System.out.println(code + " -> " + (char)code);
		} // if close
		else
			System.out.println("0~65535 사이의 값을 입력하세요.");
	}
	
	//실습1
	public void ifExample1() {
		/* 성별(남:M/여:F)을 입력받아
		 * 남자일 때만 이름과 나이를
		 * 키보드로 입력 받아서 출력 처리
		 * 
		 * 	*/
		System.out.print("성별 입력 (M/F)  : ");
		/*내가 한거
		 * char gender = sc.next().toUpperCase().charAt(0);
		if(gender=='M') {
			System.out.print("이름 입력 : ");
			String name = sc.next();
			System.out.print("나이 입력 : ");
			int age = sc.nextInt();
			System.out.println(name+" "+age+"세 입니다.");
		}*/
		
		//char gender = sc.next().charAt(0);
		//char gender = sc.next().toUpperCase().charAt(0);
		String value = sc.next();
		String upperValue = value.toUpperCase();
		char gender = upperValue.charAt(0);
		
		if(gender == 'M'){
			System.out.print("이름 : ");
			sc.nextLine();//입력 건너뛰는 문구 버퍼 내 싹 비워버림
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.println(name+", " + age+" ");
		}
	}
	
	//실습2
	public void ifExample2() {
		/*문자를 하나 입력받아
		 *영어 대문자일 때만
		 *소문자로 바꾸어 출력 처리
		 */
		System.out.print("문자 하나 입력 : "); 
		char ch = sc.next().charAt(0);
		//if(ch>='A' && ch<='Z') {
		if(Character.isUpperCase(ch)) {  //java.lang.Character api에 method에 있음.
												//static 메소드 호출시 클래스명.메소드명();
			ch += 32;
			System.out.println(ch);
			//System.out.println((char)(ch+32)); //내가 한거
		}
	}
	//실습3
	public void ifExample3() {
		/*나이를 입력받아
		 * 성인(20세 이상)일 때만
		 * "등록하세요." 출력 처리
		 */
		System.out.print("나이 입력 : ");
		/*int age = sc.nextInt();
		if(age>=20) {
			System.out.println("등록하세요.");
		}*/
		if(sc.nextInt() >= 20) {
			System.out.println("등록하세요");
		}
	}
	
	//실습4
	public void ifExample4(){
		/*두 개의 정수를 입력받아
		 * 둘 다 양수일 때만
		 * 두 수의 더하기, 빼기, 곱하기
		 * 나누기한 몫, 나머지 출력
		 */
		System.out.print("정수 하나 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("다른 정수 입력 : ");
		int num2 = sc.nextInt();
		//if(num1>0 && num2>0) {
		if(num1 > 0) {
			if(num2 > 0) {
			System.out.println("두 수의 더하기 : "+(num1+num2));
			System.out.println("두 수의 빼기 : "+(num1-num2));
			System.out.println("두 수의 곱하기 : "+(num1*num2));
			System.out.println("나누기한 몫 : "+(num1/num2));
			System.out.println("나머지 출력 : "+(num1%num2));
			} // 안쪽 if close
		} // 바깥 if close
	}
		
	//실습5
	public void ifElseExample1() {
		/* 두 개의 정수를 입력받아
		 * 두 수가 한 자리 정수일 때만 
		 * 두 수의 산술연산을 계산 출력하고
		 * 조건을 만족하지 않으면
		 * "한자리 정수로만 입력하여야 합니다."
		 *  출력되게 함
		 */
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
//		if((num1>=-9&&num1<=9)&&(num2>=-9&&num2<=9){
		//내가한거 if(num1<10 && num2<10 &&num1>-10 &&num2>-10){
		if((num1>-10&&num1<10)&&(num2>-10&&num2<10)){
				System.out.println("두 수의 더하기 : "+(num1+num2));
				System.out.println("두 수의 빼기 : "+(num1-num2));
				System.out.println("두 수의 곱하기 : "+(num1*num2));
				System.out.println("나누기한 몫 : "+(num1/num2));
				System.out.println("나머지 출력 : "+(num1%num2));
		}
		else {
			System.out.println("한자리 정수로만 입력하여야 합니다.");
		}
	}

	//실습6 제어문실습문제1
	public void ifElseExample2() {
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		int sum = kor+eng+math;
		int avg = sum/3;
		if(kor>=40&&eng>=40&&math>=40&&avg>=60) {
			System.out.println("합격");
			System.out.println("국어점수 : "+kor+" 영어 점수 : "+eng+" 수학 점수 : "+math+" 합계 : "+sum+" 평균 : "+avg);
		}
		else {
			System.out.println("불합격");
	
		}
	}
	//실습7 제어문 실습문제2
	public void ifElseExample3() {
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("키 입력 : ");
		double height = sc.nextDouble();
		if(name!=null && name.length()>0 && age>0 && height >0.0) {
			System.out.println("이름 : "+name);
			System.out.println("나이 : "+age);
			System.out.println("키 : "+height);
			System.out.println("확인 : " +name+"의 나이는 "+age+"세이고, 키는 " +height+" cm 이다.");
		}
		else
			System.out.println("잘못");
	}
}
