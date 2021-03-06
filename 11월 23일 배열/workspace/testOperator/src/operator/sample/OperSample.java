package operator.sample;



public class OperSample {
	//연산자 : 계산에 사용되는 기호문자
	//operand(피연산자) : 계산에 사용되는 값
	
	public void testRank1() {
		//최우선 연산자 테스트
		//() 괄호연산자, [] 배열연산자
		System.out.println("결과 1 : " + (2 + 3 * 5));
		System.out.println("결과 2 : " + ((2 + 3) * 5));
		
		String[] array = {"java", "oracle", "jdbc", "html5"};
		System.out.println("0번째 : "+array[0]);
		System.out.println("1번째 : "+array[1]);
		System.out.println("2번째 : "+array[2]);
		System.out.println("3번째 : "+array[3]);
		
	}
	
	public void testRank2() {
			//2순위 : 단항연산자
			//연산자가 필요로 하는 값이 한 개임
			//+, - (부호연산자)
			//! (논리부정연산자)
			//++, -- (1증가, 1감소 연산자)
			//(바꾸고자 원하는 자료형)값 : cast 연산자
			//~(tield, 비트반전연산자)
			int num = -12;
			System.out.println("num : " +num);
			System.out.println("+num : " + +num);
			System.out.println("-num : " + -num);
			
			boolean flag = false;
			System.out.println("flag : " + flag);
			System.out.println("flag : " + !flag);
			
			int code = 120;
			System.out.println("code : " + code);
			System.out.println("문자 확인 : " + (char)code);
			
			char ch = 'a';
			System.out.println("ch : " + ch);
			System.out.println("유니코드값 : "+ (int)ch);
			
		}
		
	public void testOneIncDec() {
		//++ : 1증가 연산자
		//-- : 1감소 연산자
		
		//증감연산자가 변수와 함께 단독 사용시
		//변수 앞/뒤 위치 구분 안 함
		//변수++;  또는 ++변수;
		//변수--; 또는 --변수;
		int num = 10;
		System.out.println("num : " +num); //10
		
		++num; //num = num +1;
		System.out.println("num : " +num); //11
		num++;
		System.out.println("num : " +num); //12
		
		--num; //num = num-1;
		System.out.println("num : " +num); //11
		num--; 
		System.out.println("num : " +num); //10
		
		//계산식이나 문장의 일부분으로 사용될 경우
		//변수 앞과 뒤 위치 구분함
		//계산식 변수++ : 선처리 후증가
		//계산식 ++변수 : 선증가 후처리
		
		num = 10;
		int result = (2 + 3) * num++;
		System.out.println("result : " + result);
		System.out.println("num : " + num);
		
		num = 10;
		int result1 = (2 + 3) * ++num;
		System.out.println("result1 : " + result1);
		System.out.println("num : " + num);
		
		num = 10;
		System.out.println("num : " + num++);
		System.out.println("num : " + num);
	}

	public void testRank34() {
		//산술연산자
		//3순위 : *, /(몫), %(나머지, mod)
		//4순위 : +, -
		int first = 34;
		int second = 5;
		
		System.out.println(first + "+" + second + "=" + (first+second));
		
		System.out.println(first + "-" + second + "=" + (first-second));
		
		System.out.println(first + "*" + second + "=" + (first*second));
		
		System.out.println(first + "/" + second + "=" + (first/second));
		
		System.out.println(first + "%" + second + "=" + (first%second));
		
		//주의사항 : 컴퓨터는 0 나누기 못 함
		System.out.println("12 / 0 =" + (12 / 0));
	}

	public void testRank67() {
		//비교연산자
		//두 값의 대소(크고 작은) 차이를 비교
		//결과값이 맞다(true), 틀렸다(false)
		//6순위 : 
		//값1 > 값2 (값1이 값2보다 크냐?)
		//값1 < 값2 (값1이 값2보다 작으냐?)
		//값1 >= 값2 (값1이 값2보다 크거나 같으냐?)
		//값1 <= 값2 (값1이 값2보다 작거나 같으냐?)
		//7순위 : 
		//값1 == 값2 (값1과 값2가 같으냐?)
		//값1 != 값2 (값1과 값2가 같지 않느냐?)
		int first = 12;
		int second =5;
		
		System.out.println("12>5 =" + (12 > 5)); //true
		System.out.println("12<5 =" + (12 < 5)); //false
		System.out.println("12>=5 =" + (12 >= 5)); //true
		System.out.println("12<=5 =" + (12 <= 5)); // false
		System.out.println("12==5 =" + (12 == 5)); //false
		System.out.println("12!=5 =" + (12 != 5)); //true
	}

	public void testLogical() {
		//일반논리연산자 : &&, ||
		
		System.out.println("true && true : " + (true && true));	//true
		System.out.println("true && false : " + (true && false)); //false
		System.out.println("false && true : " + (false && true)); //false
		System.out.println("false && false : " + (false && false)); //false
		
		System.out.println("true || true : " + (true || true));  //true
		System.out.println("true || false : " + (true || false)); //true
		System.out.println("false || true : " + (false || true)); //true
		System.out.println("false || false : " + (false || false)); //false
	}

	public void testRank13() {
		//삼항연산자
		//변수 = 조건표현식? 값1 : 값2
		//조건의 결과가 true이면 값1을 선택
		//조건의 결과가 false이면 값2를 선택
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		//양수냐? => num >0?
		//0이냐? => num == 0?
		//음수냐? => num <0?
		//0이 아니냐?  => num != 0?
		
		//입력된 정수의 절대값을 구해서
		//출력 처리함
		//정수의 절대값 : 양수, 0 그대로임
		// 음수는 양수가 됨
		
		int abs = num < 0? -num: num;
		System.out.println(num + "의 절대값 :" + abs);
	
		
				
	}

}

