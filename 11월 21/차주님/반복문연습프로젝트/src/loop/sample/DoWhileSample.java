package loop.sample;

import java.util.Scanner;

public class DoWhileSample {

	//화면에 메뉴를 출력하고
	//메뉴번호를 입력받아 
	//번호에 따라 기능이 작동되게 처리
	//번호가 7이면 반복 종료됨
	public void testDoWhile1() {
		Scanner sc = new Scanner(System.in);
		int menuNo;
		
		do {
			System.out.println("*** 주문메뉴 ***");
			System.out.println();
			System.out.println("1. 추가");
			System.out.println("2. 수정");
			System.out.println("3. 조회");
			System.out.println("4. 삭제");
			System.out.println("5. 출력");
			System.out.println("7. 종료");
			System.out.print("번호 선택 : ");
			menuNo = sc.nextInt();
			
			switch(menuNo) {
			case 1:	System.out.println("추가되었습니다.");
					break;
			case 2:	System.out.println("수정되었습니다.");
					break;
			case 3:	System.out.println("조회되었습니다.");
					break;
			case 4:	System.out.println("삭제되었습니다.");
					break;
			case 5:	System.out.println("출력되었습니다.");
					break;
			case 7:	System.out.println("종료합니다.");
					break;
			default:	System.out.println("잘못 입력하였습니다.");
					System.out.println("다시 입력하십시요.");
			}
		}while(menuNo != 7);
	}
	
	//반복문 실습문제 3
	public void testDoWhile2() {
		Scanner sc = new Scanner(System.in);
		
		int menuNo, account = 0, price = 0;
		int totalPrice = 0;
		String orderItem = "", orderList = "";
		
		do {
			System.out.println("*** 메뉴를 선택하세요 ***");
			System.out.println();
			System.out.println("햄버거 ***************");
			System.out.println("1. 불고기버거	3500원");
			System.out.println("2. 치킨버거	    3200원");
			System.out.println("추가 ****************");
			System.out.println("3. 감자튀김	    1000원");
			System.out.println("4. 치즈스틱	    400원");
			System.out.println("5. 샐러드		2000원");
			System.out.println("음료수 ***************");
			System.out.println("6. 콜라		700원");
			System.out.println("7. 에이드		1200원");
			System.out.println("8. 커피		1000원");
			System.out.println("********************");
			System.out.print("메뉴 선택 : ");
			menuNo = sc.nextInt();

			switch (menuNo) {
			case 1:
				orderItem = "불고기버거";
				price = 3500;
				break;
			case 2:
				orderItem = "치킨버거";
				price = 3200;
				break;
			case 3:
				orderItem = "감자튀김";
				price = 1000;
				break;
			case 4:
				orderItem = "치즈스틱";
				price = 400;
				break;
			case 5:
				orderItem = "샐러드";
				price = 2000;
				break;
			case 6:
				orderItem = "콜라";
				price = 700;
				break;
			case 7:
				orderItem = "에이드";
				price = 1200;
				break;
			case 8:
				orderItem = "커피";
				price = 1000;
				break;			
			} // switch closed
			
			System.out.println(orderItem + 
					"를 선택하셨습니다.");
			System.out.print("수량은 ? ");
			account = sc.nextInt();
			System.out.println(account + 
					"개 주문하셨습니다.");

			// ** 계산된 가격은 계속 저장되어 있음 **
			int total = price * account; // 계산 처리됨
			orderList += orderItem + " : " + 
					account + "개 - " + total 
					+ "원 \n";
			totalPrice += total; // 주문한 가격 합산 처리

			System.out.print("추가 주문하시겠습니까?(y/n) : "); 
			// y 입력시 메뉴화면 반복실행됨			
		} while (sc.next().toUpperCase().charAt(0) == 'Y');

		System.out.println("* 주문하신 정보는 다음과 같습니다. *");
		System.out.println("-----------------------------------------------");
		System.out.print(orderList);
		System.out.println("------------------------------------------------");
		System.out.println("총 가격 : " + totalPrice + "원");
	}
	
	//문자 하나 입력받아, 유니코드 출력
	//반복 실행함
	//'0' 문자 입력되면, 반복 종료
	public void testDoWhile3() {
		Scanner sc = new Scanner(System.in);
		char ch;
		
		do {
			System.out.print("문자 하나 입력 : ");
			ch = sc.next().charAt(0);
			
			System.out.println(ch + 
					" is unicode " + (int)ch);
		}while(ch != '0');
	}
	
	//문자열 입력받고, 기호문자 하나 입력받아
	//문자열의 글자 사이사이에 기호문자를
	//끼워넣어 출력되게 do~while 사용
	//예> apple, - => a-p-p-l-e
	public void testDoWhile4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		System.out.print("기호문자 : ");
		char symbol = sc.next().charAt(0);
		
		int index = 0;
		do {
			if(index < str.length() - 1)
				System.out.print(str.charAt(index) 
					+ "" + symbol);
			else
				System.out.print(str.charAt(index));
			
			index++;
		}while(index < str.length());
		
		System.out.println();
	}
	
	public void testDoWhile4for() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		System.out.print("기호문자 : ");
		char symbol = sc.next().charAt(0);
		
		/*int index = 0;
		do {
			if(index < str.length() - 1)
				System.out.print(str.charAt(index) 
					+ "" + symbol);
			else
				System.out.print(str.charAt(index));
			
			index++;
		}while(index < str.length());*/
		
		for(int index = 0; index < str.length(); index++) {
			if(index < str.length() - 1)
				System.out.print(str.charAt(index) 
					+ "" + symbol);
			else
				System.out.print(str.charAt(index));
		}
		
		System.out.println();
	}
	
	public void testDoWhile4while() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		System.out.print("기호문자 : ");
		char symbol = sc.next().charAt(0);
		
		/*int index = 0;
		do {
			if(index < str.length() - 1)
				System.out.print(str.charAt(index) 
					+ "" + symbol);
			else
				System.out.print(str.charAt(index));
			
			index++;
		}while(index < str.length());*/
		
		int index = 0;
		while(index < str.length()) {
			if(index < str.length() - 1)
				System.out.print(str.charAt(index) 
					+ "" + symbol);
			else
				System.out.print(str.charAt(index));
			
			index++;
		}
		
		System.out.println();
	}
}










