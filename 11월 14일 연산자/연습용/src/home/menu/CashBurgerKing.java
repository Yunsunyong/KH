package home.menu;
import java.util.*;


public class CashBurgerKing {
	public void selectMenu() {
		
	
		System.out.printf("*** 메뉴를 선택하세요 ***\r\n" + 
			"\r\n" + 
			"	햄버거 ***************\r\n" + 
			"	1. 불고기버거	3500원\r\n" + 
			"	2. 치킨버거	3200원\r\n" + 
			"	추가 ****************\r\n" + 
			"	3. 감자튀김	1000원\r\n" + 
			"	4. 치즈스틱	400원\r\n" + 
			"	5. 샐러드		2000원\r\n" + 
			"	음료수 ***************\r\n" + 
			"	6. 콜라		700원\r\n" + 
			"	7. 에이드		1200원\r\n" + 
			"	8. 커피		1000원\r\n" + 
			"	********************\r\n" + 
			"	메뉴 선택 :");
		
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt(); //메뉴
		int b = 0; //가격
		String c; //메뉴 이름
		switch(a) {
				case 1:
					b=3500;
					c="불고기버거";
					break;
				case 2:
					b= 3200;
					c="치킨버거";
					break;
				case 3:
					b=1000;
					c="감자튀김";
					break;
				case 4:
					b=400;
					c="치즈스틱";
					break;
				case 5:
					b=2000;
					c="샐러드";
					break;
				case 6:
					b=700;
					c="콜라";
					break;
				case 7:
					b=1200;
					c="에이드";
					break;
				case 8:
					b=1000;
					c="커피";
					break;
		}
			
		System.out.print("수량은 ? ");
		int d = sc.nextInt(); //갯수
		System.out.println(a+"개 주문하셨습니다.");
		
		int sum = b*d; //주문 값
		int sum1 = sum; //추가주문 값
		System.out.print("추가 주문하시겠습니까?(y/n): ");
		char e=sc.next().charAt(0);
	
		//추가주문은 dowhile문 쓰면될듯
	
	
	}
}
