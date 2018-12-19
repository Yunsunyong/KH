package controll.sample;

import java.util.Scanner;

public class SwitchSample {
	public void testSwitch1() {
		
		System.out.print("색 입력: ");
		String color  = new Scanner(System.in).next();
		
		//값이 뭐냐? (값이 비교값과 일치하는지
		//주로 변수가 계산식 사용함
		//조건식 사용 못함
		switch(color) {
		//jdk 7 부터 case 에 문자열값 제시 가능함
		case "red":	System.out.println("빨강");
				 		break;
		case "yellow": System.out.println("노랑");
						break;
		case "green": System.out.println("초록");
		    			break;
		case "blue": System.out.println("파랑");
						break;
		default:	//위에 제시된 모든 값이 아닐 때
			//맨 마지막에 사용함, 생략할 수도 있음
			System.out.println("기타");
		}
	}
	
	/*점수(int)를 입력받아 
	 * 학점(char) 처리해서
	 * 점수와 학점 출력 처리
	 * switch 사용 점수별 학점처리
	 * 점수가 100이면 학점은 'A'
	 * 점수가 90이상 100미만은 'B'
	 * 점수가 80이상 90미만은 'C'
	 * 점수가 70이상 80미만은 'D'
	 * 점수가 60이상 70미만은 'E'
	 * 점수가 60미만은 'F' 처리함
	 */
	public void testSwitch2() {
		int score = new Scanner(System.in).nextInt();
		char grade;
		switch(score/10) {
		case 10: grade = 'A'; break;
		case 9: grade = 'B'; break;
		case 8: grade = 'C'; break;
		case 7: grade = 'D'; break;
		case 6: grade = 'E'; break;
		default: grade = 'F'; break;
		}
		System.out.println(grade);
	}
	
	public void testSwitch3() {
		System.out.print("찬성이면 Y/y, 반대이면 N/n : ");
		/*char answer = new Scanner(System.in).next().charAt(0);
		
		if(answer == 'y' ||answer == 'Y')
			System.out.println("찬성하였습니다.");
		else if(answer == 'n' || answer =='N')
			System.out.println("반대입니다.");
		else System.out.println("기권입니다.");*/
		char answer = new Scanner(System.in).next().toUpperCase().charAt(0);
		
		switch(answer) {
		case 'Y': System.out.println("찬성하였습니다."); break;
		case 'N': System.out.println("반대하였습니다."); break;
		default : System.out.println("기권입니다.");
		
		}
	}
	
	public void testSwitch4() {
		System.out.print("화면에 출력함\r\n" + 
				"		*** 초기 메뉴 ***\r\n" + 
				"		1. 입력\r\n" + 
				"		2. 수정\r\n" + 
				"		3. 조회\r\n" + 
				"		4. 삭제\r\n" + 
				"		7. 종료\r\n" + 
				"		메뉴번호 입력 :");
		int menuNo = new Scanner(System.in).nextInt();
		switch(menuNo) {
		case 1: System.out.println("입력메뉴가 선택되었습니다."); break;
		case 2: System.out.println("수정메뉴가 선택되었습니다."); break;
		case 3: System.out.println("조회메뉴가 선택되었습니다."); break;
		case 4: System.out.println("삭제메뉴가 선택되었습니다."); break;
		case 7: System.out.println("프로그램이 종료되었습니다.");
					System.exit(0);
					//static 메소드일 경우 new System 안하고 바로 클래스명.메소드명();
					//return;//실행위치(Main)로 돌아 가라
		default : System.out.println("번호가 잘못 입력되었습니다."); 
					System.out.println("다시 입력하십시오");
		}
		return;
	}
	
	//과제 텍스트파일에서 과제4
	public void testSwitch5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int first = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int second = sc.nextInt();
		System.out.print("연산문자 : ");
		char operator = sc.next().charAt(0);
		int result=0;;
		switch(operator) {
		case '+': result=first+second; break;
		case '-': result=first-second; break;
		case 'x': result=first*second; break;
		case '/': if(second==0) {
					System.out.println("0으로 나눌 수 없습니다.");
						result=0;
					}
					else {
						result=first/second;
					break;
					}
		case '%': if(second==0) {
						System.out.println("0으로 나눌 수 없습니다.");
						result = 0;
					}
					else {
						result = first % second;
					}
					break;
		default: System.out.println("사용할 수 없는 연산자");
				result = 0;
						
						
					
		}
		System.out.println(first+" "+ operator+" "+second +" = "+result);
		
	}

	
	/*과일명을 입력받아
	 * 과일의 가격을 price 변수에 기록하고,
	 * 갯수 입력받아서 구매가격을 계산 출력
	 * 사과 1200
	 * 오렌지 650
	 * 배    3000
	 * 포도 12000
	 * 키위 350
	 * 
	 * */
	public void testSwitch6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구입할 과일 : ");
		String fruit = sc.next();
		System.out.print("갯수 입력 : ");
		int amount = sc.nextInt();
		int price = 0;
		switch(fruit){
		case "사과": price = 1200; break;
		case "오렌지": price=650; break;
		case "배": price =3000; break;
		case "포도": price = 12000;break;
		case "키위": price = 350; break;
		default : System.out.println("잘못입력하셨습니다.");return;
		}
	
		int total = price*amount;
		System.out.println(fruit+" "+price+"원 "+amount+" 개 ");
		System.out.println("총 구매 가격 : "+total+"원");
				
	}

}
